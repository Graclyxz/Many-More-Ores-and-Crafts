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
        ToolMaterial TIN = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                250, 6f, 0f, 14,
                ModTags.Items.TIN_INGOT);
    }
}
