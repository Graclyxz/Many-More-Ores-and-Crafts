package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.block.*;
import com.graclyxz.manymoreoresandcrafts.item.*;
import com.graclyxz.manymoreoresandcrafts.item.armors.BaseArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;
import static net.minecraft.world.item.ArmorItem.*;

public class ManyMoreOresAndCraftsModItems {

	public static final List<Item> ITEMS = new ArrayList<>();

	public static final Item ADAMANTITEINGOT = registerItem("adamantiteingot", new AdamantiteingotItem(new FabricItemSettings()));
	public static final Item COBALTINGOT = registerItem("cobaltingot", new CobaltingotItem(new FabricItemSettings()));
	public static final Item INFERNALINGOT = registerItem("infernalingot", new InfernalingotItem(new FabricItemSettings()));
	public static final Item LEADINGOT = registerItem("leadingot", new LeadingotItem(new FabricItemSettings()));
	public static final Item MYTHRILINGOT = registerItem("mythrilingot", new MythrilingotItem(new FabricItemSettings()));
	public static final Item OBSIDIANINGOT = registerItem("obsidianingot", new ObsidianingotItem(new FabricItemSettings()));
	public static final Item ORICHALCUMINGOT = registerItem("orichalcumingot", new OrichalcumingotItem(new FabricItemSettings()));
	public static final Item PALLADIUMINGOT = registerItem("palladiumingot", new PalladiumingotItem(new FabricItemSettings()));
	public static final Item PLATINUMINGOT = registerItem("platinumingot", new PlatinumingotItem(new FabricItemSettings()));
	public static final Item SILVERINGOT = registerItem("silveringot", new SilveringotItem(new FabricItemSettings()));
	public static final Item TININGOT = registerItem("tiningot", new TiningotItem(new FabricItemSettings()));
	public static final Item TITANIUMINGOT = registerItem("titaniumingot", new TitaniumingotItem(new FabricItemSettings()));
	public static final Item TUNGSTENINGOT = registerItem("tungsteningot", new TungsteningotItem(new FabricItemSettings()));

	public static final Item ADAMANTITENUGGET = registerItem("adamantitenugget", new AdamantitenuggetItem(new FabricItemSettings()));
	public static final Item COBALTNUGGET = registerItem("cobaltnugget", new CobaltnuggetItem(new FabricItemSettings()));
	public static final Item INFERNALNUGGET = registerItem("infernalnugget", new InfernalnuggetItem(new FabricItemSettings()));
	public static final Item LEADNUGGET = registerItem("leadnugget", new LeadnuggetItem(new FabricItemSettings()));
	public static final Item MYTHRILNUGGET = registerItem("mythrilnugget", new MythrilnuggetItem(new FabricItemSettings()));
	public static final Item OBSIDIANNUGGET = registerItem("obsidiannugget", new ObsidiannuggetItem(new FabricItemSettings()));
	public static final Item ORICHALCUMNUGGET = registerItem("orichalcumnugget", new OrichalcumnuggetItem(new FabricItemSettings()));
	public static final Item PALLADIUMNUGGET = registerItem("palladiumnugget", new PalladiumnuggetItem(new FabricItemSettings()));
	public static final Item PLATINUMNUGGET = registerItem("platinumnugget", new PlatinumnuggetItem(new FabricItemSettings()));
	public static final Item SILVERNUGGET = registerItem("silvernugget", new SilvernuggetItem(new FabricItemSettings()));
	public static final Item TINNUGGET = registerItem("tinnugget", new TinnuggetItem(new FabricItemSettings()));
	public static final Item TITANIUMNUGGET = registerItem("titaniumnugget", new TitaniumnuggetItem(new FabricItemSettings()));
	public static final Item TUNGSTENNUGGET = registerItem("tungstennugget", new TungstennuggetItem(new FabricItemSettings()));

