package com.graclyxz.many_more_ores_and_crafts.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {

        TagKey<Item> ADAMANTITE_INGOT = createTag(Identifier.parse("c:ingots/adamantite"));
        TagKey<Item> COBALT_INGOT = createTag(Identifier.parse("c:ingots/cobalt"));
        TagKey<Item> INFERNAL_INGOT = createTag(Identifier.parse("c:ingots/infernal"));
        TagKey<Item> LEAD_INGOT = createTag(Identifier.parse("c:ingots/lead"));
        TagKey<Item> MYTHRIL_INGOT = createTag(Identifier.parse("c:ingots/mythril"));
        TagKey<Item> OBSIDIAN_INGOT = createTag(Identifier.parse("c:ingots/obsidian"));
        TagKey<Item> ORICHALCUM_INGOT = createTag(Identifier.parse("c:ingots/orichalcum"));
        TagKey<Item> PALLADIUM_INGOT = createTag(Identifier.parse("c:ingots/palladium"));
        TagKey<Item> PLATINUM_INGOT = createTag(Identifier.parse("c:ingots/platinum"));
        TagKey<Item> SILVER_INGOT = createTag(Identifier.parse("c:ingots/silver"));
        TagKey<Item> TIN_INGOT = createTag(Identifier.parse("c:ingots/tin"));
        TagKey<Item> TITANIUM_INGOT = createTag(Identifier.parse("c:ingots/titanium"));
        TagKey<Item> ENDERIUM_INGOT = createTag(Identifier.parse("c:ingots/enderium"));
        TagKey<Item> TUNGSTEM_INGOT = createTag(Identifier.parse("c:ingots/tungsten"));

        // Disabled: vanilla Minecraft 26.1.2 added native copper tools/armor. Re-enable by uncommenting if needed.
        // TagKey<Item> COPPER = createTag(Identifier.parse("c:ingots/copper"));
        TagKey<Item> AMETHYST_SHARD = createTag(Identifier.parse("c:items/amethyst_shard"));
        TagKey<Item> EMERALD = createTag(Identifier.parse("c:items/emerald"));

        private static TagKey<Item> createTag(Identifier name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}
