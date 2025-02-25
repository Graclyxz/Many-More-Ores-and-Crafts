package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.item.BaseArmorItem;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;


import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<>();

	/*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/

	/* **** Items Register ****/
    /* 1. Items Name
       2. Items ToolMaterial
       3. Items ArmorMaterial
       4. Tools attributes float[]: sword, pickaxe, axe, hoe, shovel
       5. Item propeties */

	/* **** Blocks Register ****/
    /* 1. Blocks Name
       2. Strength ore ottribute
       3. Ore Sound
       4. BlockBehaviour prpeties
       5. Item propeties */

	public static final List<Item> ADAMANTITE_ITEMS = registerAllItems("adamantite", ModTiers.ADAMANTITE, ModMaterials.ADAMANTITE,
			25, new float[]{7.5f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0f, 0f}, new float[]{4.5f, -3f},
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<Block> ADAMANTITE_BLOCKS = registerAllBlocks("adamantite",  new float[]{8f, 10f}, SoundType.DEEPSLATE, MapColor.COLOR_RED,
                BlockBehaviour.Properties.of(),
                new Item.Properties().rarity(Rarity.RARE));


	private static Block registerBlock(String name, Block block, Item.Properties itemProp) {
		registerItem(name, new BlockItem(block, itemProp));
		return registerBlock(name, block);
	}

	private static Block registerBlock(String name, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), block);
	}

	private static Item registerItem(String name, Item item) {
		var itemReg = Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), item);
		ITEMS.add(itemReg);
		return itemReg;
	}

	private static List<Item> registerAllItems(String name, Tier tooltier, Holder<ArmorMaterial> armormaterial, int durabilityMultiplier,
											   float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
											   Item.Properties itemProp) {
		return List.of(
				registerItem( "raw_" + name, new Item(itemProp)),
				registerItem( name +"_ingot", new Item(itemProp)),
				registerItem( name +"_nugget", new Item(itemProp)),

				registerItem(name + "_sword", new SwordItem(tooltier, itemProp.attributes(SwordItem.createAttributes(tooltier, (int) swordattr[0], swordattr[1])))),
				registerItem(name + "_pickaxe", new PickaxeItem(tooltier, itemProp.attributes(PickaxeItem.createAttributes(tooltier, pickaxeattr[0], pickaxeattr[1])))),
				registerItem(name + "_axe", new AxeItem(tooltier, itemProp.attributes(AxeItem.createAttributes(tooltier,axeattr[0], axeattr[1])))),
				registerItem(name + "_hoe", new HoeItem(tooltier, itemProp.attributes(HoeItem.createAttributes(tooltier,hoeattr[0], hoeattr[1])))),
				registerItem(name + "_shovel", new ShovelItem(tooltier, itemProp.attributes(ShovelItem.createAttributes(tooltier, shovelattr[0], shovelattr[1])))),

				registerItem(name + "_helmet", new BaseArmorItem(armormaterial, ArmorItem.Type.HELMET, durabilityMultiplier, itemProp)),
				registerItem(name + "_chestplate", new BaseArmorItem(armormaterial, ArmorItem.Type.CHESTPLATE, durabilityMultiplier, itemProp)),
				registerItem(name + "_leggings", new BaseArmorItem(armormaterial, ArmorItem.Type.LEGGINGS, durabilityMultiplier, itemProp)),
				registerItem(name + "_boots", new BaseArmorItem(armormaterial, ArmorItem.Type.BOOTS, durabilityMultiplier, itemProp))
		);
	}

	private static List<Block> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock, MapColor color, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
		return List.of(
				registerBlock(name +"_block", new Block(blockProp.mapColor(color)
						.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), itemProp),

				registerBlock(name +"_ore", new Block(blockProp.mapColor(color)
						.strength(strengthattr[0],strengthattr[1]).requiresCorrectToolForDrops().sound(soundblock)), itemProp),

				registerBlock("raw_" + name + "_block", new Block(blockProp.mapColor(color)
						.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), itemProp)
		);
	}



	public static void init() {
	}
}