	public static final Item RAWADAMANTITE = registerItem("rawadamantite", new RawadamantiteItem(new FabricItemSettings()));
	public static final Item RAWCOBALT = registerItem("rawcobalt", new RawcobaltItem(new FabricItemSettings()));
	public static final Item RAWINFERNAL = registerItem("rawinfernal", new RawinfernalItem(new FabricItemSettings()));
	public static final Item RAWLEAD = registerItem("rawlead", new RawleadItem(new FabricItemSettings()));
	public static final Item RAWMYTHRIL = registerItem("rawmythril", new RawmythrilItem(new FabricItemSettings()));
	public static final Item RAWORICHALCUM = registerItem("raworichalcum", new RaworichalcumItem(new FabricItemSettings()));
	public static final Item RAWPALLADIUM = registerItem("rawpalladium", new RawpalladiumItem(new FabricItemSettings()));
	public static final Item RAWPLATINUM = registerItem("rawplatinum", new RawplatinumItem(new FabricItemSettings()));
	public static final Item RAWSILVER = registerItem("rawsilver", new RawsilverItem(new FabricItemSettings()));
	public static final Item RAWTIN = registerItem("rawtin", new RawtinItem(new FabricItemSettings()));
	public static final Item RAWTITANIUM = registerItem("rawtitanium", new RawtitaniumItem(new FabricItemSettings()));
	public static final Item RAWTUNGSTEN = registerItem("rawtungsten", new RawtungstenItem(new FabricItemSettings()));

	public static final Block DEEPSLATEADAMANTITEORE = registerBlock("deepslateadamantiteore", new DeepslateadamantiteoreBlock(), new Item.Properties());
	public static final Block COBALTORE = registerBlock("cobaltore", new CobaltoreBlock(), new Item.Properties());
	public static final Block NETHERINFERNALORE = registerBlock("netherinfernalore", new NetherinfernaloreBlock(), new Item.Properties());
	public static final Block LEADORE = registerBlock("leadore", new LeadoreBlock(), new Item.Properties());
	public static final Block DEEPSLATEMYTHRILORE = registerBlock("deepslatemythrilore", new DeepslatemythriloreBlock(), new Item.Properties());
	public static final Block DEEPSLATEORICHALCUMORE = registerBlock("deepslateorichalcumore", new DeepslateorichalcumoreBlock(), new Item.Properties());
	public static final Block PALLADIUMORE = registerBlock("palladiumore", new PalladiumoreBlock(), new Item.Properties());
	public static final Block PLATINUMORE = registerBlock("platinumore", new PlatinumoreBlock(), new Item.Properties());
	public static final Block SILVERORE = registerBlock("silverore", new SilveroreBlock(), new Item.Properties());
	public static final Block TINORE = registerBlock("tinore", new TinoreBlock(), new Item.Properties());
	public static final Block TITANIUMORE = registerBlock("titaniumore", new TitaniumoreBlock(), new Item.Properties());
	public static final Block TUNGSTENORE = registerBlock("tungstenore", new TungstenoreBlock(), new Item.Properties());

