package com.graclyxz.many_more_ores_and_crafts.init;

import com.graclyxz.many_more_ores_and_crafts.util.ModTags;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.EnumMap;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;

public class ModMaterials {

    /*
     * Balance pass 2026-06-07. Tiers (by worldgen rarity):
     *   D (common 10-14/chunk): TIN, LEAD
     *   C (medium 8/chunk):     SILVER, TUNGSTEM
     *   B (uncommon 4-6):       COBALT, PALLADIUM, PLATINUM, OBSIDIAN
     *   A (rare 4-6, deep):     ADAMANTITE, ORICHALCUM, INFERNAL
     *   S (legendary 4, Y-64):  MYTHRIL, TITANIUM
     * Vanilla-extension: AMETHYST (geode), EMERALD (villager)
     */

    public interface Armor {

        // A-tier — heavy hitter, durable
        ArmorMaterial ADAMANTITE = new ArmorMaterial(25, createMap(new int[]{3, 7, 5, 3, 7}),
                12, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f,
                ModTags.Items.ADAMANTITE_INGOT, createAsset("adamantite"));

        // B-tier — fast attacker
        ArmorMaterial COBALT = new ArmorMaterial(18, createMap(new int[]{2, 6, 5, 2, 6}),
                14, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f,
                ModTags.Items.COBALT_INGOT, createAsset("cobalt"));

        // A-tier — fire resistant, balanced offensive
        ArmorMaterial INFERNAL = new ArmorMaterial(33, createMap(new int[]{3, 8, 6, 3, 8}),
                14, SoundEvents.ARMOR_EQUIP_NETHERITE, 2f, 0.1f,
                ModTags.Items.INFERNAL_INGOT, createAsset("infernal"));

        // D-tier — heavy, anti-knockback
        ArmorMaterial LEAD = new ArmorMaterial(15, createMap(new int[]{1, 4, 3, 1, 4}),
                14, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0.15f,
                ModTags.Items.LEAD_INGOT, createAsset("lead"));

        // S-tier — top enchantability, mid defense (tradeoff: mage)
        ArmorMaterial MYTHRIL = new ArmorMaterial(28, createMap(new int[]{3, 7, 5, 2, 7}),
                30, SoundEvents.ARMOR_EQUIP_NETHERITE, 2f, 0f,
                ModTags.Items.MYTHRIL_INGOT, createAsset("mythril"));

        // B-tier — defensive tank, high knockback resist
        ArmorMaterial OBSIDIAN = new ArmorMaterial(28, createMap(new int[]{3, 7, 5, 3, 7}),
                14, SoundEvents.ARMOR_EQUIP_ELYTRA, 2f, 0.3f,
                ModTags.Items.OBSIDIAN_INGOT, createAsset("obsidian"));

        // A-tier — magical, enchantability focus
        ArmorMaterial ORICHALCUM = new ArmorMaterial(22, createMap(new int[]{3, 7, 5, 2, 7}),
                24, SoundEvents.ARMOR_EQUIP_DIAMOND, 1f, 0f,
                ModTags.Items.ORICHALCUM_INGOT, createAsset("orichalcum"));

        // B-tier — diamond-light balanced
        ArmorMaterial PALLADIUM = new ArmorMaterial(22, createMap(new int[]{2, 6, 5, 2, 6}),
                14, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f,
                ModTags.Items.PALLADIUM_INGOT, createAsset("palladium"));

        // B-tier — fragile but top enchantability (gold-like)
        ArmorMaterial PLATINUM = new ArmorMaterial(7, createMap(new int[]{2, 5, 3, 1, 5}),
                28, SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f,
                ModTags.Items.PLATINUM_INGOT, createAsset("platinum"));

        // C-tier — fast attacker, decent enchant
        ArmorMaterial SILVER = new ArmorMaterial(18, createMap(new int[]{2, 5, 4, 2, 5}),
                18, SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f,
                ModTags.Items.SILVER_INGOT, createAsset("silver"));

        // D-tier — starter alternative
        ArmorMaterial TIN = new ArmorMaterial(15, createMap(new int[]{2, 3, 2, 1, 3}),
                6, SoundEvents.ARMOR_EQUIP_GENERIC, 0f, 0f,
                ModTags.Items.TIN_INGOT, createAsset("tin"));

        // S-tier — top defense, top durability (tradeoff: tank)
        ArmorMaterial TITANIUM = new ArmorMaterial(37, createMap(new int[]{3, 8, 6, 3, 8}),
                10, SoundEvents.ARMOR_EQUIP_TURTLE, 3f, 0.2f,
                ModTags.Items.TITANIUM_INGOT, createAsset("titanium"));

        // C-tier — durable iron alt, no frills
        ArmorMaterial TUNGSTEM = new ArmorMaterial(18, createMap(new int[]{2, 5, 4, 2, 5}),
                10, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f,
                ModTags.Items.TUNGSTEM_INGOT, createAsset("tungsten"));

