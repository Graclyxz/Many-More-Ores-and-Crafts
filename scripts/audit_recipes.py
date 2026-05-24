#!/usr/bin/env python3
"""Audit recipes for Many-More-Ores-and-Crafts.

For every item the mod registers, check at least one recipe produces it.
Report missing recipes grouped by material, plus orphan recipes that produce
items not in the expected list (useful for spotting stale/duplicate JSONs).

Items intentionally excluded from the "needs recipe" list:
  - <m>_ore     — comes from worldgen

raw_<m> is included because the mod ships reverse recipes (raw_<m>_block → 9 raw_<m>),
so a missing one would actually mean a real gap.

Run from anywhere:
    python scripts/audit_recipes.py
Exit codes:
    0  no missing recipes
    2  one or more items lack a recipe
"""
from __future__ import annotations

import json
import sys
from collections import defaultdict
from pathlib import Path

MOD_ID = "many_more_ores_and_crafts"

REPO = Path(__file__).resolve().parent.parent
RECIPE_DIR = REPO / "common" / "src" / "main" / "resources" / "data" / MOD_ID / "recipe"

# Materials with a complete ore + ingot + tools + armor set.
# Each generates: raw_<m>, <m>_ingot, <m>_nugget, <m>_block, raw_<m>_block + 5 tools + 4 armor.
# (<m>_ore intentionally excluded — worldgen.)
FULL_MATERIALS = [
    "adamantite", "cobalt", "infernal", "lead", "mythril",
    "orichalcum", "palladium", "platinum", "silver", "tin",
    "titanium", "tungsten",
]

# Obsidian ships ingot/nugget/raw + tools/armor like the full set,
# but uses custom obsidian_block + raw_obsidian_block instead of the
# vanilla-style ore. There is no obsidian_ore.
SPECIAL_OBSIDIAN_PARTS = [
    "raw_obsidian", "obsidian_ingot", "obsidian_nugget",
    "obsidian_block", "raw_obsidian_block",
    "obsidian_sword", "obsidian_pickaxe", "obsidian_axe", "obsidian_hoe", "obsidian_shovel",
    "obsidian_helmet", "obsidian_chestplate", "obsidian_leggings", "obsidian_boots",
]

# Tool-only materials. They use a vanilla resource (amethyst_shard / emerald)
# as the ingot equivalent, so no ingot/nugget/block — just tools + armor.
TOOLS_ONLY_MATERIALS = ["amethyst", "emerald"]

TOOLS = ["sword", "pickaxe", "axe", "hoe", "shovel"]
ARMOR = ["helmet", "chestplate", "leggings", "boots"]


def expected_items() -> list[str]:
    items: list[str] = []
    for m in FULL_MATERIALS:
        items.extend([
            f"raw_{m}",
            f"{m}_ingot",
            f"{m}_nugget",
            f"{m}_block",
            f"raw_{m}_block",
        ])
        items.extend(f"{m}_{t}" for t in TOOLS)
        items.extend(f"{m}_{a}" for a in ARMOR)
    items.extend(SPECIAL_OBSIDIAN_PARTS)
    for m in TOOLS_ONLY_MATERIALS:
        items.extend(f"{m}_{t}" for t in TOOLS)
        items.extend(f"{m}_{a}" for a in ARMOR)
    return items


def _flatten_ingredient(value) -> list[str]:
    """Collapse an ingredient field (string, list, or {item|tag} dict) to flat strings."""
    if value is None:
        return []
    if isinstance(value, str):
        return [value]
    if isinstance(value, list):
        out: list[str] = []
        for v in value:
            out.extend(_flatten_ingredient(v))
        return out
    if isinstance(value, dict):
        for k in ("item", "tag", "id"):
            if k in value:
                return [(f"#{value[k]}" if k == "tag" else value[k])]
    return []


