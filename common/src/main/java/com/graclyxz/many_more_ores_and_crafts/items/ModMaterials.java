package com.graclyxz.many_more_ores_and_crafts.items;

import com.graclyxz.many_more_ores_and_crafts.init.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;

public class ModMaterials {

    public interface Armor {

        ArmorMaterial ADAMANTITE = new ArmorMaterial(25, createMap(new int[]{3, 8, 6, 3, 8}),
                15, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.2f,
                ModTags.Items.ADAMANTITEINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "adamantitearmor"));

        ArmorMaterial AMETHYST = new ArmorMaterial(15, createMap(new int[]{1, 5, 3, 2, 5}),
                25, SoundEvents.ARMOR_EQUIP_DIAMOND, 0f, 0f,
                ModTags.Items.AMETHYST, ResourceLocation.fromNamespaceAndPath(MOD_ID, "amethystarmor"));

        ArmorMaterial COBALT = new ArmorMaterial(25, createMap(new int[]{2, 7, 5, 5, 7}),
                15, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f,
                ModTags.Items.COBALTINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "cobaltarmor"));

        ArmorMaterial INFERNAL = new ArmorMaterial(15, createMap(new int[]{3, 8, 6, 3, 8}),
                25, SoundEvents.ARMOR_EQUIP_NETHERITE, 1f, 0.1f,
                ModTags.Items.INFERNALINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "infernalarmor"));

        ArmorMaterial LEAD = new ArmorMaterial(15, createMap(new int[]{1, 4, 3, 2, 4}),
                15, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f,
                ModTags.Items.LEADINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "leadarmor"));

        ArmorMaterial MYTHRIL = new ArmorMaterial(33, createMap(new int[]{3, 8, 6, 3, 8}),
                25, SoundEvents.ARMOR_EQUIP_LEATHER, 2f, 0.1f,
                ModTags.Items.MYTHRILINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "mythrilarmor"));

        ArmorMaterial OBSIDIAN = new ArmorMaterial(20, createMap(new int[]{2, 6, 5, 2, 6}),
                25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2f, 0.1f,
                ModTags.Items.OBSIDIANINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "obsidianarmor"));

        ArmorMaterial ORICHALCUM = new ArmorMaterial(25, createMap(new int[]{2, 6, 5, 2, 6}),
                15, SoundEvents.ARMOR_EQUIP_DIAMOND, 2f, 0.1f,
                ModTags.Items.ORICHALCUMINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "orichalcumarmor"));

        ArmorMaterial PALLADIUM = new ArmorMaterial(25, createMap(new int[]{2, 7, 5, 2, 7}),
                15, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f,
                ModTags.Items.PALLADIUMINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "palladiumarmor"));

        ArmorMaterial PLATINUM = new ArmorMaterial(20, createMap(new int[]{2, 6, 5, 2, 6}),
                12, SoundEvents.ARMOR_EQUIP_GOLD, 0.2f, 0f,
                ModTags.Items.PLATINUMINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "platinumarmor"));

        ArmorMaterial SILVER = new ArmorMaterial(15, createMap(new int[]{2, 5, 4, 2, 5}),
                12, SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f,
                ModTags.Items.SILVERINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "silverarmor"));

        ArmorMaterial TIN = new ArmorMaterial(15, createMap(new int[]{1, 3, 2, 1, 3}),
                9, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f,
                ModTags.Items.TININGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "tinarmor"));

        ArmorMaterial TITANIUM = new ArmorMaterial(33, createMap(new int[]{2, 6, 5, 2, 6}),
                15, SoundEvents.ARMOR_EQUIP_CHAIN, 3f, 0.3f,
                ModTags.Items.TITANIUMINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "titaniumarmor"));

        ArmorMaterial TUNGSTEN = new ArmorMaterial(15, createMap(new int[]{2, 5, 4, 2, 5}),
                12, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f,
                ModTags.Items.TUNGSTENINGOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "tungstenarmor"));


        private static EnumMap<ArmorType, Integer> createMap(int[] values) {
            EnumMap<ArmorType, Integer> enumMap = new EnumMap<>(ArmorType.class);
            for (int i = 0; i < values.length; i++) enumMap.put(ArmorType.values()[i], values[i]);
            return enumMap;
        }
    }

    public interface Tool {

        ToolMaterial ADAMANTITE = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.ADAMANTITEINGOT);

        ToolMaterial AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.AMETHYST);

        ToolMaterial COBALT = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.COBALTINGOT);

        ToolMaterial INFERNAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.INFERNALINGOT);

        ToolMaterial LEAD = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.LEADINGOT);

        ToolMaterial MYTHRIL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.MYTHRILINGOT);

        ToolMaterial OBSIDIAN = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.OBSIDIANINGOT);

        ToolMaterial ORICHALCUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.ORICHALCUMINGOT);

        ToolMaterial PALLADIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.PALLADIUMINGOT);

        ToolMaterial PLATINUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.PLATINUMINGOT);

        ToolMaterial SILVER = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.SILVERINGOT);

        ToolMaterial TIN = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.TININGOT);

        ToolMaterial TITANIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.TITANIUMINGOT);

        ToolMaterial TUNGSTEN = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1561, 9f, 8f, 22, ModTags.Items.TUNGSTENINGOT);

        /*ToolMaterial SHAMMER = copy(ToolMaterial.STONE, 1, 1);

        private static ToolMaterial copy(ToolMaterial material, int i, float j) {
            return new ToolMaterial(material.incorrectBlocksForDrops(), material.durability() * i, material.speed() + j, material.attackDamageBonus(), material.enchantmentValue(), material.repairItems());
        }*/

    }

}
