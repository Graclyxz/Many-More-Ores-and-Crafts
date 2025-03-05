package com.graclyxz.manymoreoresandcrafts.init;

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
import static net.minecraft.world.item.ArmorItem.*;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<>();

	/*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/

	/* **** Items Register ****/
    /* 1. Items Name
       2. Items ModTier
       3. Tools attributes float[]: sword, pickaxe, axe, hoe, shovel
       4. Item propeties */

	/* **** Blocks Register ****/
    /* 1. Blocks Name
       2. Strength ore ottribute
       3. Ore Sound
       4. MapColor
       5. BlockBehaviour prpeties
       6. Item propeties */

	public static final List<Item> ADAMANTITE_ITEMS = registerAllItems("adamantite", ModTiers.ADAMANTITE,
			new float[]{7.5f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0f, 0f}, new float[]{4.5f, -3f},
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<Item> ADAMANTITE_ARMOR = registerArmor(ModMaterials.ADAMANTITE, 20,
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<Block> ADAMANTITE_BLOCKS = registerAllBlocks("adamantite",  new float[]{8f, 10f}, SoundType.DEEPSLATE, MapColor.COLOR_RED,
                BlockBehaviour.Properties.of(),
                new Item.Properties().rarity(Rarity.RARE));

	public static final List<Item> COBALT_ITEMS = registerAllItems("cobalt", ModTiers.COBALT,
			new float[]{6f, -2f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, 0f}, new float[]{4.5f, -3f},
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<Item> COBALT_ARMOR = registerArmor(ModMaterials.COBALT, 20,
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<Block> COBALT_BLOCKS = registerAllBlocks("cobalt",  new float[]{6f, 8f}, SoundType.STONE, MapColor.COLOR_BLUE,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.UNCOMMON));

	public static final List<Item> INFERNAL_ITEMS = registerAllItems("infernal", ModTiers.INFERNAL,
			new float[]{7f, -1.8f}, new float[]{4f, -2.8f}, new float[]{8f, -2.6f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
			new Item.Properties().fireResistant().rarity(Rarity.RARE));
	public static final List<Item> INFERNAL_ARMOR = registerArmor(ModMaterials.INFERNAL, 25,
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<Block> INFERNAL_BLOCKS = registerAllBlocks("infernal",  new float[]{8f, 10f}, SoundType.NETHER_ORE, MapColor.COLOR_RED,
			BlockBehaviour.Properties.of(),
			new Item.Properties().fireResistant().rarity(Rarity.RARE));

	public static final List<Item> LEAD_ITEMS = registerAllItems("lead", ModTiers.LEAD,
			new float[]{4f, -2.6f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
			new Item.Properties());
	public static final List<Item> LEAD_ARMOR = registerArmor(ModMaterials.LEAD, 15,
			new Item.Properties());
	public static final List<Block> LEAD_BLOCKS = registerAllBlocks("lead",  new float[]{4f, 6f}, SoundType.STONE,MapColor.COLOR_GRAY,
			BlockBehaviour.Properties.of(),
			new Item.Properties());

	public static final List<Item> MYTHRIL_ITEMS = registerAllItems("mythril", ModTiers.MYTHRIL,
			new float[]{8f, -2.8f}, new float[]{5f, -2.8f}, new float[]{9f, -2.8f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
			new Item.Properties().rarity(Rarity.EPIC));
	public static final List<Item> MYTHRIL_ARMOR = registerArmor(ModMaterials.MYTHRIL, 32,
			new Item.Properties().rarity(Rarity.EPIC));
	public static final List<Block> MYTHRIL_BLOCKS = registerAllBlocks("mythril",  new float[]{10f, 12f}, SoundType.DEEPSLATE, MapColor.COLOR_LIGHT_GREEN,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.EPIC));

	public static final List<Item> OBSIDIAN_ITEMS = registerAllItems("obsidian", ModTiers.OBSIDIAN,
			new float[]{9f, -3.2f}, new float[]{4f, -2.8f}, new float[]{10f, -3.6f}, new float[]{1, -1f}, new float[]{4.5f, -3f},
			new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));
	public static final List<Item> OBSIDIAN_ARMOR = registerArmor(ModMaterials.OBSIDIAN, 18,
			new Item.Properties().rarity(Rarity.UNCOMMON));

	public static final Block OBSIDIAN_BLOCK = registerBlock("obsidian_block", new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
					.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)),
			new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));

	public static final Block RAW_OBSIDIAN_BLOCK = registerBlock("raw_obsidian_block", new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
					.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)),
			new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));


	public static final List<Item> ORICHALCUM_ITEMS = registerAllItems("orichalcum", ModTiers.ORICHALCUM,
			new float[]{7.5f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<Item> ORICHALCUM_ARMOR = registerArmor(ModMaterials.ORICHALCUM, 25,
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<Block> ORICHALCUM_BLOCKS = registerAllBlocks("orichalcum",  new float[]{8f, 10f}, SoundType.DEEPSLATE, MapColor.COLOR_PINK,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.RARE));

	public static final List<Item> PALLADIUM_ITEMS = registerAllItems("palladium", ModTiers.PALLADIUM,
			new float[]{6f, -2.4f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{1, 0f}, new float[]{4.5f, -3f},
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<Item> PALLADIUM_ARMOR = registerArmor(ModMaterials.PALLADIUM, 25,
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<Block> PALLADIUM_BLOCKS = registerAllBlocks("palladium",  new float[]{6f, 8f}, SoundType.STONE, MapColor.COLOR_RED,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.UNCOMMON));

	public static final List<Item> PLATINUM_ITEMS = registerAllItems("platinum", ModTiers.PLATINUM,
			new float[]{6f, -2.4f}, new float[]{1f, -2.8f}, new float[]{7f, -3f}, new float[]{0f, -3f}, new float[]{1.5f, -3f},
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<Item> PLATINUM_ARMOR = registerArmor(ModMaterials.PLATINUM, 20,
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<Block> PLATINUM_BLOCKS = registerAllBlocks("platinum",  new float[]{6f, 8f}, SoundType.STONE, MapColor.COLOR_GRAY,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.UNCOMMON));

	public static final List<Item> SILVER_ITEMS = registerAllItems("silver", ModTiers.SILVER,
			new float[]{5f, -2f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, 0f}, new float[]{3.5f, -3f},
			new Item.Properties());
	public static final List<Item> SILVER_ARMOR = registerArmor(ModMaterials.SILVER, 18,
			new Item.Properties());
	public static final List<Block> SILVER_BLOCKS = registerAllBlocks("silver",  new float[]{4f, 6f}, SoundType.STONE, MapColor.COLOR_GRAY,
			BlockBehaviour.Properties.of(),
			new Item.Properties());

	public static final List<Item> TIN_ITEMS = registerAllItems("tin", ModTiers.TIN,
			new float[]{4f, -2.4f}, new float[]{2f, -2.8f}, new float[]{6f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
			new Item.Properties());
	public static final List<Item> TIN_ARMOR = registerArmor(ModMaterials.TIN, 15,
			new Item.Properties());
	public static final List<Block> TIN_BLOCKS = registerAllBlocks("tin",  new float[]{4f, 6f}, SoundType.STONE, MapColor.COLOR_BROWN,
			BlockBehaviour.Properties.of(),
			new Item.Properties());

	public static final List<Item> TITANIUM_ITEMS = registerAllItems("titanium", ModTiers.TITANIUM,
			new float[]{8f, -2.6f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
			new Item.Properties().rarity(Rarity.EPIC));
	public static final List<Item> TITANIUM_ARMOR = registerArmor(ModMaterials.TITANIUM, 34,
			new Item.Properties().rarity(Rarity.EPIC));
	public static final List<Block> TITANIUM_BLOCKS = registerAllBlocks("titanium",  new float[]{10f, 14f}, SoundType.DEEPSLATE, MapColor.COLOR_CYAN,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.EPIC));

	public static final List<Item> TUNGSTEM_ITEMS = registerAllItems("tungsten", ModTiers.TUNGSTEM,
			new float[]{5f, -2.4f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
			new Item.Properties());
	public static final List<Item> TUNGSTEM_ARMOR = registerArmor(ModMaterials.TUNGSTEM, 18,
			new Item.Properties());
	public static final List<Block> TUNGSTEM_BLOCKS = registerAllBlocks("tungsten",  new float[]{4f, 6f}, SoundType.STONE, MapColor.COLOR_GREEN,
			BlockBehaviour.Properties.of(),
			new Item.Properties());

	public static final List<Item> COPPER_ITEMS =  registerItems("copper", ModTiers.COPPER,
			new float[]{4f, -2.5f}, new float[]{2f, -2.8f}, new float[]{6f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
			new Item.Properties());
	public static final List<Item> COPPER_ARMOR = registerArmor(ModMaterials.COPPER, 10,
			new Item.Properties());

	public static final List<Item> AMETHYST_ITEMS = registerItems("amethyst", ModTiers.AMETHYST,
			new float[]{5f, -2.4f}, new float[]{2f, -2.8f}, new float[]{6f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
			new Item.Properties());
	public static final List<Item> AMETHYST_ARMOR = registerArmor(ModMaterials.AMETHYST, 16,
			new Item.Properties());

	public static final List<Item> EMERALD_ITEMS =  registerItems("emerald", ModTiers.EMERALD,
			new float[]{6f, -2.6f}, new float[]{2f, -2.8f}, new float[]{7f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
			new Item.Properties());
	public static final List<Item> EMERALD_ARMOR = registerArmor(ModMaterials.EMERALD, 15,
			new Item.Properties());


	/*-******************************************************************************************************************-*/
	/*--------------------------------                  REGISTERS               ------------------------------------------*/
	/*-******************************************************************************************************************-*/


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

	private static List<Item> registerAllItems(String name, Tier tooltier,
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
				registerItem(name + "_shovel", new ShovelItem(tooltier, itemProp.attributes(ShovelItem.createAttributes(tooltier, shovelattr[0], shovelattr[1]))))
		);
	}

	private static List<Item> registerItems(String name, Tier tooltier,
											   float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
											   Item.Properties itemProp) {
		return List.of(
				registerItem(name + "_sword", new SwordItem(tooltier, itemProp.attributes(SwordItem.createAttributes(tooltier, (int) swordattr[0], swordattr[1])))),
				registerItem(name + "_pickaxe", new PickaxeItem(tooltier, itemProp.attributes(PickaxeItem.createAttributes(tooltier, pickaxeattr[0], pickaxeattr[1])))),
				registerItem(name + "_axe", new AxeItem(tooltier, itemProp.attributes(AxeItem.createAttributes(tooltier,axeattr[0], axeattr[1])))),
				registerItem(name + "_hoe", new HoeItem(tooltier, itemProp.attributes(HoeItem.createAttributes(tooltier,hoeattr[0], hoeattr[1])))),
				registerItem(name + "_shovel", new ShovelItem(tooltier, itemProp.attributes(ShovelItem.createAttributes(tooltier, shovelattr[0], shovelattr[1]))))
		);
	}

	private static List<Item> registerArmor(Holder<ArmorMaterial> material, int durabilityMultiplier, Item.Properties itemProp) {
		String name = material.getRegisteredName().substring(material.getRegisteredName().indexOf(ResourceLocation.NAMESPACE_SEPARATOR) + 1);
		return List.of(
				registerItem(name + "_helmet", new ArmorItem(material, Type.HELMET, itemProp.durability(ArmorItem.Type.HELMET.getDurability(durabilityMultiplier)))),
				registerItem(name + "_chestplate", new ArmorItem(material, Type.CHESTPLATE, itemProp.durability(ArmorItem.Type.CHESTPLATE.getDurability(durabilityMultiplier)))),
				registerItem(name + "_leggings", new ArmorItem(material, Type.LEGGINGS, itemProp.durability(ArmorItem.Type.LEGGINGS.getDurability(durabilityMultiplier)))),
				registerItem(name + "_boots", new ArmorItem(material, Type.BOOTS, itemProp.durability(ArmorItem.Type.BOOTS.getDurability(durabilityMultiplier))))
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
