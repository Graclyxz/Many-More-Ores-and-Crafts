package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.item.amethystItems.*;
import com.graclyxz.manymoreoresandcrafts.item.tinItems.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.graclyxz.manymoreoresandcrafts.item.tungstenItems.TungstenswordItem;
import com.graclyxz.manymoreoresandcrafts.item.tungstenItems.TungstenshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.tungstenItems.TungstenpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.tungstenItems.TungstennuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.tungstenItems.TungsteningotItem;
import com.graclyxz.manymoreoresandcrafts.item.tungstenItems.TungstenhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.tungstenItems.TungstenaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.tungstenItems.TungstenarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.titaniumItems.TitaniumswordItem;
import com.graclyxz.manymoreoresandcrafts.item.titaniumItems.TitaniumshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.titaniumItems.TitaniumpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.titaniumItems.TitaniumnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.titaniumItems.TitaniumingotItem;
import com.graclyxz.manymoreoresandcrafts.item.titaniumItems.TitaniumhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.titaniumItems.TitaniumaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.titaniumItems.TitaniumarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.tinItems.TinarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.silverItems.SilverswordItem;
import com.graclyxz.manymoreoresandcrafts.item.silverItems.SilvershovelItem;
import com.graclyxz.manymoreoresandcrafts.item.silverItems.SilverpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.silverItems.SilvernuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.silverItems.SilveringotItem;
import com.graclyxz.manymoreoresandcrafts.item.silverItems.SilverhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.silverItems.SilveraxeItem;
import com.graclyxz.manymoreoresandcrafts.item.silverItems.SilverarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.tungstenItems.RawtungstenItem;
import com.graclyxz.manymoreoresandcrafts.item.titaniumItems.RawtitaniumItem;
import com.graclyxz.manymoreoresandcrafts.item.silverItems.RawsilverItem;
import com.graclyxz.manymoreoresandcrafts.item.platinumItems.RawplatinumItem;
import com.graclyxz.manymoreoresandcrafts.item.palladiumItems.RawpalladiumItem;
import com.graclyxz.manymoreoresandcrafts.item.orichalcumItems.RaworichalcumItem;
import com.graclyxz.manymoreoresandcrafts.item.mythrilItems.RawmythrilItem;
import com.graclyxz.manymoreoresandcrafts.item.leadItems.RawleadItem;
import com.graclyxz.manymoreoresandcrafts.item.infernalItems.RawinfernalItem;
import com.graclyxz.manymoreoresandcrafts.item.cobaltItems.RawcobaltItem;
import com.graclyxz.manymoreoresandcrafts.item.adamantiteItems.RawadamantiteItem;
import com.graclyxz.manymoreoresandcrafts.item.platinumItems.PlatinumswordItem;
import com.graclyxz.manymoreoresandcrafts.item.platinumItems.PlatinumshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.platinumItems.PlatinumpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.platinumItems.PlatinumnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.platinumItems.PlatinumingotItem;
import com.graclyxz.manymoreoresandcrafts.item.platinumItems.PlatinumhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.platinumItems.PlatinumaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.platinumItems.PlatinumarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.palladiumItems.PalladiumswordItem;
import com.graclyxz.manymoreoresandcrafts.item.palladiumItems.PalladiumshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.palladiumItems.PalladiumpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.palladiumItems.PalladiumnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.palladiumItems.PalladiumingotItem;
import com.graclyxz.manymoreoresandcrafts.item.palladiumItems.PalladiumhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.palladiumItems.PalladiumaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.palladiumItems.PalladiumarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.orichalcumItems.OrichlcumswordItem;
import com.graclyxz.manymoreoresandcrafts.item.orichalcumItems.OrichlcumshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.orichalcumItems.OrichlcumpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.orichalcumItems.OrichlcumhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.orichalcumItems.OrichlcumaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.orichalcumItems.OrichalcumnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.orichalcumItems.OrichalcumingotItem;
import com.graclyxz.manymoreoresandcrafts.item.orichalcumItems.OrichalcumarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.obsidianItems.ObsidianswordItem;
import com.graclyxz.manymoreoresandcrafts.item.obsidianItems.ObsidianshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.obsidianItems.ObsidianpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.obsidianItems.ObsidiannuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.obsidianItems.ObsidianingotItem;
import com.graclyxz.manymoreoresandcrafts.item.obsidianItems.ObsidianhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.obsidianItems.ObsidianaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.obsidianItems.ObsidianarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.mythrilItems.MythrilswordItem;
import com.graclyxz.manymoreoresandcrafts.item.mythrilItems.MythrilshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.mythrilItems.MythrilpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.mythrilItems.MythrilnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.mythrilItems.MythrilingotItem;
import com.graclyxz.manymoreoresandcrafts.item.mythrilItems.MythrilhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.mythrilItems.MythrilaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.mythrilItems.MythrilarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.leadItems.LeadswordItem;
import com.graclyxz.manymoreoresandcrafts.item.leadItems.LeadshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.leadItems.LeadpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.leadItems.LeadnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.leadItems.LeadingotItem;
import com.graclyxz.manymoreoresandcrafts.item.leadItems.LeadhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.leadItems.LeadaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.leadItems.LeadamorItem;
import com.graclyxz.manymoreoresandcrafts.item.infernalItems.InfernalswordItem;
import com.graclyxz.manymoreoresandcrafts.item.infernalItems.InfernalshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.infernalItems.InfernalpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.infernalItems.InfernalnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.infernalItems.InfernalingotItem;
import com.graclyxz.manymoreoresandcrafts.item.infernalItems.InfernalhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.infernalItems.InfernalaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.infernalItems.InfernalarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.cobaltItems.CobaltswordItem;
import com.graclyxz.manymoreoresandcrafts.item.cobaltItems.CobaltshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.cobaltItems.CobaltpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.cobaltItems.CobaltnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.cobaltItems.CobaltingotItem;
import com.graclyxz.manymoreoresandcrafts.item.cobaltItems.CobalthoeItem;
import com.graclyxz.manymoreoresandcrafts.item.cobaltItems.CobaltaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.cobaltItems.CobaltarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.adamantiteItems.AdamantiteswordItem;
import com.graclyxz.manymoreoresandcrafts.item.adamantiteItems.AdamantiteshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.adamantiteItems.AdamantitepickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.adamantiteItems.AdamantitenuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.adamantiteItems.AdamantiteingotItem;
import com.graclyxz.manymoreoresandcrafts.item.adamantiteItems.AdamantitehoeItem;
import com.graclyxz.manymoreoresandcrafts.item.adamantiteItems.AdamantiteaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.adamantiteItems.AdamantitearmorItem;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ManyMoreOresAndCraftsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
	public static final RegistryObject<Item> ADAMANTITEINGOT = REGISTRY.register("adamantiteingot", () -> new AdamantiteingotItem());
	public static final RegistryObject<Item> COBALTINGOT = REGISTRY.register("cobaltingot", () -> new CobaltingotItem());
	public static final RegistryObject<Item> INFERNALINGOT = REGISTRY.register("infernalingot", () -> new InfernalingotItem());
	public static final RegistryObject<Item> LEADINGOT = REGISTRY.register("leadingot", () -> new LeadingotItem());
	public static final RegistryObject<Item> MYTHRILINGOT = REGISTRY.register("mythrilingot", () -> new MythrilingotItem());
	public static final RegistryObject<Item> OBSIDIANINGOT = REGISTRY.register("obsidianingot", () -> new ObsidianingotItem());
	public static final RegistryObject<Item> ORICHALCUMINGOT = REGISTRY.register("orichalcumingot", () -> new OrichalcumingotItem());
	public static final RegistryObject<Item> PALLADIUMINGOT = REGISTRY.register("palladiumingot", () -> new PalladiumingotItem());
	public static final RegistryObject<Item> PLATINUMINGOT = REGISTRY.register("platinumingot", () -> new PlatinumingotItem());
	public static final RegistryObject<Item> SILVERINGOT = REGISTRY.register("silveringot", () -> new SilveringotItem());
	public static final RegistryObject<Item> TININGOT = REGISTRY.register("tiningot", () -> new TiningotItem());
	public static final RegistryObject<Item> TITANIUMINGOT = REGISTRY.register("titaniumingot", () -> new TitaniumingotItem());
	public static final RegistryObject<Item> TUNGSTENINGOT = REGISTRY.register("tungsteningot", () -> new TungsteningotItem());
	public static final RegistryObject<Item> ADAMANTITENUGGET = REGISTRY.register("adamantitenugget", () -> new AdamantitenuggetItem());
	public static final RegistryObject<Item> COBALTNUGGET = REGISTRY.register("cobaltnugget", () -> new CobaltnuggetItem());
	public static final RegistryObject<Item> INFERNALNUGGET = REGISTRY.register("infernalnugget", () -> new InfernalnuggetItem());
	public static final RegistryObject<Item> LEADNUGGET = REGISTRY.register("leadnugget", () -> new LeadnuggetItem());
	public static final RegistryObject<Item> MYTHRILNUGGET = REGISTRY.register("mythrilnugget", () -> new MythrilnuggetItem());
	public static final RegistryObject<Item> OBSIDIANNUGGET = REGISTRY.register("obsidiannugget", () -> new ObsidiannuggetItem());
	public static final RegistryObject<Item> ORICHALCUMNUGGET = REGISTRY.register("orichalcumnugget", () -> new OrichalcumnuggetItem());
	public static final RegistryObject<Item> PALLADIUMNUGGET = REGISTRY.register("palladiumnugget", () -> new PalladiumnuggetItem());
	public static final RegistryObject<Item> PLATINUMNUGGET = REGISTRY.register("platinumnugget", () -> new PlatinumnuggetItem());
	public static final RegistryObject<Item> SILVERNUGGET = REGISTRY.register("silvernugget", () -> new SilvernuggetItem());
	public static final RegistryObject<Item> TINNUGGET = REGISTRY.register("tinnugget", () -> new TinnuggetItem());
	public static final RegistryObject<Item> TITANIUMNUGGET = REGISTRY.register("titaniumnugget", () -> new TitaniumnuggetItem());
	public static final RegistryObject<Item> TUNGSTENNUGGET = REGISTRY.register("tungstennugget", () -> new TungstennuggetItem());
	public static final RegistryObject<Item> RAWADAMANTITE = REGISTRY.register("rawadamantite", () -> new RawadamantiteItem());
	public static final RegistryObject<Item> RAWCOBALT = REGISTRY.register("rawcobalt", () -> new RawcobaltItem());
	public static final RegistryObject<Item> RAWINFERNAL = REGISTRY.register("rawinfernal", () -> new RawinfernalItem());
	public static final RegistryObject<Item> RAWLEAD = REGISTRY.register("rawlead", () -> new RawleadItem());
	public static final RegistryObject<Item> RAWMYTHRIL = REGISTRY.register("rawmythril", () -> new RawmythrilItem());
	public static final RegistryObject<Item> RAWORICHALCUM = REGISTRY.register("raworichalcum", () -> new RaworichalcumItem());
	public static final RegistryObject<Item> RAWPALLADIUM = REGISTRY.register("rawpalladium", () -> new RawpalladiumItem());
	public static final RegistryObject<Item> RAWPLATINUM = REGISTRY.register("rawplatinum", () -> new RawplatinumItem());
	public static final RegistryObject<Item> RAWSILVER = REGISTRY.register("rawsilver", () -> new RawsilverItem());
	public static final RegistryObject<Item> RAWTIN = REGISTRY.register("rawtin", () -> new RawtinItem());
	public static final RegistryObject<Item> RAWTITANIUM = REGISTRY.register("rawtitanium", () -> new RawtitaniumItem());
	public static final RegistryObject<Item> RAWTUNGSTEN = REGISTRY.register("rawtungsten", () -> new RawtungstenItem());
	public static final RegistryObject<Item> ADAMANTITEBLOCK = block(ManyMoreOresAndCraftsModBlocks.ADAMANTITEBLOCK);
	public static final RegistryObject<Item> RAWADAMANTITEBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWADAMANTITEBLOCK);
	public static final RegistryObject<Item> DEEPSLATEADAMANTITEORE = block(ManyMoreOresAndCraftsModBlocks.DEEPSLATEADAMANTITEORE);
	public static final RegistryObject<Item> COBALTORE = block(ManyMoreOresAndCraftsModBlocks.COBALTORE);
	public static final RegistryObject<Item> NETHERINFERNALORE = block(ManyMoreOresAndCraftsModBlocks.NETHERINFERNALORE);
	public static final RegistryObject<Item> LEADORE = block(ManyMoreOresAndCraftsModBlocks.LEADORE);
	public static final RegistryObject<Item> DEEPSLATEMYTHRILORE = block(ManyMoreOresAndCraftsModBlocks.DEEPSLATEMYTHRILORE);
	public static final RegistryObject<Item> DEEPSLATEORICHALCUMORE = block(ManyMoreOresAndCraftsModBlocks.DEEPSLATEORICHALCUMORE);
	public static final RegistryObject<Item> PALLADIUMORE = block(ManyMoreOresAndCraftsModBlocks.PALLADIUMORE);
	public static final RegistryObject<Item> PLATINUMORE = block(ManyMoreOresAndCraftsModBlocks.PLATINUMORE);
	public static final RegistryObject<Item> SILVERORE = block(ManyMoreOresAndCraftsModBlocks.SILVERORE);
	public static final RegistryObject<Item> TINORE = block(ManyMoreOresAndCraftsModBlocks.TINORE);
	public static final RegistryObject<Item> TITANIUMORE = block(ManyMoreOresAndCraftsModBlocks.TITANIUMORE);
	public static final RegistryObject<Item> TUNGSTENORE = block(ManyMoreOresAndCraftsModBlocks.TUNGSTENORE);
	public static final RegistryObject<Item> COBALTBLOCK = block(ManyMoreOresAndCraftsModBlocks.COBALTBLOCK);
	public static final RegistryObject<Item> INFERNALBLOCK = block(ManyMoreOresAndCraftsModBlocks.INFERNALBLOCK);
	public static final RegistryObject<Item> LEADBLOCK = block(ManyMoreOresAndCraftsModBlocks.LEADBLOCK);
	public static final RegistryObject<Item> MYTHRILBLOCK = block(ManyMoreOresAndCraftsModBlocks.MYTHRILBLOCK);
	public static final RegistryObject<Item> OBSIDIANBLOCK = block(ManyMoreOresAndCraftsModBlocks.OBSIDIANBLOCK);
	public static final RegistryObject<Item> ORICHALCUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.ORICHALCUMBLOCK);
	public static final RegistryObject<Item> PALLADIUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.PALLADIUMBLOCK);
	public static final RegistryObject<Item> PLATINUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.PLATINUMBLOCK);
	public static final RegistryObject<Item> SILVERBLOCK = block(ManyMoreOresAndCraftsModBlocks.SILVERBLOCK);
	public static final RegistryObject<Item> TINBLOCK = block(ManyMoreOresAndCraftsModBlocks.TINBLOCK);
	public static final RegistryObject<Item> TITANIUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.TITANIUMBLOCK);
	public static final RegistryObject<Item> TUNGSTENBLOCK = block(ManyMoreOresAndCraftsModBlocks.TUNGSTENBLOCK);
	public static final RegistryObject<Item> RAWCOBALTBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWCOBALTBLOCK);
	public static final RegistryObject<Item> RAWINFERNALBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWINFERNALBLOCK);
	public static final RegistryObject<Item> RAWLEADBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWLEADBLOCK);
	public static final RegistryObject<Item> RAWMYTHRILBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWMYTHRILBLOCK);
	public static final RegistryObject<Item> RAWORICHALCUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWORICHALCUMBLOCK);
	public static final RegistryObject<Item> RAWPALLADIUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWPALLADIUMBLOCK);
	public static final RegistryObject<Item> RAWPLATINUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWPLATINUMBLOCK);
	public static final RegistryObject<Item> RAWSILVERBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWSILVERBLOCK);
	public static final RegistryObject<Item> RAWTINBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWTINBLOCK);
	public static final RegistryObject<Item> RAWTITANIUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWTITANIUMBLOCK);
	public static final RegistryObject<Item> RAWTUNGSTENBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWTUNGSTENBLOCK);

	public static final RegistryObject<Item> ADAMANTITEARMOR_HELMET = REGISTRY.register("adamantitearmor_helmet", AdamantitearmorItem.Helmet::new);
	public static final RegistryObject<Item> ADAMANTITEARMOR_CHESTPLATE = REGISTRY.register("adamantitearmor_chestplate", AdamantitearmorItem.Chestplate::new);
	public static final RegistryObject<Item> ADAMANTITEARMOR_LEGGINGS = REGISTRY.register("adamantitearmor_leggings", () -> new AdamantitearmorItem.Leggings());
	public static final RegistryObject<Item> ADAMANTITEARMOR_BOOTS = REGISTRY.register("adamantitearmor_boots", () -> new AdamantitearmorItem.Boots());
	public static final RegistryObject<Item> COBALTARMOR_HELMET = REGISTRY.register("cobaltarmor_helmet", () -> new CobaltarmorItem.Helmet());
	public static final RegistryObject<Item> COBALTARMOR_CHESTPLATE = REGISTRY.register("cobaltarmor_chestplate", () -> new CobaltarmorItem.Chestplate());
	public static final RegistryObject<Item> COBALTARMOR_LEGGINGS = REGISTRY.register("cobaltarmor_leggings", () -> new CobaltarmorItem.Leggings());
	public static final RegistryObject<Item> COBALTARMOR_BOOTS = REGISTRY.register("cobaltarmor_boots", () -> new CobaltarmorItem.Boots());
	public static final RegistryObject<Item> AMETHYSTARMOR_HELMET = REGISTRY.register("amethystarmor_helmet", () -> new AmethystarmorItem.Helmet());
	public static final RegistryObject<Item> AMETHYSTARMOR_CHESTPLATE = REGISTRY.register("amethystarmor_chestplate", () -> new AmethystarmorItem.Chestplate());
	public static final RegistryObject<Item> AMETHYSTARMOR_LEGGINGS = REGISTRY.register("amethystarmor_leggings", () -> new AmethystarmorItem.Leggings());
	public static final RegistryObject<Item> AMETHYSTARMOR_BOOTS = REGISTRY.register("amethystarmor_boots", () -> new AmethystarmorItem.Boots());
	public static final RegistryObject<Item> INFERNALARMOR_HELMET = REGISTRY.register("infernalarmor_helmet", () -> new InfernalarmorItem.Helmet());
	public static final RegistryObject<Item> INFERNALARMOR_CHESTPLATE = REGISTRY.register("infernalarmor_chestplate", () -> new InfernalarmorItem.Chestplate());
	public static final RegistryObject<Item> INFERNALARMOR_LEGGINGS = REGISTRY.register("infernalarmor_leggings", () -> new InfernalarmorItem.Leggings());
	public static final RegistryObject<Item> INFERNALARMOR_BOOTS = REGISTRY.register("infernalarmor_boots", () -> new InfernalarmorItem.Boots());
	public static final RegistryObject<Item> LEADARMOR_HELMET = REGISTRY.register("leadarmor_helmet", () -> new LeadamorItem.Helmet());
	public static final RegistryObject<Item> LEADARMOR_CHESTPLATE = REGISTRY.register("leadarmor_chestplate", () -> new LeadamorItem.Chestplate());
	public static final RegistryObject<Item> LEADARMOR_LEGGINGS = REGISTRY.register("leadarmor_leggings", () -> new LeadamorItem.Leggings());
	public static final RegistryObject<Item> LEADARMOR_BOOTS = REGISTRY.register("leadarmor_boots", () -> new LeadamorItem.Boots());
	public static final RegistryObject<Item> MYTHRILARMOR_HELMET = REGISTRY.register("mythrilarmor_helmet", () -> new MythrilarmorItem.Helmet());
	public static final RegistryObject<Item> MYTHRILARMOR_CHESTPLATE = REGISTRY.register("mythrilarmor_chestplate", () -> new MythrilarmorItem.Chestplate());
	public static final RegistryObject<Item> MYTHRILARMOR_LEGGINGS = REGISTRY.register("mythrilarmor_leggings", () -> new MythrilarmorItem.Leggings());
	public static final RegistryObject<Item> MYTHRILARMOR_BOOTS = REGISTRY.register("mythrilarmor_boots", () -> new MythrilarmorItem.Boots());
	public static final RegistryObject<Item> OBSIDIANARMOR_HELMET = REGISTRY.register("obsidianarmor_helmet", () -> new ObsidianarmorItem.Helmet());
	public static final RegistryObject<Item> OBSIDIANARMOR_CHESTPLATE = REGISTRY.register("obsidianarmor_chestplate", () -> new ObsidianarmorItem.Chestplate());
	public static final RegistryObject<Item> OBSIDIANARMOR_LEGGINGS = REGISTRY.register("obsidianarmor_leggings", () -> new ObsidianarmorItem.Leggings());
	public static final RegistryObject<Item> OBSIDIANARMOR_BOOTS = REGISTRY.register("obsidianarmor_boots", () -> new ObsidianarmorItem.Boots());
	public static final RegistryObject<Item> ORICHALCUMARMOR_HELMET = REGISTRY.register("orichalcumarmor_helmet", () -> new OrichalcumarmorItem.Helmet());
	public static final RegistryObject<Item> ORICHALCUMARMOR_CHESTPLATE = REGISTRY.register("orichalcumarmor_chestplate", () -> new OrichalcumarmorItem.Chestplate());
	public static final RegistryObject<Item> ORICHALCUMARMOR_LEGGINGS = REGISTRY.register("orichalcumarmor_leggings", () -> new OrichalcumarmorItem.Leggings());
	public static final RegistryObject<Item> ORICHALCUMARMOR_BOOTS = REGISTRY.register("orichalcumarmor_boots", () -> new OrichalcumarmorItem.Boots());
	public static final RegistryObject<Item> PALLADIUMARMOR_HELMET = REGISTRY.register("palladiumarmor_helmet", () -> new PalladiumarmorItem.Helmet());
	public static final RegistryObject<Item> PALLADIUMARMOR_CHESTPLATE = REGISTRY.register("palladiumarmor_chestplate", () -> new PalladiumarmorItem.Chestplate());
	public static final RegistryObject<Item> PALLADIUMARMOR_LEGGINGS = REGISTRY.register("palladiumarmor_leggings", () -> new PalladiumarmorItem.Leggings());
	public static final RegistryObject<Item> PALLADIUMARMOR_BOOTS = REGISTRY.register("palladiumarmor_boots", () -> new PalladiumarmorItem.Boots());
	public static final RegistryObject<Item> PLATINUMARMOR_HELMET = REGISTRY.register("platinumarmor_helmet", () -> new PlatinumarmorItem.Helmet());
	public static final RegistryObject<Item> PLATINUMARMOR_CHESTPLATE = REGISTRY.register("platinumarmor_chestplate", () -> new PlatinumarmorItem.Chestplate());
	public static final RegistryObject<Item> PLATINUMARMOR_LEGGINGS = REGISTRY.register("platinumarmor_leggings", () -> new PlatinumarmorItem.Leggings());
	public static final RegistryObject<Item> PLATINUMARMOR_BOOTS = REGISTRY.register("platinumarmor_boots", () -> new PlatinumarmorItem.Boots());
	public static final RegistryObject<Item> SILVERARMOR_HELMET = REGISTRY.register("silverarmor_helmet", () -> new SilverarmorItem.Helmet());
	public static final RegistryObject<Item> SILVERARMOR_CHESTPLATE = REGISTRY.register("silverarmor_chestplate", () -> new SilverarmorItem.Chestplate());
	public static final RegistryObject<Item> SILVERARMOR_LEGGINGS = REGISTRY.register("silverarmor_leggings", () -> new SilverarmorItem.Leggings());
	public static final RegistryObject<Item> SILVERARMOR_BOOTS = REGISTRY.register("silverarmor_boots", () -> new SilverarmorItem.Boots());

	public static final RegistryObject<Item> TINARMOR_HELMET = REGISTRY.register("tinarmor_helmet", () -> new TinarmorItem.Helmet());
	public static final RegistryObject<Item> TINARMOR_CHESTPLATE = REGISTRY.register("tinarmor_chestplate", () -> new TinarmorItem.Chestplate());
	public static final RegistryObject<Item> TINARMOR_LEGGINGS = REGISTRY.register("tinarmor_leggings", () -> new TinarmorItem.Leggings());
	public static final RegistryObject<Item> TINARMOR_BOOTS = REGISTRY.register("tinarmor_boots", () -> new TinarmorItem.Boots());

	public static final RegistryObject<Item> TITANIUMARMOR_HELMET = REGISTRY.register("titaniumarmor_helmet", () -> new TitaniumarmorItem.Helmet());
	public static final RegistryObject<Item> TITANIUMARMOR_CHESTPLATE = REGISTRY.register("titaniumarmor_chestplate", () -> new TitaniumarmorItem.Chestplate());
	public static final RegistryObject<Item> TITANIUMARMOR_LEGGINGS = REGISTRY.register("titaniumarmor_leggings", () -> new TitaniumarmorItem.Leggings());
	public static final RegistryObject<Item> TITANIUMARMOR_BOOTS = REGISTRY.register("titaniumarmor_boots", () -> new TitaniumarmorItem.Boots());
	public static final RegistryObject<Item> TUNGSTENARMOR_HELMET = REGISTRY.register("tungstenarmor_helmet", () -> new TungstenarmorItem.Helmet());
	public static final RegistryObject<Item> TUNGSTENARMOR_CHESTPLATE = REGISTRY.register("tungstenarmor_chestplate", () -> new TungstenarmorItem.Chestplate());
	public static final RegistryObject<Item> TUNGSTENARMOR_LEGGINGS = REGISTRY.register("tungstenarmor_leggings", () -> new TungstenarmorItem.Leggings());
	public static final RegistryObject<Item> TUNGSTENARMOR_BOOTS = REGISTRY.register("tungstenarmor_boots", () -> new TungstenarmorItem.Boots());
	public static final RegistryObject<Item> ADAMANTITESWORD = REGISTRY.register("adamantitesword", () -> new AdamantiteswordItem());
	public static final RegistryObject<Item> ADAMANTITEPICKAXE = REGISTRY.register("adamantitepickaxe", () -> new AdamantitepickaxeItem());
	public static final RegistryObject<Item> ADAMANTITEAXE = REGISTRY.register("adamantiteaxe", () -> new AdamantiteaxeItem());
	public static final RegistryObject<Item> ADAMANTITESHOVEL = REGISTRY.register("adamantiteshovel", () -> new AdamantiteshovelItem());
	public static final RegistryObject<Item> ADAMANTITEHOE = REGISTRY.register("adamantitehoe", () -> new AdamantitehoeItem());
	public static final RegistryObject<Item> AMETHYSTSWORD = REGISTRY.register("amethystsword", () -> new AmethystswordItem());
	public static final RegistryObject<Item> AMETHYSTPICKAXE = REGISTRY.register("amethystpickaxe", () -> new AmethystpickaxeItem());
	public static final RegistryObject<Item> AMETHYSTAXE = REGISTRY.register("amethystaxe", () -> new AmethystaxeItem());
	public static final RegistryObject<Item> AMETHYSTSHOVEL = REGISTRY.register("amethystshovel", () -> new AmethystshovelItem());
	public static final RegistryObject<Item> AMETHYSTHOE = REGISTRY.register("amethysthoe", () -> new AmethysthoeItem());
	public static final RegistryObject<Item> COBALTSWORD = REGISTRY.register("cobaltsword", () -> new CobaltswordItem());
	public static final RegistryObject<Item> COBALTPICKAXE = REGISTRY.register("cobaltpickaxe", () -> new CobaltpickaxeItem());
	public static final RegistryObject<Item> COBALTAXE = REGISTRY.register("cobaltaxe", () -> new CobaltaxeItem());
	public static final RegistryObject<Item> COBALTSHOVEL = REGISTRY.register("cobaltshovel", () -> new CobaltshovelItem());
	public static final RegistryObject<Item> COBALTHOE = REGISTRY.register("cobalthoe", () -> new CobalthoeItem());
	public static final RegistryObject<Item> INFERNALSWORD = REGISTRY.register("infernalsword", () -> new InfernalswordItem());
	public static final RegistryObject<Item> INFERNALPICKAXE = REGISTRY.register("infernalpickaxe", () -> new InfernalpickaxeItem());
	public static final RegistryObject<Item> INFERNALAXE = REGISTRY.register("infernalaxe", () -> new InfernalaxeItem());
	public static final RegistryObject<Item> INFERNALSHOVEL = REGISTRY.register("infernalshovel", () -> new InfernalshovelItem());
	public static final RegistryObject<Item> INFERNALHOE = REGISTRY.register("infernalhoe", () -> new InfernalhoeItem());
	public static final RegistryObject<Item> LEADSWORD = REGISTRY.register("leadsword", () -> new LeadswordItem());
	public static final RegistryObject<Item> LEADPICKAXE = REGISTRY.register("leadpickaxe", () -> new LeadpickaxeItem());
	public static final RegistryObject<Item> LEADAXE = REGISTRY.register("leadaxe", () -> new LeadaxeItem());
	public static final RegistryObject<Item> LEADSHOVEL = REGISTRY.register("leadshovel", () -> new LeadshovelItem());
	public static final RegistryObject<Item> LEADHOE = REGISTRY.register("leadhoe", () -> new LeadhoeItem());
	public static final RegistryObject<Item> MYTHRILSWORD = REGISTRY.register("mythrilsword", () -> new MythrilswordItem());
	public static final RegistryObject<Item> MYTHRILPICKAXE = REGISTRY.register("mythrilpickaxe", () -> new MythrilpickaxeItem());
	public static final RegistryObject<Item> MYTHRILAXE = REGISTRY.register("mythrilaxe", () -> new MythrilaxeItem());
	public static final RegistryObject<Item> MYTHRILSHOVEL = REGISTRY.register("mythrilshovel", () -> new MythrilshovelItem());
	public static final RegistryObject<Item> MYTHRILHOE = REGISTRY.register("mythrilhoe", () -> new MythrilhoeItem());
	public static final RegistryObject<Item> OBSIDIANSWORD = REGISTRY.register("obsidiansword", () -> new ObsidianswordItem());
	public static final RegistryObject<Item> OBSIDIANPICKAXE = REGISTRY.register("obsidianpickaxe", () -> new ObsidianpickaxeItem());
	public static final RegistryObject<Item> OBSIDIANAXE = REGISTRY.register("obsidianaxe", () -> new ObsidianaxeItem());
	public static final RegistryObject<Item> OBSIDIANSHOVEL = REGISTRY.register("obsidianshovel", () -> new ObsidianshovelItem());
	public static final RegistryObject<Item> OBSIDIANHOE = REGISTRY.register("obsidianhoe", () -> new ObsidianhoeItem());
	public static final RegistryObject<Item> ORICHLCUMSWORD = REGISTRY.register("orichlcumsword", () -> new OrichlcumswordItem());
	public static final RegistryObject<Item> ORICHLCUMPICKAXE = REGISTRY.register("orichlcumpickaxe", () -> new OrichlcumpickaxeItem());
	public static final RegistryObject<Item> ORICHLCUMAXE = REGISTRY.register("orichlcumaxe", () -> new OrichlcumaxeItem());
	public static final RegistryObject<Item> ORICHLCUMSHOVEL = REGISTRY.register("orichlcumshovel", () -> new OrichlcumshovelItem());
	public static final RegistryObject<Item> ORICHLCUMHOE = REGISTRY.register("orichlcumhoe", () -> new OrichlcumhoeItem());
	public static final RegistryObject<Item> PALLADIUMSWORD = REGISTRY.register("palladiumsword", () -> new PalladiumswordItem());
	public static final RegistryObject<Item> PALLADIUMPICKAXE = REGISTRY.register("palladiumpickaxe", () -> new PalladiumpickaxeItem());
	public static final RegistryObject<Item> PALLADIUMAXE = REGISTRY.register("palladiumaxe", () -> new PalladiumaxeItem());
	public static final RegistryObject<Item> PALLADIUMSHOVEL = REGISTRY.register("palladiumshovel", () -> new PalladiumshovelItem());
	public static final RegistryObject<Item> PALLADIUMHOE = REGISTRY.register("palladiumhoe", () -> new PalladiumhoeItem());
	public static final RegistryObject<Item> PLATINUMSWORD = REGISTRY.register("platinumsword", () -> new PlatinumswordItem());
	public static final RegistryObject<Item> PLATINUMPICKAXE = REGISTRY.register("platinumpickaxe", () -> new PlatinumpickaxeItem());
	public static final RegistryObject<Item> PLATINUMAXE = REGISTRY.register("platinumaxe", () -> new PlatinumaxeItem());
	public static final RegistryObject<Item> PLATINUMSHOVEL = REGISTRY.register("platinumshovel", () -> new PlatinumshovelItem());
	public static final RegistryObject<Item> PLATINUMHOE = REGISTRY.register("platinumhoe", () -> new PlatinumhoeItem());
	public static final RegistryObject<Item> SILVERSWORD = REGISTRY.register("silversword", () -> new SilverswordItem());
	public static final RegistryObject<Item> SILVERPICKAXE = REGISTRY.register("silverpickaxe", () -> new SilverpickaxeItem());
	public static final RegistryObject<Item> SILVERAXE = REGISTRY.register("silveraxe", () -> new SilveraxeItem());
	public static final RegistryObject<Item> SILVERSHOVEL = REGISTRY.register("silvershovel", () -> new SilvershovelItem());
	public static final RegistryObject<Item> SILVERHOE = REGISTRY.register("silverhoe", () -> new SilverhoeItem());
	public static final RegistryObject<Item> TINSWORD = REGISTRY.register("tinsword", () -> new TinswordItem());
	public static final RegistryObject<Item> TINPICKAXE = REGISTRY.register("tinpickaxe", () -> new TinpickaxeItem());
	public static final RegistryObject<Item> TINAXE = REGISTRY.register("tinaxe", () -> new TinaxeItem());
	public static final RegistryObject<Item> TINSHOVEL = REGISTRY.register("tinshovel", () -> new TinshovelItem());
	public static final RegistryObject<Item> TINHOE = REGISTRY.register("tinhoe", () -> new TinhoeItem());
	public static final RegistryObject<Item> TITANIUMSWORD = REGISTRY.register("titaniumsword", () -> new TitaniumswordItem());
	public static final RegistryObject<Item> TITANIUMPICKAXE = REGISTRY.register("titaniumpickaxe", () -> new TitaniumpickaxeItem());
	public static final RegistryObject<Item> TITANIUMAXE = REGISTRY.register("titaniumaxe", () -> new TitaniumaxeItem());
	public static final RegistryObject<Item> TITANIUMSHOVEL = REGISTRY.register("titaniumshovel", () -> new TitaniumshovelItem());
	public static final RegistryObject<Item> TITANIUMHOE = REGISTRY.register("titaniumhoe", () -> new TitaniumhoeItem());
	public static final RegistryObject<Item> TUNGSTENSWORD = REGISTRY.register("tungstensword", () -> new TungstenswordItem());
	public static final RegistryObject<Item> TUNGSTENPICKAXE = REGISTRY.register("tungstenpickaxe", () -> new TungstenpickaxeItem());
	public static final RegistryObject<Item> TUNGSTENAXE = REGISTRY.register("tungstenaxe", () -> new TungstenaxeItem());
	public static final RegistryObject<Item> TUNGSTENSHOVEL = REGISTRY.register("tungstenshovel", () -> new TungstenshovelItem());
	public static final RegistryObject<Item> TUNGSTENHOE = REGISTRY.register("tungstenhoe", () -> new TungstenhoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