	public static final Block ADAMANTITEBLOCK = registerBlock("adamantiteblock", new AdamantiteblockBlock(), new Item.Properties());
	public static final Block RAWADAMANTITEBLOCK = registerBlock("rawadamantiteblock", new RawadamantiteblockBlock(), new Item.Properties());
	public static final Block COBALTBLOCK = registerBlock("cobaltblock", new CobaltblockBlock(), new Item.Properties());
	public static final Block INFERNALBLOCK = registerBlock("infernalblock", new InfernalblockBlock(), new Item.Properties());
	public static final Block LEADBLOCK = registerBlock("leadblock", new LeadblockBlock(), new Item.Properties());
	public static final Block MYTHRILBLOCK = registerBlock("mythrilblock", new MythrilblockBlock(), new Item.Properties());
	public static final Block OBSIDIANBLOCK = registerBlock("obsidianblock", new ObsidianblockBlock(), new Item.Properties());
	public static final Block ORICHALCUMBLOCK = registerBlock("orichalcumblock", new OrichalcumblockBlock(), new Item.Properties());
	public static final Block PALLADIUMBLOCK = registerBlock("palladiumblock", new PalladiumblockBlock(), new Item.Properties());
	public static final Block PLATINUMBLOCK = registerBlock("platinumblock", new PlatinumblockBlock(), new Item.Properties());
	public static final Block SILVERBLOCK = registerBlock("silverblock", new SilverblockBlock(), new Item.Properties());
	public static final Block TINBLOCK = registerBlock("tinblock", new TinblockBlock(), new Item.Properties());
	public static final Block TITANIUMBLOCK = registerBlock("titaniumblock", new TitaniumblockBlock(), new Item.Properties());
	public static final Block TUNGSTENBLOCK = registerBlock("tungstenblock", new TungstenblockBlock(), new Item.Properties());

	public static final Block RAWCOBALTBLOCK = registerBlock("rawcobaltblock",new RawcobaltblockBlock(), new Item.Properties());
	public static final Block RAWINFERNALBLOCK = registerBlock("rawinfernalblock", new RawinfernalblockBlock(), new Item.Properties());
	public static final Block RAWLEADBLOCK = registerBlock("rawleadblock", new RawleadblockBlock(), new Item.Properties());
	public static final Block RAWMYTHRILBLOCK = registerBlock("rawmythrilblock", new RawmythrilblockBlock(), new Item.Properties());
	public static final Block RAWORICHALCUMBLOCK = registerBlock("raworichalcumblock", new RaworichalcumblockBlock(), new Item.Properties());
	public static final Block RAWPALLADIUMBLOCK = registerBlock("rawpalladiumblock", new RawpalladiumblockBlock(), new Item.Properties());
	public static final Block RAWPLATINUMBLOCK = registerBlock("rawplatinumblock", new RawplatinumblockBlock(), new Item.Properties());
	public static final Block RAWSILVERBLOCK = registerBlock("rawsilverblock", new RawsilverblockBlock(), new Item.Properties());
	public static final Block RAWTINBLOCK = registerBlock("rawtinblock", new RawtinblockBlock(), new Item.Properties());
	public static final Block RAWTITANIUMBLOCK = registerBlock("rawtitaniumblock",new RawtitaniumblockBlock(), new Item.Properties());
	public static final Block RAWTUNGSTENBLOCK = registerBlock("rawtungstenblock", new RawtungstenblockBlock(), new Item.Properties());

	public static final List<Item> SILVER_ARMOR = registerArmor(ModArmorMaterials.SILVER, new Item.Properties());



	public static Item registerItem(String name, Item item) {
		var itemReg = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), item);
		ITEMS.add(itemReg);
		return itemReg;
	}

	public static Block registerBlock(String name, Block block, Item.Properties itemProp) {
		registerItem(name, new BlockItem(block, itemProp));
		return registerBlock(name, block);
	}

	public static Block registerBlock(String name, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name), block);
	}

	private static List<Item> registerArmor(ArmorMaterial material, Item.Properties itemProp) {
		String name = material.getName().substring(material.getName().indexOf(ResourceLocation.NAMESPACE_SEPARATOR) + 1);
		return List.of(
				registerItem(name + "_helmet", new BaseArmorItem(material, Type.HELMET, itemProp)),
				registerItem(name + "_chestplate", new BaseArmorItem(material, Type.CHESTPLATE, itemProp)),
				registerItem(name + "_leggings", new BaseArmorItem(material, Type.LEGGINGS, itemProp)),
				registerItem(name + "_boots", new BaseArmorItem(material, Type.BOOTS, itemProp))
		);
	}

	public static void init() {
		System.out.println("Registrando Items para " + MOD_ID);
	}

}