        // Phantom material — kept until enderium items are implemented or removed (see audit).
        ArmorMaterial ENDERIUM = new ArmorMaterial(20, createMap(new int[]{3, 8, 6, 3, 8}),
                22, SoundEvents.ARMOR_EQUIP_NETHERITE, 1f, 0.1f,
                ModTags.Items.ENDERIUM_INGOT, createAsset("enderium"));

        // Disabled: vanilla Minecraft 26.1.2 added native copper tools/armor. Re-enable by uncommenting if needed.
        /*
        ArmorMaterial COPPER = new ArmorMaterial(10, createMap(new int[]{2, 3, 2, 1, 3}),
                6, Holder.direct(SoundEvents.COPPER_HIT), 0f, 0f,
                ModTags.Items.COPPER, createAsset("copper"));
        */

        // Vanilla-extension — fragile, top enchantability (mage gem)
        ArmorMaterial AMETHYST = new ArmorMaterial(16, createMap(new int[]{2, 4, 3, 2, 4}),
                30, Holder.direct(SoundEvents.AMETHYST_BLOCK_RESONATE), 0f, 0f,
                ModTags.Items.AMETHYST_SHARD, createAsset("amethyst"));

        // Vanilla-extension — mid via villager trade, slight toughness
        ArmorMaterial EMERALD = new ArmorMaterial(15, createMap(new int[]{2, 5, 4, 2, 5}),
                12, SoundEvents.ARMOR_EQUIP_GENERIC, 0.5f, 0f,
                ModTags.Items.EMERALD, createAsset("emerald"));


        private static ResourceKey<EquipmentAsset> createAsset(String name) {
            return ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(MOD_ID, name));
        }

        private static EnumMap<ArmorType, Integer> createMap(int[] values) {
            EnumMap<ArmorType, Integer> enumMap = new EnumMap<>(ArmorType.class);
            for (int i = 0; i < values.length; i++) enumMap.put(ArmorType.values()[i], values[i]);
            return enumMap;
        }
    }

    public interface Tool {

        // A-tier — heavy hitter, slow
        ToolMaterial ADAMANTITE = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 8f, 0f, 12,
                ModTags.Items.ADAMANTITE_INGOT);

        // B-tier — fast attacker
        ToolMaterial COBALT = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                900, 7f, 0f, 14,
                ModTags.Items.COBALT_INGOT);

        // A-tier — fire resistant
        ToolMaterial INFERNAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                2031, 9f, 0f, 14,
                ModTags.Items.INFERNAL_INGOT);

        // D-tier — heavy utility
        ToolMaterial LEAD = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                220, 5f, 0f, 6,
                ModTags.Items.LEAD_INGOT);

        // S-tier — top mining + enchantability (legendary mage)
        ToolMaterial MYTHRIL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                2031, 11f, 0f, 30,
                ModTags.Items.MYTHRIL_INGOT);

        // B-tier — defensive tank, slow mining
        ToolMaterial OBSIDIAN = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1800, 7f, 0f, 14,
                ModTags.Items.OBSIDIAN_INGOT);

        // A-tier — balanced magical
        ToolMaterial ORICHALCUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1300, 8f, 0f, 24,
                ModTags.Items.ORICHALCUM_INGOT);

        // B-tier — balanced iron+
        ToolMaterial PALLADIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                1100, 7f, 0f, 14,
                ModTags.Items.PALLADIUM_INGOT);

        // B-tier — fragile, top enchant (gold-like)
        ToolMaterial PLATINUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                200, 6f, 0f, 28,
                ModTags.Items.PLATINUM_INGOT);

        // C-tier — fast, enchant focus
        ToolMaterial SILVER = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                350, 6f, 0f, 18,
                ModTags.Items.SILVER_INGOT);

        // D-tier — stone+
        ToolMaterial TIN = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                180, 4f, 0f, 8,
                ModTags.Items.TIN_INGOT);

        // S-tier — top durability (legendary tank)
        ToolMaterial TITANIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                2500, 9f, 0f, 10,
                ModTags.Items.TITANIUM_INGOT);

        // C-tier — durable iron alt
        ToolMaterial TUNGSTEM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                800, 6f, 0f, 10,
                ModTags.Items.TUNGSTEM_INGOT);

        // Phantom material — kept until enderium items are implemented or removed (see audit).
        ToolMaterial ENDERIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 0f, 22,
                ModTags.Items.ENDERIUM_INGOT);

        // Disabled: vanilla Minecraft 26.1.2 added native copper tools/armor. Re-enable by uncommenting if needed.
        /*
        ToolMaterial COPPER = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                250, 6f, 0f, 14,
                ModTags.Items.COPPER);
        */

        // Vanilla-extension — fragile but top enchant
        ToolMaterial AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                200, 5f, 0f, 30,
                ModTags.Items.AMETHYST_SHARD);

        // Vanilla-extension — mid via villager trade
        ToolMaterial EMERALD = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                700, 7f, 0f, 12,
                ModTags.Items.EMERALD);
    }
}
