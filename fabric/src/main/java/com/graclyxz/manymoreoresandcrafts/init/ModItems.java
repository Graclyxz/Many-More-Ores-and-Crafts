package com.graclyxz.manymoreoresandcrafts.init;

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
import static net.minecraft.world.item.ArmorItem.Properties;
import static net.minecraft.world.item.ArmorItem.Type;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<>();

	public static final List<Item> ADAMANTITE_ITEMS = registerAllItems("adamantite", ModToolTiers.ADAMANTITE,
			new float[] { 7.5f, -2f }, new float[] { 4f, -2.8f }, new float[] { 8f, -3f }, new float[] { 0f, 0f },
			new float[] { 4.5f, -3f },
			new Properties().rarity(Rarity.RARE));

	public static final List<Item> ADAMANTITE_ARMOR = registerArmor(ModArmorMaterials.ADAMANTITE,
			new Properties().rarity(Rarity.RARE));
	public static final List<Block> ADAMANTITE_BLOCKS = registerAllBlocks("adamantite", new float[] { 8f, 10f },
			SoundType.DEEPSLATE, MapColor.COLOR_RED, BlockBehaviour.Properties.of(),
			new Properties().rarity(Rarity.RARE));

	public static final List<Item> COBALT_ITEMS = registerAllItems("cobalt", ModToolTiers.COBALT,
			new float[] { 6f, -2f }, new float[] { 3f, -2.8f }, new float[] { 8f, -3.1f }, new float[] { 0, 0f },
			new float[] { 4.5f, -3f }, new Properties().rarity(Rarity.UNCOMMON));

	public static final List<Item> COBALT_ARMOR = registerArmor(ModArmorMaterials.COBALT,
			new Properties().rarity(Rarity.UNCOMMON));

	public static final List<Block> COBALT_BLOCKS = registerAllBlocks("cobalt",  new float[]{6f, 8f},SoundType.STONE,MapColor.COLOR_BLUE,BlockBehaviour.Properties.of(),new Properties().rarity(Rarity.UNCOMMON));

	public static final List<Item> INFERNAL_ITEMS = registerAllItems("infernal", ModToolTiers.INFERNAL,
			new float[]{7f, -1.8f},new float[]{4f,-2.8f},new float[]{8f,-2.6f},new float[]{0,-1f},new float[]{4.5f,-3f},new Properties().fireResistant().rarity(Rarity.RARE));

	public static final List<Item> INFERNAL_ARMOR = registerArmor(ModArmorMaterials.INFERNAL,
			new Properties().rarity(Rarity.RARE));
	public static final List<Block> INFERNAL_BLOCKS = registerAllBlocks("infernal",  new float[]{8f, 10f},SoundType.NETHER_ORE,MapColor.COLOR_RED,BlockBehaviour.Properties.of(),new Properties().fireResistant().rarity(Rarity.RARE));

	public static final List<Item> LEAD_ITEMS = registerAllItems("lead", ModToolTiers.LEAD,
			new float[]{4f, -2.6f},new float[]{3f,-2.8f},new float[]{6f,-3.1f},new float[]{0,-1f},new float[]{3.5f,-3f},new Properties());

	public static final List<Item> LEAD_ARMOR = registerArmor(ModArmorMaterials.LEAD,
			new Properties());
	public static final List<Block> LEAD_BLOCKS = registerAllBlocks("lead",  new float[]{4f, 6f},SoundType.STONE,MapColor.COLOR_GRAY,BlockBehaviour.Properties.of(),new Properties());

	public static final List<Item> MYTHRIL_ITEMS = registerAllItems("mythril", ModToolTiers.MYTHRIL,
			new float[]{8f, -2.8f},new float[]{5f,-2.8f},new float[]{9f,-2.8f},new float[]{1,-2f},new float[]{5.5f,-3f},new Properties().rarity(Rarity.EPIC));

	public static final List<Item> MYTHRIL_ARMOR = registerArmor(ModArmorMaterials.MYTHRIL,
			new Properties().rarity(Rarity.EPIC));
	public static final List<Block> MYTHRIL_BLOCKS = registerAllBlocks("mythril",  new float[]{10f, 12f},SoundType.DEEPSLATE,MapColor.COLOR_LIGHT_GREEN,BlockBehaviour.Properties.of(),new Properties().rarity(Rarity.EPIC));

	public static final List<Item> OBSIDIAN_ITEMS = registerAllItems("obsidian", ModToolTiers.OBSIDIAN,
			new float[]{9f, -3.2f},new float[]{4f,-2.8f},new float[]{10f,-3.6f},new float[]{1,-1f},new float[]{4.5f,-3f},new Properties().fireResistant().rarity(Rarity.UNCOMMON));

	public static final List<Item> OBSIDIAN_ARMOR = registerArmor(ModArmorMaterials.OBSIDIAN,
			new Properties().rarity(Rarity.UNCOMMON));

	public static final Block OBSIDIAN_BLOCK = registerBlock("obsidian_block", new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
					.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)),
			new Properties().fireResistant().rarity(Rarity.UNCOMMON));

	public static final Block RAW_OBSIDIAN_BLOCK = registerBlock("raw_obsidian_block", new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
					.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)),
			new Properties().fireResistant().rarity(Rarity.UNCOMMON));


	public static final List<Item> ORICHALCUM_ITEMS = registerAllItems("orichalcum", ModToolTiers.ORICHALCUM,
			new float[]{7.5f, -2f},new float[]{4f,-2.8f},new float[]{8f,-3f},new float[]{0,-1f},new float[]{4.5f,-3f},new Properties().rarity(Rarity.RARE));

	public static final List<Item> ORICHALCUM_ARMOR = registerArmor(ModArmorMaterials.ORICHALCUM,
			new Properties().rarity(Rarity.RARE));
	public static final List<Block> ORICHALCUM_BLOCKS = registerAllBlocks("orichalcum",  new float[]{8f, 10f},SoundType.DEEPSLATE,MapColor.COLOR_PINK,BlockBehaviour.Properties.of(),new Properties().rarity(Rarity.RARE));

	public static final List<Item> PALLADIUM_ITEMS = registerAllItems("palladium", ModToolTiers.PALLADIUM,
			new float[]{6f, -2.4f},new float[]{3f,-2.8f},new float[]{8f,-3.1f},new float[]{1,0f},new float[]{4.5f,-3f},new Properties().rarity(Rarity.UNCOMMON));

	public static final List<Item> PALLADIUM_ARMOR = registerArmor(ModArmorMaterials.PALLADIUM,
			new Properties().rarity(Rarity.UNCOMMON));
	public static final List<Block> PALLADIUM_BLOCKS = registerAllBlocks("palladium",  new float[]{6f, 8f},SoundType.STONE,MapColor.COLOR_RED,BlockBehaviour.Properties.of(),new Properties().rarity(Rarity.UNCOMMON));

	public static final List<Item> PLATINUM_ITEMS = registerAllItems("platinum", ModToolTiers.PLATINUM,
			new float[]{6f, -2.4f},new float[]{1f,-2.8f},new float[]{7f,-3f},new float[]{0f,-3f},new float[]{1.5f,-3f},new Properties().rarity(Rarity.UNCOMMON));

	public static final List<Item> PLATINUM_ARMOR = registerArmor(ModArmorMaterials.PLATINUM,
			new Properties().rarity(Rarity.UNCOMMON));
	public static final List<Block> PLATINUM_BLOCKS = registerAllBlocks("platinum",  new float[]{6f, 8f},SoundType.STONE,MapColor.COLOR_GRAY,BlockBehaviour.Properties.of(),new Properties().rarity(Rarity.UNCOMMON));

	public static final List<Item> SILVER_ITEMS = registerAllItems("silver", ModToolTiers.SILVER,
			new float[]{5f, -2f},new float[]{3f,-2.8f},new float[]{6f,-3.1f},new float[]{0,0f},new float[]{3.5f,-3f},new Properties());

	public static final List<Item> SILVER_ARMOR = registerArmor(ModArmorMaterials.SILVER,
			new Properties());
	public static final List<Block> SILVER_BLOCKS = registerAllBlocks("silver",  new float[]{4f, 6f},SoundType.STONE,MapColor.COLOR_GRAY,BlockBehaviour.Properties.of(),new Properties());

	public static final List<Item> TIN_ITEMS = registerAllItems("tin", ModToolTiers.TIN,
			new float[]{4f, -2.4f},new float[]{2f,-2.8f},new float[]{6f,-3.2f},new float[]{0,-2f},new float[]{2.5f,-3f},new Properties());

	public static final List<Item> TIN_ARMOR = registerArmor(ModArmorMaterials.TIN,
			new Properties());
	public static final List<Block> TIN_BLOCKS = registerAllBlocks("tin",  new float[]{4f, 6f},SoundType.STONE,MapColor.COLOR_BROWN,BlockBehaviour.Properties.of(),new Properties());

	public static final List<Item> TITANIUM_ITEMS = registerAllItems("titanium", ModToolTiers.TITANIUM,
			new float[]{8f, -2.6f},new float[]{4f,-2.8f},new float[]{8f,-3f},new float[]{1,-2f},new float[]{5.5f,-3f},new Properties().rarity(Rarity.EPIC));

	public static final List<Item> TITANIUM_ARMOR = registerArmor(ModArmorMaterials.TITANIUM,
			new Properties().rarity(Rarity.EPIC));
	public static final List<Block> TITANIUM_BLOCKS = registerAllBlocks("titanium",  new float[]{10f, 14f},SoundType.DEEPSLATE,MapColor.COLOR_CYAN,BlockBehaviour.Properties.of(),new Properties().rarity(Rarity.EPIC));

	public static final List<Item> TUNGSTEM_ITEMS = registerAllItems("tungsten", ModToolTiers.TUNGSTEN,
			new float[]{5f, -2.4f},new float[]{3f,-2.8f},new float[]{6f,-3.1f},new float[]{0,-1f},new float[]{3.5f,-3f},new Properties());

	public static final List<Item> TUNGSTEM_ARMOR = registerArmor(ModArmorMaterials.TUNGSTEN,
			new Properties());
	public static final List<Block> TUNGSTEM_BLOCKS = registerAllBlocks("tungsten",  new float[]{4f, 6f},SoundType.STONE,MapColor.COLOR_GREEN,BlockBehaviour.Properties.of(),new Properties());

	public static final List<Item> COPPER_ITEMS =  registerTools("copper", ModToolTiers.COPPER,
			new float[]{4f, -2.5f},new float[]{2f,-2.8f},new float[]{6f,-3.2f},new float[]{0,-2f},new float[]{2.5f,-3f},new Properties());

	public static final List<Item> COPPER_ARMOR = registerArmor(ModArmorMaterials.COPPER,
			new Properties());

	public static final List<Item> AMETHYST_ITEMS = registerTools("amethyst", ModToolTiers.AMETHYST,
			new float[]{5f, -2.4f},new float[]{2f,-2.8f},new float[]{6f,-3.2f},new float[]{0,-2f},new float[]{2.5f,-3f},new Properties());

	public static final List<Item> AMETHYST_ARMOR = registerArmor(ModArmorMaterials.AMETHYST,
			new Properties());

	public static final List<Item> EMERALD_ITEMS =  registerTools("emerald", ModToolTiers.EMERALD,
			new float[]{6f, -2.6f},new float[]{2f,-2.8f},new float[]{7f,-3.2f},new float[]{0,-2f},new float[]{2.5f,-3f},new Properties());

	public static final List<Item> EMERALD_ARMOR = registerArmor(ModArmorMaterials.EMERALD,
			new Properties());

	public static Item registerItem(String name, Item item) {
		var itemReg = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), item);
		ITEMS.add(itemReg);
		return itemReg;
	}

	public static Block registerBlock(String name, Block block, Properties itemProp) {
		registerItem(name, new BlockItem(block, itemProp));
		return registerBlock(name, block);
	}

	public static Block registerBlock(String name, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name), block);
	}

	private static List<Item> registerAllItems(String name, Tier tier,
			float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
			Properties itemProp) {
		return List.of(
				registerItem("raw_" + name, new Item(itemProp)),
				registerItem(name + "_ingot", new Item(itemProp)),
				registerItem(name + "_nugget", new Item(itemProp)),

				registerItem(name + "_sword", new SwordItem(tier, (int) swordattr[0], swordattr[1], itemProp)),
				registerItem(name + "_pickaxe", new PickaxeItem(tier, (int) pickaxeattr[0], pickaxeattr[1], itemProp)),
				registerItem(name + "_axe", new AxeItem(tier, axeattr[0], axeattr[1], itemProp)),
				registerItem(name + "_hoe", new HoeItem(tier, (int) hoeattr[0], hoeattr[1], itemProp)),
				registerItem(name + "_shovel", new ShovelItem(tier, shovelattr[0], shovelattr[1], itemProp)));
	}

	private static List<Item> registerTools(String name, Tier tier,
			float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
			Properties itemProp) {
		return List.of(
				registerItem(name + "_sword", new SwordItem(tier, (int) swordattr[0], swordattr[1], itemProp)),
				registerItem(name + "_pickaxe", new PickaxeItem(tier, (int) pickaxeattr[0], pickaxeattr[1], itemProp)),
				registerItem(name + "_axe", new AxeItem(tier, axeattr[0], axeattr[1], itemProp)),
				registerItem(name + "_hoe", new HoeItem(tier, (int) hoeattr[0], hoeattr[1], itemProp)),
				registerItem(name + "_shovel", new ShovelItem(tier, shovelattr[0], shovelattr[1], itemProp)));
	}

	private static List<Item> registerArmor(ArmorMaterial material, Properties itemProp) {
		String name = material.getName()
				.substring(material.getName().indexOf(ResourceLocation.NAMESPACE_SEPARATOR) + 1);
		return List.of(
				registerItem(name + "_helmet", new ArmorItem(material, Type.HELMET, itemProp)),
				registerItem(name + "_chestplate", new ArmorItem(material, Type.CHESTPLATE, itemProp)),
				registerItem(name + "_leggings", new ArmorItem(material, Type.LEGGINGS, itemProp)),
				registerItem(name + "_boots", new ArmorItem(material, Type.BOOTS, itemProp)));
	}

	private static List<Block> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock,
			MapColor color, BlockBehaviour.Properties blockProp, Properties itemProp) {
		return List.of(
				registerBlock(name + "_block", new Block(blockProp.mapColor(color)
						.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), itemProp),

				registerBlock(name + "_ore", new Block(blockProp.mapColor(color)
						.strength(strengthattr[0], strengthattr[1]).requiresCorrectToolForDrops().sound(soundblock)),
						itemProp),

				registerBlock("raw_" + name + "_block", new Block(blockProp.mapColor(color)
						.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), itemProp));
	}

	public static void init() {
		System.out.println("Registrando Items para " + MOD_ID);
	}

}
