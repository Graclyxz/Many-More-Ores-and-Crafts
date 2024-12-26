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
        ArmorMaterial TIN = new ArmorMaterial(15, createMap(new int[]{2, 6, 5, 2, 6}),
                9, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f,
                ModTags.Items.TIN_INGOT, createAsset("tin"));

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
                2031, 12f, 0f, 23,
                ModTags.Items.MYTHRIL_INGOT);

        /*ToolMaterial OBSIDIAN = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                2031, 7f, 0f, 22,
                ModTags.Items.OBSIDIAN_INGOT);*/

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
                131, 4f, 0f, 5,
                ModTags.Items.TIN_INGOT);

        ToolMaterial TITANIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                2031, 9f, 0f, 10,
                ModTags.Items.TITANIUM_INGOT);

        ToolMaterial TUNGSTEM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                250, 8f, 0f, 16,
                ModTags.Items.TUNGSTEM_INGOT);
    }
}