def input_fingerprint(recipe: dict) -> frozenset[str]:
    """Canonical set of inputs for a recipe — used to detect actual duplicates."""
    rtype = recipe.get("type", "")
    inputs: list[str] = []
    if rtype in ("minecraft:smelting", "minecraft:blasting", "minecraft:smoking", "minecraft:campfire_cooking"):
        inputs.extend(_flatten_ingredient(recipe.get("ingredient")))
    elif rtype == "minecraft:crafting_shaped":
        for v in (recipe.get("key") or {}).values():
            inputs.extend(_flatten_ingredient(v))
    elif rtype == "minecraft:crafting_shapeless":
        inputs.extend(_flatten_ingredient(recipe.get("ingredients")))
    elif rtype == "minecraft:smithing_transform":
        for k in ("base", "addition", "template"):
            inputs.extend(_flatten_ingredient(recipe.get(k)))
    else:
        # Fall back to the JSON string so unknown types still produce a stable fingerprint.
        inputs.append(json.dumps(recipe, sort_keys=True))
    return frozenset(inputs)


def extract_result_id(recipe: dict) -> str | None:
    """Return the result item id from a recipe JSON, handling known shapes."""
    result = recipe.get("result")
    if result is None:
        return None
    if isinstance(result, str):
        return result
    if isinstance(result, dict):
        for key in ("id", "item"):
            if key in result:
                return result[key]
    return None


def material_of(item: str) -> str:
    """Bucket an item id under a material for grouped output."""
    if item.startswith("raw_"):
        # raw_<m>_block → <m>; raw_<m> → <m>
        rest = item[len("raw_"):]
        return rest.split("_")[0]
    return item.split("_")[0]


def main() -> int:
    if not RECIPE_DIR.is_dir():
        print(f"Recipe directory not found: {RECIPE_DIR}", file=sys.stderr)
        return 1

    expected = expected_items()
    expected_set = set(expected)

    # item -> list of (recipe filename, recipe type, input_fingerprint)
    produced_by: dict[str, list[tuple[str, str, frozenset[str]]]] = defaultdict(list)
    parse_errors: list[tuple[str, str]] = []

    for path in sorted(RECIPE_DIR.glob("*.json")):
        try:
            data = json.loads(path.read_text(encoding="utf-8"))
        except json.JSONDecodeError as exc:
            parse_errors.append((path.name, str(exc)))
            continue
        rid = extract_result_id(data)
        if rid is None:
            continue
        item = rid.removeprefix(f"{MOD_ID}:")
        rtype = data.get("type", "unknown")
        produced_by[item].append((path.name, rtype, input_fingerprint(data)))

    missing = [item for item in expected if item not in produced_by]
    orphans = sorted(item for item in produced_by if item not in expected_set)

    print(f"Recipe directory : {RECIPE_DIR}")
    print(f"Recipes scanned  : {sum(1 for _ in RECIPE_DIR.glob('*.json'))}")
    print(f"Expected items   : {len(expected)}")
    print(f"Items covered    : {len(expected) - len(missing)}")
    print(f"Items MISSING    : {len(missing)}")
    print(f"Orphan results   : {len(orphans)}")
    print()

    if parse_errors:
        print("=== JSON parse errors ===")
        for name, err in parse_errors:
            print(f"  {name}: {err}")
        print()

    if missing:
        print("=== Missing recipes (grouped by material) ===")
        grouped: dict[str, list[str]] = defaultdict(list)
        for item in missing:
            grouped[material_of(item)].append(item)
        for material in sorted(grouped):
            print(f"  {material}:")
            for item in sorted(grouped[material]):
                print(f"    - {item}")
        print()
    else:
        print("All expected items have at least one recipe.\n")

    if orphans:
        print("=== Orphan recipes (produce items NOT in expected set) ===")
        print("  These are likely stale - for items the mod no longer registers.")
        for item in orphans:
            files = ", ".join(name for name, _, _ in produced_by[item])
            print(f"  {item}  <-  {files}")
        print()

    # A genuine duplicate is: same item, same type, same input fingerprint.
    duplicates: list[tuple[str, str, list[str]]] = []
    for item, entries in produced_by.items():
        bucket: dict[tuple[str, frozenset[str]], list[str]] = defaultdict(list)
        for name, rtype, fp in entries:
            bucket[(rtype, fp)].append(name)
        for (rtype, _fp), names in bucket.items():
            if len(names) > 1:
                duplicates.append((item, rtype, names))

    if duplicates:
        print("=== Duplicate recipes (same item, same type, same inputs) ===")
        for item, rtype, names in sorted(duplicates):
            print(f"  {item}  ({rtype})  <-  {', '.join(names)}")
        print()
    else:
        print("No duplicate recipes detected.\n")

    return 2 if missing else 0


if __name__ == "__main__":
    sys.exit(main())