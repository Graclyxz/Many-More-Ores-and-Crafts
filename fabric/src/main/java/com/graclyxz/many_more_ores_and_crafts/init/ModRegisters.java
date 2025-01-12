package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;

public class ModRegisters {

    public static final List<Item> ITEMS = new ArrayList<>();

    /*-*-*-*-*-*-*-*-* item and blocks registration *-*-*-*-*-*-*-*-*/
    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        var blockReg = registerBlock(name, function, blockProp);
        registerItem(name, (p) -> new BlockItem(blockReg, p), itemProp.useBlockDescriptionPrefix());
        return blockReg;
    }

    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)), function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
    }

    public static Item registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        var itemReg = Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)), function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
        ITEMS.add(itemReg);
        return itemReg;
    }

    /*-*-*-*-*-*-*-*-* Items list *-*-*-*-*-*-*-*-*/
    public static List<Item> registerItems(String name, ToolMaterial toolmaterial, ArmorMaterial armormaterial,
                                           float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
                                           Item.Properties itemProp) {
        return List.of(
                registerItem(name + "_sword", (p) -> new SwordItem(toolmaterial,  swordattr[0], swordattr[1], p), itemProp),
                registerItem(name + "_pickaxe", (p) -> new PickaxeItem(toolmaterial,  pickaxeattr[0], pickaxeattr[1], p), itemProp),
                registerItem(name + "_axe", (p) -> new AxeItem(toolmaterial,  axeattr[0], axeattr[1], p), itemProp),
                registerItem(name + "_hoe", (p) -> new HoeItem(toolmaterial,  hoeattr[0], hoeattr[1], p), itemProp),
                registerItem( name + "_shovel", (p) -> new ShovelItem(toolmaterial,  shovelattr[0], shovelattr[1], p), itemProp),

                registerItem(name + "_helmet", (p) -> new ArmorItem(armormaterial, ArmorType.HELMET, p), itemProp),
                registerItem(name + "_chestplate", (p) -> new ArmorItem(armormaterial, ArmorType.CHESTPLATE, p), itemProp),
                registerItem(name + "_leggings", (p) -> new ArmorItem(armormaterial, ArmorType.LEGGINGS, p), itemProp),
                registerItem(name + "_boots", (p) -> new ArmorItem(armormaterial, ArmorType.BOOTS, p), itemProp)
        );
    }

    public static List<Item> registerAllItems(String name, ToolMaterial toolmaterial, ArmorMaterial armormaterial,
                                              float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
                                              Item.Properties itemProp) {
        return List.of(
                registerItem( "raw_" + name, Item::new, itemProp),
                registerItem( name +"_ingot", Item::new, itemProp),
                registerItem( name +"_nugget", Item::new, itemProp),

                registerItem(name + "_sword", (p) -> new SwordItem(toolmaterial,  swordattr[0], swordattr[1], p), itemProp),
                registerItem(name + "_pickaxe", (p) -> new PickaxeItem(toolmaterial,  pickaxeattr[0], pickaxeattr[1], p), itemProp),
                registerItem(name + "_axe", (p) -> new AxeItem(toolmaterial,  axeattr[0], axeattr[1], p), itemProp),
                registerItem(name + "_hoe", (p) -> new HoeItem(toolmaterial,  hoeattr[0], hoeattr[1], p), itemProp),
                registerItem( name + "_shovel", (p) -> new ShovelItem(toolmaterial,  shovelattr[0], shovelattr[1], p), itemProp),

                registerItem(name + "_helmet", (p) -> new ArmorItem(armormaterial, ArmorType.HELMET, p), itemProp),
                registerItem(name + "_chestplate", (p) -> new ArmorItem(armormaterial, ArmorType.CHESTPLATE, p), itemProp),
                registerItem(name + "_leggings", (p) -> new ArmorItem(armormaterial, ArmorType.LEGGINGS, p), itemProp),
                registerItem(name + "_boots", (p) -> new ArmorItem(armormaterial, ArmorType.BOOTS, p), itemProp)
        );
    }

    /*-*-*-*-*-*-*-*-* Blocks list *-*-*-*-*-*-*-*-*/
    public static List<Block> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        return List.of(
                registerBlock(name + "_block", Block::new, blockProp.requiresCorrectToolForDrops()
                                .strength(4f, 6f).sound(SoundType.METAL),
                        itemProp),

                registerBlock(name + "_ore", Block::new, blockProp.requiresCorrectToolForDrops()
                                .strength(strengthattr[0],strengthattr[1]).sound(soundblock),
                        itemProp),

                registerBlock("raw_" + name + "_block", Block::new, blockProp.requiresCorrectToolForDrops()
                                .strength(4f, 6f).sound(SoundType.STONE),
                        itemProp)
        );
    }
}
