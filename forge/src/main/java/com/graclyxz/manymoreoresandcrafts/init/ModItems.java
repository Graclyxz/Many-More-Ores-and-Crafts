package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.util.ModTiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;


import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MOD_ID);

	public static final List<RegistryObject<Item>> ADAMANTITE_ITEMS = registerAllItems("adamantite", ModTiers.ADAMANTITE,
			new float[]{7.5f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0f, 0f}, new float[]{4.5f, -3f},
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> ADAMANTITE_ARMOR = registerArmor(ModMaterials.ADAMANTITE,
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Block>> ADAMANTITE_BLOCKS = registerAllBlocks("adamantite",  new float[]{8f, 10f}, SoundType.DEEPSLATE, MapColor.COLOR_RED,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> COBALT_ITEMS = registerAllItems("cobalt", ModTiers.COBALT,
			new float[]{6f, -2f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, 0f}, new float[]{4.5f, -3f},
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<RegistryObject<Item>> COBALT_ARMOR = registerArmor(ModMaterials.COBALT,
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<RegistryObject<Block>> COBALT_BLOCKS = registerAllBlocks("cobalt",  new float[]{6f, 8f}, SoundType.STONE, MapColor.COLOR_BLUE,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.UNCOMMON));

	public static final List<RegistryObject<Item>> INFERNAL_ITEMS = registerAllItems("infernal", ModTiers.INFERNAL,
			new float[]{7f, -1.8f}, new float[]{4f, -2.8f}, new float[]{8f, -2.6f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
			new Item.Properties().fireResistant().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> INFERNAL_ARMOR = registerArmor(ModMaterials.INFERNAL,
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Block>> INFERNAL_BLOCKS = registerAllBlocks("infernal",  new float[]{8f, 10f}, SoundType.NETHER_ORE, MapColor.COLOR_RED,
			BlockBehaviour.Properties.of(),
			new Item.Properties().fireResistant().rarity(Rarity.RARE));

	public static final List<RegistryObject<Item>> LEAD_ITEMS = registerAllItems("lead", ModTiers.LEAD,
			new float[]{4f, -2.6f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
			new Item.Properties());
	public static final List<RegistryObject<Item>> LEAD_ARMOR = registerArmor(ModMaterials.LEAD,
			new Item.Properties());
	public static final List<RegistryObject<Block>> LEAD_BLOCKS = registerAllBlocks("lead",  new float[]{4f, 6f}, SoundType.STONE,MapColor.COLOR_GRAY,
			BlockBehaviour.Properties.of(),
			new Item.Properties());

	public static final List<RegistryObject<Item>> MYTHRIL_ITEMS = registerAllItems("mythril", ModTiers.MYTHRIL,
			new float[]{8f, -2.8f}, new float[]{5f, -2.8f}, new float[]{9f, -2.8f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
			new Item.Properties().rarity(Rarity.EPIC));
	public static final List<RegistryObject<Item>> MYTHRIL_ARMOR = registerArmor(ModMaterials.MYTHRIL,
			new Item.Properties().rarity(Rarity.EPIC));
	public static final List<RegistryObject<Block>> MYTHRIL_BLOCKS = registerAllBlocks("mythril",  new float[]{10f, 12f}, SoundType.DEEPSLATE, MapColor.COLOR_LIGHT_GREEN,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.EPIC));

	public static final List<RegistryObject<Item>> OBSIDIAN_ITEMS = registerAllItems("obsidian", ModTiers.OBSIDIAN,
			new float[]{9f, -3.2f}, new float[]{4f, -2.8f}, new float[]{10f, -3.6f}, new float[]{1, -1f}, new float[]{4.5f, -3f},
			new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));
	public static final List<RegistryObject<Item>> OBSIDIAN_ARMOR = registerArmor(ModMaterials.OBSIDIAN,
			new Item.Properties().rarity(Rarity.UNCOMMON));

	public static final RegistryObject<Block> OBSIDIAN_BLOCK = registerBlock("obsidian_block", ()-> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
					.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)),
			new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));

	public static final RegistryObject<Block> RAW_OBSIDIAN_BLOCK = registerBlock("raw_obsidian_block", ()-> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
					.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)),
			new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));


	public static final List<RegistryObject<Item>> ORICHALCUM_ITEMS = registerAllItems("orichalcum", ModTiers.ORICHALCUM,
			new float[]{7.5f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> ORICHALCUM_ARMOR = registerArmor(ModMaterials.ORICHALCUM,
			new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Block>> ORICHALCUM_BLOCKS = registerAllBlocks("orichalcum",  new float[]{8f, 10f}, SoundType.DEEPSLATE, MapColor.COLOR_PINK,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.RARE));

	public static final List<RegistryObject<Item>> PALLADIUM_ITEMS = registerAllItems("palladium", ModTiers.PALLADIUM,
			new float[]{6f, -2.4f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{1, 0f}, new float[]{4.5f, -3f},
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<RegistryObject<Item>> PALLADIUM_ARMOR = registerArmor(ModMaterials.PALLADIUM,
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<RegistryObject<Block>> PALLADIUM_BLOCKS = registerAllBlocks("palladium",  new float[]{6f, 8f}, SoundType.STONE, MapColor.COLOR_RED,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.UNCOMMON));

	public static final List<RegistryObject<Item>> PLATINUM_ITEMS = registerAllItems("platinum", ModTiers.PLATINUM,
			new float[]{6f, -2.4f}, new float[]{1f, -2.8f}, new float[]{7f, -3f}, new float[]{0f, -3f}, new float[]{1.5f, -3f},
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<RegistryObject<Item>> PLATINUM_ARMOR = registerArmor(ModMaterials.PLATINUM,
			new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final List<RegistryObject<Block>> PLATINUM_BLOCKS = registerAllBlocks("platinum",  new float[]{6f, 8f}, SoundType.STONE, MapColor.COLOR_GRAY,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.UNCOMMON));

	public static final List<RegistryObject<Item>> SILVER_ITEMS = registerAllItems("silver", ModTiers.SILVER,
			new float[]{5f, -2f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, 0f}, new float[]{3.5f, -3f},
			new Item.Properties());
	public static final List<RegistryObject<Item>> SILVER_ARMOR = registerArmor(ModMaterials.SILVER,
			new Item.Properties());
	public static final List<RegistryObject<Block>> SILVER_BLOCKS = registerAllBlocks("silver",  new float[]{4f, 6f}, SoundType.STONE, MapColor.COLOR_GRAY,
			BlockBehaviour.Properties.of(),
			new Item.Properties());

	public static final List<RegistryObject<Item>> TIN_ITEMS = registerAllItems("tin", ModTiers.TIN,
			new float[]{4f, -2.4f}, new float[]{2f, -2.8f}, new float[]{6f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
			new Item.Properties());
	public static final List<RegistryObject<Item>> TIN_ARMOR = registerArmor(ModMaterials.TIN,
			new Item.Properties());
	public static final List<RegistryObject<Block>> TIN_BLOCKS = registerAllBlocks("tin",  new float[]{4f, 6f}, SoundType.STONE, MapColor.COLOR_BROWN,
			BlockBehaviour.Properties.of(),
			new Item.Properties());

	public static final List<RegistryObject<Item>> TITANIUM_ITEMS = registerAllItems("titanium", ModTiers.TITANIUM,
			new float[]{8f, -2.6f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
			new Item.Properties().rarity(Rarity.EPIC));
	public static final List<RegistryObject<Item>> TITANIUM_ARMOR = registerArmor(ModMaterials.TITANIUM,
			new Item.Properties().rarity(Rarity.EPIC));
	public static final List<RegistryObject<Block>> TITANIUM_BLOCKS = registerAllBlocks("titanium",  new float[]{10f, 14f}, SoundType.DEEPSLATE, MapColor.COLOR_CYAN,
			BlockBehaviour.Properties.of(),
			new Item.Properties().rarity(Rarity.EPIC));

	public static final List<RegistryObject<Item>> TUNGSTEM_ITEMS = registerAllItems("tungsten", ModTiers.TUNGSTEN,
			new float[]{5f, -2.4f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
			new Item.Properties());
	public static final List<RegistryObject<Item>> TUNGSTEM_ARMOR = registerArmor(ModMaterials.TUNGSTEN,
			new Item.Properties());
	public static final List<RegistryObject<Block>> TUNGSTEM_BLOCKS = registerAllBlocks("tungsten",  new float[]{4f, 6f}, SoundType.STONE, MapColor.COLOR_GREEN,
			BlockBehaviour.Properties.of(),
			new Item.Properties());

	public static final List<RegistryObject<Item>> COPPER_ITEMS =  registerItems("copper", ModTiers.COPPER,
			new float[]{4f, -2.5f}, new float[]{2f, -2.8f}, new float[]{6f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
			new Item.Properties());
	public static final List<RegistryObject<Item>> COPPER_ARMOR = registerArmor(ModMaterials.COPPER,
			new Item.Properties());

	public static final List<RegistryObject<Item>> AMETHYST_ITEMS = registerItems("amethyst", ModTiers.AMETHYST,
			new float[]{5f, -2.4f}, new float[]{2f, -2.8f}, new float[]{6f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
			new Item.Properties());
	public static final List<RegistryObject<Item>> AMETHYST_ARMOR = registerArmor(ModMaterials.AMETHYST,
			new Item.Properties());

	public static final List<RegistryObject<Item>> EMERALD_ITEMS =  registerItems("emerald", ModTiers.EMERALD,
			new float[]{6f, -2.6f}, new float[]{2f, -2.8f}, new float[]{7f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
			new Item.Properties());
	public static final List<RegistryObject<Item>> EMERALD_ARMOR = registerArmor(ModMaterials.EMERALD,
			new Item.Properties());

	private static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier, Item.Properties itemProp) {
		var blockReg = registerBlock(name, supplier);
		registerItem(name, () -> new BlockItem(blockReg.get(), itemProp));
		return blockReg;
	}

	private static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier) {
		return BLOCKS.register(name, supplier);
	}

	private static RegistryObject<Item> registerItem(String name, Supplier<Item> supplier) {
		return ITEMS.register(name, supplier);
	}

	private static List<RegistryObject<Item>> registerAllItems(String name, Tier tooltier,
															   float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
															   Item.Properties itemProp) {
		return List.of(
				registerItem( "raw_" + name, () -> new Item(itemProp)),
				registerItem( name +"_ingot", () -> new Item(itemProp)),
				registerItem( name +"_nugget", () -> new Item(itemProp)),

				registerItem(name + "_sword", () -> new SwordItem(tooltier, (int) swordattr[0], swordattr[1], itemProp)),
				registerItem(name + "_pickaxe", () -> new PickaxeItem(tooltier, (int) pickaxeattr[0], pickaxeattr[1], itemProp)),
				registerItem(name + "_axe", () -> new AxeItem(tooltier, axeattr[0], axeattr[1], itemProp)),
				registerItem(name + "_hoe", () -> new HoeItem(tooltier, (int) hoeattr[0], hoeattr[1], itemProp)),
				registerItem(name + "_shovel", () -> new ShovelItem(tooltier, shovelattr[0], shovelattr[1], itemProp))
		);
	}

	private static List<RegistryObject<Item>> registerItems(String name, Tier tooltier,
															   float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
															   Item.Properties itemProp) {
		return List.of(
				registerItem( "raw_" + name, () -> new Item(itemProp)),
				registerItem( name +"_ingot", () -> new Item(itemProp)),
				registerItem( name +"_nugget", () -> new Item(itemProp))
		);
	}


	private static List<RegistryObject<Item>> registerArmor(ArmorMaterial material, Item.Properties itemProp) {
		String name = material.getName().substring(material.getName().indexOf(ResourceLocation.NAMESPACE_SEPARATOR) + 1);
		return List.of(
				registerItem(name + "_helmet", () -> new ArmorItem(material, Type.HELMET, itemProp)),
				registerItem(name + "_chestplate", () -> new ArmorItem(material, Type.CHESTPLATE, itemProp)),
				registerItem(name + "_leggings", () -> new ArmorItem(material, Type.LEGGINGS, itemProp)),
				registerItem(name + "_boots", () -> new ArmorItem(material, Type.BOOTS, itemProp))
		);
	}

	private static List<RegistryObject<Block>> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock, MapColor color, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
		return List.of(
				registerBlock(name +"_block", () -> new Block(blockProp.mapColor(color)
						.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), itemProp),

				registerBlock(name +"_ore", () -> new Block(blockProp.mapColor(color)
						.strength(strengthattr[0],strengthattr[1]).requiresCorrectToolForDrops().sound(soundblock)), itemProp),

				registerBlock("raw_" + name + "_block", () -> new Block(blockProp.mapColor(color)
						.strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), itemProp)
		);
	}

	public static void init(IEventBus bus) {
		BLOCKS.register(bus);
		ITEMS.register(bus);
	}
}
