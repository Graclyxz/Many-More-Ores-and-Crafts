package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.items.ModMaterials;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Function;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ManyMoreOresAndCraftsModItems {

	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, MOD_ID);


	public static final RegistryObject<Item> ADAMANTITEINGOT = registerItem("adamantiteingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> COBALTINGOT = registerItem("cobaltingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> INFERNALINGOT = registerItem("infernalingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> LEADINGOT = registerItem("leadingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> MYTHRILINGOT = registerItem("mythrilingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> OBSIDIANINGOT = registerItem("obsidianingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> ORICHALCUMINGOT = registerItem("orichalcumingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> PALLADIUMINGOT = registerItem("palladiumingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> PLATINUMINGOT = registerItem("platinumingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> SILVERINGOT = registerItem("silveringot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> TININGOT = registerItem("tiningot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> TITANIUMINGOT = registerItem("titaniumingot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> TUNGSTENINGOT = registerItem("tungsteningot", Item::new, new Item.Properties());
	public static final RegistryObject<Item> ADAMANTITENUGGET = registerItem("adamantitenugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> COBALTNUGGET = registerItem("cobaltnugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> INFERNALNUGGET = registerItem("infernalnugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> LEADNUGGET = registerItem("leadnugget",Item::new, new Item.Properties());
	public static final RegistryObject<Item> MYTHRILNUGGET = registerItem("mythrilnugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> OBSIDIANNUGGET = registerItem("obsidiannugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> ORICHALCUMNUGGET = registerItem("orichalcumnugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> PALLADIUMNUGGET = registerItem("palladiumnugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> PLATINUMNUGGET = registerItem("platinumnugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> SILVERNUGGET = registerItem("silvernugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> TINNUGGET = registerItem("tinnugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> TITANIUMNUGGET = registerItem("titaniumnugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> TUNGSTENNUGGET = registerItem("tungstennugget", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWADAMANTITE = registerItem("rawadamantite", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWCOBALT = registerItem("rawcobalt", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWINFERNAL = registerItem("rawinfernal", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWLEAD = registerItem("rawlead", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWMYTHRIL = registerItem("rawmythril", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWORICHALCUM = registerItem("raworichalcum", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWPALLADIUM = registerItem("rawpalladium", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWPLATINUM = registerItem("rawplatinum", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWSILVER = registerItem("rawsilver", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWTIN = registerItem("rawtin", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWTITANIUM = registerItem("rawtitanium", Item::new, new Item.Properties());
	public static final RegistryObject<Item> RAWTUNGSTEN = registerItem("rawtungsten", Item::new, new Item.Properties());

	public static final List<RegistryObject<Item>> ADAMANTITE_ARMOR = registerArmor(ModMaterials.Armor.ADAMANTITE, new Item.Properties());
	public static final List<RegistryObject<Item>> COBALT_ARMOR = registerArmor(ModMaterials.Armor.COBALT, new Item.Properties());
	public static final List<RegistryObject<Item>> AMETHYST_ARMOR = registerArmor(ModMaterials.Armor.AMETHYST, new Item.Properties());
	public static final List<RegistryObject<Item>> INFERNAL_ARMOR = registerArmor(ModMaterials.Armor.INFERNAL, new Item.Properties());
	public static final List<RegistryObject<Item>> LEAD_ARMOR = registerArmor(ModMaterials.Armor.LEAD, new Item.Properties());
	public static final List<RegistryObject<Item>> MYTHRIL_ARMOR = registerArmor(ModMaterials.Armor.MYTHRIL, new Item.Properties());
	public static final List<RegistryObject<Item>> OBSIDIAN_ARMOR = registerArmor(ModMaterials.Armor.OBSIDIAN, new Item.Properties());
	public static final List<RegistryObject<Item>> ORICHALCUM_ARMOR = registerArmor(ModMaterials.Armor.ORICHALCUM, new Item.Properties());
	public static final List<RegistryObject<Item>> PALLADIUM_ARMOR = registerArmor(ModMaterials.Armor.PALLADIUM, new Item.Properties());
	public static final List<RegistryObject<Item>> PLATINUM_ARMOR = registerArmor(ModMaterials.Armor.PLATINUM, new Item.Properties());
	public static final List<RegistryObject<Item>> SILVER_ARMOR = registerArmor(ModMaterials.Armor.SILVER, new Item.Properties());
	public static final List<RegistryObject<Item>> TIN_ARMOR = registerArmor(ModMaterials.Armor.TIN, new Item.Properties());
	public static final List<RegistryObject<Item>> TITANIUM_ARMOR = registerArmor(ModMaterials.Armor.TITANIUM, new Item.Properties());
	public static final List<RegistryObject<Item>> TUNGSTEN_ARMOR = registerArmor(ModMaterials.Armor.TUNGSTEN, new Item.Properties());

	public static final List<RegistryObject<Item>> ADAMANTITE_TOOLS = registerTools("adamantite", ModMaterials.Tool.ADAMANTITE,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> COBALT_TOOLS = registerTools("amethyst", ModMaterials.Tool.COBALT,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> AMETHYST_TOOLS = registerTools("cobalt", ModMaterials.Tool.AMETHYST,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> INFERNAL_TOOLS = registerTools("infernal", ModMaterials.Tool.INFERNAL,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> LEAD_TOOLS = registerTools("lead", ModMaterials.Tool.LEAD,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> MYTHRIL_TOOLS = registerTools("mythril", ModMaterials.Tool.MYTHRIL,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> OBSIDIAN_TOOLS = registerTools("obsidian", ModMaterials.Tool.OBSIDIAN,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> ORICHALCUM_TOOLS = registerTools("orichalcum", ModMaterials.Tool.ORICHALCUM,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> PALLADIUM_TOOLS = registerTools("palladium", ModMaterials.Tool.PALLADIUM,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> PLATINUM_TOOLS = registerTools("platinum", ModMaterials.Tool.PLATINUM,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> SILVER_TOOLS = registerTools("silver", ModMaterials.Tool.SILVER,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> TIN_TOOLS = registerTools("tin", ModMaterials.Tool.TIN,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> TITANIUM_TOOLS = registerTools("titanium", ModMaterials.Tool.TITANIUM,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));
	public static final List<RegistryObject<Item>> TUNGSTEN_TOOLS = registerTools("tungsten", ModMaterials.Tool.TUNGSTEN,
			new float[]{6f, -3f, -2f, -1f}, new Item.Properties().rarity(Rarity.RARE));


	public static RegistryObject<Item> registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
		return REGISTRY.register(name, () -> function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
	}

	private static List<RegistryObject<Item>> registerTools(String name, ToolMaterial material, float[] attr, Item.Properties itemProp) {
		return List.of(
				registerItem(name + "_sword", (p) -> new SwordItem(material, 3f, -2.4f, p), itemProp),
				registerItem(name + "_pickaxe", (p) -> new PickaxeItem(material, 1f, -2.8f, p), itemProp),
				registerItem(name + "_axe", (p) -> new AxeItem(material, attr[0], attr[1], p), itemProp),
				registerItem(name + "_shovel", (p) -> new ShovelItem(material, 1.5f, -3f, p), itemProp),
				registerItem(name + "_hoe", (p) -> new HoeItem(material, attr[2], attr[3], p), itemProp)
		);
	}

	private static List<RegistryObject<Item>> registerArmor(ArmorMaterial material, Item.Properties itemProp) {
		String name = material.modelId().getPath();
		return List.of(
				registerItem(name + "_helmet", (p) -> new ArmorItem(material, ArmorType.HELMET, p), itemProp),
				registerItem(name + "_chestplate", (p) -> new ArmorItem(material, ArmorType.CHESTPLATE, p), itemProp),
				registerItem(name + "_leggings", (p) -> new ArmorItem(material, ArmorType.LEGGINGS, p), itemProp),
				registerItem(name + "_boots", (p) -> new ArmorItem(material, ArmorType.BOOTS, p), itemProp)
		);
	}

	public static void init(IEventBus bus) {
		REGISTRY.register(bus);
	}
}
