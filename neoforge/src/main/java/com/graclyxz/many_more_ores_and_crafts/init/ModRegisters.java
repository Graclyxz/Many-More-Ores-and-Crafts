package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Function;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;

public class ModRegisters {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    /*-*-*-*-*-*-*-*-* item and blocks registration *-*-*-*-*-*-*-*-*/
    public static DeferredItem<Item> registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        return ITEMS.register(name, () -> function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
    }

    public static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        var blockReg = registerBlock(name, function, blockProp);
        registerItem(name, (p) -> new BlockItem(blockReg.get(), p), itemProp.useBlockDescriptionPrefix());
        return blockReg;
    }

    public static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
        return BLOCKS.register(name, () -> function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
    }

    /*-*-*-*-*-*-*-*-* Items list *-*-*-*-*-*-*-*-*/
    public static List<DeferredItem<Item>> registerItems(String name, ToolMaterial toolmaterial, ArmorMaterial armormaterial,
                                                         float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
                                                         Item.Properties itemProp) {
        return List.of(
                registerItem(name + "_sword", (p) -> new Item(p.sword(toolmaterial, swordattr[0], swordattr[1])), itemProp),
                registerItem(name + "_pickaxe", (p) -> new Item(p.pickaxe(toolmaterial,  pickaxeattr[0], pickaxeattr[1])), itemProp),
                registerItem(name + "_axe", (p) -> new Item(p.axe(toolmaterial,  axeattr[0], axeattr[1])), itemProp),
                registerItem(name + "_hoe", (p) -> new Item(p.hoe(toolmaterial,  hoeattr[0], hoeattr[1])), itemProp),
                registerItem( name + "_shovel", (p) -> new Item(p.shovel(toolmaterial,  shovelattr[0], shovelattr[1])), itemProp),

                registerItem(name + "_helmet", (p) -> new Item(p.humanoidArmor(armormaterial, ArmorType.HELMET)) , itemProp),
                registerItem(name + "_chestplate", (p) -> new Item(p.humanoidArmor(armormaterial, ArmorType.CHESTPLATE)), itemProp),
                registerItem(name + "_leggings", (p) -> new Item(p.humanoidArmor(armormaterial, ArmorType.LEGGINGS)), itemProp),
                registerItem(name + "_boots", (p) -> new Item(p.humanoidArmor(armormaterial, ArmorType.BOOTS)), itemProp)
        );
    }

    public static List<DeferredItem<Item>> registerAllItems(String name, ToolMaterial toolmaterial, ArmorMaterial armormaterial,
                                                            float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
                                                            Item.Properties itemProp) {
        return List.of(
                registerItem( "raw_" + name, Item::new, itemProp),
                registerItem( name +"_ingot", Item::new, itemProp),
                registerItem( name +"_nugget", Item::new, itemProp),

                registerItem(name + "_sword", (p) -> new Item(p.sword(toolmaterial, swordattr[0], swordattr[1])), itemProp),
                registerItem(name + "_pickaxe", (p) -> new Item(p.pickaxe(toolmaterial,  pickaxeattr[0], pickaxeattr[1])), itemProp),
                registerItem(name + "_axe", (p) -> new Item(p.axe(toolmaterial,  axeattr[0], axeattr[1])), itemProp),
                registerItem(name + "_hoe", (p) -> new Item(p.hoe(toolmaterial,  hoeattr[0], hoeattr[1])), itemProp),
                registerItem( name + "_shovel", (p) -> new Item(p.shovel(toolmaterial,  shovelattr[0], shovelattr[1])), itemProp),

                registerItem(name + "_helmet", (p) -> new Item(p.humanoidArmor(armormaterial, ArmorType.HELMET)) , itemProp),
                registerItem(name + "_chestplate", (p) -> new Item(p.humanoidArmor(armormaterial, ArmorType.CHESTPLATE)), itemProp),
                registerItem(name + "_leggings", (p) -> new Item(p.humanoidArmor(armormaterial, ArmorType.LEGGINGS)), itemProp),
                registerItem(name + "_boots", (p) -> new Item(p.humanoidArmor(armormaterial, ArmorType.BOOTS)), itemProp)
        );
    }

    /*-*-*-*-*-*-*-*-* Blocks list *-*-*-*-*-*-*-*-*/
    public static List<DeferredBlock<Block>> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        return List.of(
                registerBlock(name + "_block", Block::new, blockProp.requiresCorrectToolForDrops()
                        .strength(4f, 6f).sound(SoundType.METAL), itemProp),

                registerBlock(name + "_ore", Block::new, blockProp.requiresCorrectToolForDrops()
                        .strength(strengthattr[0],strengthattr[1]).sound(soundblock), itemProp),

                registerBlock("raw_" + name + "_block", Block::new, blockProp.requiresCorrectToolForDrops()
                        .strength(4f, 6f).sound(SoundType.STONE), itemProp)
        );
    }


}
