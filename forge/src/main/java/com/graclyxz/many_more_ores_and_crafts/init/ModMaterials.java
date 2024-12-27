package com.graclyxz.many_more_ores_and_crafts.init;

import com.graclyxz.many_more_ores_and_crafts.util.ModTags;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
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

    public interface Armor {

        ArmorMaterial ADAMANTITE = new ArmorMaterial(20, createMap(new int[]{3, 8, 6, 3, 8}),
                22, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f,
                ModTags.Items.ADAMANTITE_INGOT, createAsset("adamantite"));

        /*ArmorMaterial AMETHYST = new ArmorMaterial(15, createMap(new int[]{2, 5, 3, 2, 5}),
                25, SoundEvents.ARMOR_EQUIP_Chain, 0f, 0f,
                ModTags.Items.AMETHYST_INGOT, createAsset("amethyst"));*/

        ArmorMaterial COBALT = new ArmorMaterial(20, createMap(new int[]{2, 7, 5, 2, 7}),
                15, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f,
                ModTags.Items.COBALT_INGOT, createAsset("cobalt"));

        ArmorMaterial INFERNAL = new ArmorMaterial(25, createMap(new int[]{3, 8, 6, 3, 8}),
                15, SoundEvents.ARMOR_EQUIP_NETHERITE, 1f, 0.2f,
                ModTags.Items.INFERNAL_INGOT, createAsset("infernal"));

        ArmorMaterial LEAD = new ArmorMaterial(15, createMap(new int[]{2, 4, 3, 1, 4}),
                14, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f,
                ModTags.Items.LEAD_INGOT, createAsset("lead"));

        ArmorMaterial MYTHRIL = new ArmorMaterial(32, createMap(new int[]{4, 8, 6, 2, 8}),
                24, SoundEvents.ARMOR_EQUIP_NETHERITE, 2f, 0.1f,
                ModTags.Items.MYTHRIL_INGOT, createAsset("mythril"));

        ArmorMaterial OBSIDIAN = new ArmorMaterial(14, createMap(new int[]{2, 6, 5, 2, 6}),
                22, SoundEvents.ARMOR_EQUIP_ELYTRA, 2f, 0.4f,
                ModTags.Items.TIN_INGOT, createAsset("obsidian"));

        ArmorMaterial ORICHALCUM = new ArmorMaterial(25, createMap(new int[]{2, 6, 5, 2, 6}),
                22, SoundEvents.ARMOR_EQUIP_DIAMOND, 1f, 0.2f,
                ModTags.Items.ORICHALCUM_INGOT, createAsset("orichalcum"));

        ArmorMaterial PALLADIUM = new ArmorMaterial(25, createMap(new int[]{2, 7, 5, 2, 7}),
                15, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f,
                ModTags.Items.PALLADIUM_INGOT, createAsset("palladium"));

        ArmorMaterial PLATINUM = new ArmorMaterial(20, createMap(new int[]{2, 6, 5, 2, 6}),
                15, SoundEvents.ARMOR_EQUIP_GOLD, 0.2f, 0f,
                ModTags.Items.PLATINUM_INGOT, createAsset("platinum"));

        ArmorMaterial SILVER = new ArmorMaterial(15, createMap(new int[]{2, 5, 4, 2, 5}),
                16, SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f,
                ModTags.Items.SILVER_INGOT, createAsset("silver"));

        ArmorMaterial TIN = new ArmorMaterial(15, createMap(new int[]{2, 3, 2, 1, 3}),
                6, SoundEvents.ARMOR_EQUIP_GENERIC, 0f, 0f,
                ModTags.Items.TIN_INGOT, createAsset("tin"));

        ArmorMaterial TITANIUM = new ArmorMaterial(34, createMap(new int[]{2, 6, 5, 2, 8}),
                14, SoundEvents.ARMOR_EQUIP_TURTLE, 3f, 0.2f,
                ModTags.Items.TITANIUM_INGOT, createAsset("titanium"));

        ArmorMaterial TUNGSTEM = new ArmorMaterial(15, createMap(new int[]{2, 5, 4, 2, 5}),
                16, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f,
                ModTags.Items.TUNGSTEM_INGOT, createAsset("tungsten"));

        private static ResourceKey<EquipmentAsset> createAsset(String name) {
            return ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
        }

        private static EnumMap<ArmorType, Integer> createMap(int[] values) {
            EnumMap<ArmorType, Integer> enumMap = new EnumMap<>(ArmorType.class);
            for (int i = 0; i < values.length; i++) enumMap.put(ArmorType.values()[i], values[i]);
            return enumMap;
        }
    }

    public interface Tool {

        ToolMaterial ADAMANTITE = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 0f, 22,
                ModTags.Items.ADAMANTITE_INGOT);

        /*ToolMaterial AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                250, 6f, 0f, 14,
                ModTags.Items.AMETHYST_INGOT);*/

        ToolMaterial COBALT = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                1561, 8f, 0f, 15,
                ModTags.Items.COBALT_INGOT);

        ToolMaterial INFERNAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                2031, 9f, 0f, 15,
                ModTags.Items.INFERNAL_INGOT);

        ToolMaterial LEAD = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                250, 6f, 0f, 14,
                ModTags.Items.LEAD_INGOT);

        ToolMaterial MYTHRIL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                2031, 12f, 0f, 24,
                ModTags.Items.MYTHRIL_INGOT);

        ToolMaterial OBSIDIAN = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                2031, 7f, 0f, 22,
                ModTags.Items.OBSIDIAN_INGOT);

        ToolMaterial ORICHALCUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 0f, 22,
                ModTags.Items.ORICHALCUM_INGOT);

        ToolMaterial PALLADIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                1561, 8f, 0f, 15,
                ModTags.Items.PALLADIUM_INGOT);

        ToolMaterial PLATINUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                250, 8f, 0f, 15,
                ModTags.Items.PLATINUM_INGOT);

        ToolMaterial SILVER = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                250, 8f, 0f, 16,
                ModTags.Items.SILVER_INGOT);

        ToolMaterial TIN = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                131, 4f, 0f, 6,
                ModTags.Items.TIN_INGOT);

        ToolMaterial TITANIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                2031, 9f, 0f, 10,
                ModTags.Items.TITANIUM_INGOT);

        ToolMaterial TUNGSTEM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                250, 8f, 0f, 16,
                ModTags.Items.TUNGSTEM_INGOT);
    }
}

