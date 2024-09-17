package com.graclyxz.manymoreoresandcrafts.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.graclyxz.manymoreoresandcrafts.item.TungstenswordItem;
import com.graclyxz.manymoreoresandcrafts.item.TungstenshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.TungstenpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.TungstennuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.TungsteningotItem;
import com.graclyxz.manymoreoresandcrafts.item.TungstenhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.TungstenaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.TungstenarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.TitaniumswordItem;
import com.graclyxz.manymoreoresandcrafts.item.TitaniumshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.TitaniumpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.TitaniumnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.TitaniumingotItem;
import com.graclyxz.manymoreoresandcrafts.item.TitaniumhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.TitaniumaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.TitaniumarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.TinswordItem;
import com.graclyxz.manymoreoresandcrafts.item.TinshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.TinpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.TinnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.TiningotItem;
import com.graclyxz.manymoreoresandcrafts.item.TinhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.TinaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.TinarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.SilverswordItem;
import com.graclyxz.manymoreoresandcrafts.item.SilvershovelItem;
import com.graclyxz.manymoreoresandcrafts.item.SilverpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.SilvernuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.SilveringotItem;
import com.graclyxz.manymoreoresandcrafts.item.SilverhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.SilveraxeItem;
import com.graclyxz.manymoreoresandcrafts.item.SilverarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.RawtungstenItem;
import com.graclyxz.manymoreoresandcrafts.item.RawtitaniumItem;
import com.graclyxz.manymoreoresandcrafts.item.RawtinItem;
import com.graclyxz.manymoreoresandcrafts.item.RawsilverItem;
import com.graclyxz.manymoreoresandcrafts.item.RawplatinumItem;
import com.graclyxz.manymoreoresandcrafts.item.RawpalladiumItem;
import com.graclyxz.manymoreoresandcrafts.item.RaworichalcumItem;
import com.graclyxz.manymoreoresandcrafts.item.RawmythrilItem;
import com.graclyxz.manymoreoresandcrafts.item.RawleadItem;
import com.graclyxz.manymoreoresandcrafts.item.RawinfernalItem;
import com.graclyxz.manymoreoresandcrafts.item.RawcobaltItem;
import com.graclyxz.manymoreoresandcrafts.item.RawadamantiteItem;
import com.graclyxz.manymoreoresandcrafts.item.PlatinumswordItem;
import com.graclyxz.manymoreoresandcrafts.item.PlatinumshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.PlatinumpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.PlatinumnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.PlatinumingotItem;
import com.graclyxz.manymoreoresandcrafts.item.PlatinumhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.PlatinumaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.PlatinumarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.PalladiumswordItem;
import com.graclyxz.manymoreoresandcrafts.item.PalladiumshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.PalladiumpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.PalladiumnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.PalladiumingotItem;
import com.graclyxz.manymoreoresandcrafts.item.PalladiumhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.PalladiumaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.PalladiumarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.OrichlcumswordItem;
import com.graclyxz.manymoreoresandcrafts.item.OrichlcumshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.OrichlcumpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.OrichlcumhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.OrichlcumaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.OrichalcumnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.OrichalcumingotItem;
import com.graclyxz.manymoreoresandcrafts.item.OrichalcumarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.ObsidianswordItem;
import com.graclyxz.manymoreoresandcrafts.item.ObsidianshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.ObsidianpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.ObsidiannuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.ObsidianingotItem;
import com.graclyxz.manymoreoresandcrafts.item.ObsidianhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.ObsidianaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.ObsidianarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.MythrilswordItem;
import com.graclyxz.manymoreoresandcrafts.item.MythrilshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.MythrilpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.MythrilnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.MythrilingotItem;
import com.graclyxz.manymoreoresandcrafts.item.MythrilhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.MythrilaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.MythrilarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.LeadswordItem;
import com.graclyxz.manymoreoresandcrafts.item.LeadshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.LeadpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.LeadnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.LeadingotItem;
import com.graclyxz.manymoreoresandcrafts.item.LeadhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.LeadaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.LeadamorItem;
import com.graclyxz.manymoreoresandcrafts.item.InfernalswordItem;
import com.graclyxz.manymoreoresandcrafts.item.InfernalshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.InfernalpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.InfernalnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.InfernalingotItem;
import com.graclyxz.manymoreoresandcrafts.item.InfernalhoeItem;
import com.graclyxz.manymoreoresandcrafts.item.InfernalaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.InfernalarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.CobaltswordItem;
import com.graclyxz.manymoreoresandcrafts.item.CobaltshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.CobaltpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.CobaltnuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.CobaltingotItem;
import com.graclyxz.manymoreoresandcrafts.item.CobalthoeItem;
import com.graclyxz.manymoreoresandcrafts.item.CobaltaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.CobaltarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.AmethystswordItem;
import com.graclyxz.manymoreoresandcrafts.item.AmethystshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.AmethystpickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.AmethysthoeItem;
import com.graclyxz.manymoreoresandcrafts.item.AmethystaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.AmethystarmorItem;
import com.graclyxz.manymoreoresandcrafts.item.AdamantiteswordItem;
import com.graclyxz.manymoreoresandcrafts.item.AdamantiteshovelItem;
import com.graclyxz.manymoreoresandcrafts.item.AdamantitepickaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.AdamantitenuggetItem;
import com.graclyxz.manymoreoresandcrafts.item.AdamantiteingotItem;
import com.graclyxz.manymoreoresandcrafts.item.AdamantitehoeItem;
import com.graclyxz.manymoreoresandcrafts.item.AdamantiteaxeItem;
import com.graclyxz.manymoreoresandcrafts.item.AdamantitearmorItem;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ManyMoreOresAndCraftsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MOD_ID);
	public static final DeferredHolder<Item, Item> ADAMANTITEINGOT = REGISTRY.register("adamantiteingot", AdamantiteingotItem::new);
	public static final DeferredHolder<Item, Item> COBALTINGOT = REGISTRY.register("cobaltingot", CobaltingotItem::new);
	public static final DeferredHolder<Item, Item> INFERNALINGOT = REGISTRY.register("infernalingot", InfernalingotItem::new);
	public static final DeferredHolder<Item, Item> LEADINGOT = REGISTRY.register("leadingot", LeadingotItem::new);
	public static final DeferredHolder<Item, Item> MYTHRILINGOT = REGISTRY.register("mythrilingot", MythrilingotItem::new);
	public static final DeferredHolder<Item, Item> OBSIDIANINGOT = REGISTRY.register("obsidianingot", ObsidianingotItem::new);
	public static final DeferredHolder<Item, Item> ORICHALCUMINGOT = REGISTRY.register("orichalcumingot", OrichalcumingotItem::new);
	public static final DeferredHolder<Item, Item> PALLADIUMINGOT = REGISTRY.register("palladiumingot", PalladiumingotItem::new);
	public static final DeferredHolder<Item, Item> PLATINUMINGOT = REGISTRY.register("platinumingot", PlatinumingotItem::new);
	public static final DeferredHolder<Item, Item> SILVERINGOT = REGISTRY.register("silveringot", SilveringotItem::new);
	public static final DeferredHolder<Item, Item> TININGOT = REGISTRY.register("tiningot", TiningotItem::new);
	public static final DeferredHolder<Item, Item> TITANIUMINGOT = REGISTRY.register("titaniumingot", TitaniumingotItem::new);
	public static final DeferredHolder<Item, Item> TUNGSTENINGOT = REGISTRY.register("tungsteningot", TungsteningotItem::new);
	public static final DeferredHolder<Item, Item> ADAMANTITENUGGET = REGISTRY.register("adamantitenugget", AdamantitenuggetItem::new);
	public static final DeferredHolder<Item, Item> COBALTNUGGET = REGISTRY.register("cobaltnugget", CobaltnuggetItem::new);
	public static final DeferredHolder<Item, Item> INFERNALNUGGET = REGISTRY.register("infernalnugget", InfernalnuggetItem::new);
	public static final DeferredHolder<Item, Item> LEADNUGGET = REGISTRY.register("leadnugget", LeadnuggetItem::new);
	public static final DeferredHolder<Item, Item> MYTHRILNUGGET = REGISTRY.register("mythrilnugget", MythrilnuggetItem::new);
	public static final DeferredHolder<Item, Item> OBSIDIANNUGGET = REGISTRY.register("obsidiannugget", ObsidiannuggetItem::new);
	public static final DeferredHolder<Item, Item> ORICHALCUMNUGGET = REGISTRY.register("orichalcumnugget", OrichalcumnuggetItem::new);
	public static final DeferredHolder<Item, Item> PALLADIUMNUGGET = REGISTRY.register("palladiumnugget", PalladiumnuggetItem::new);
	public static final DeferredHolder<Item, Item> PLATINUMNUGGET = REGISTRY.register("platinumnugget", PlatinumnuggetItem::new);
	public static final DeferredHolder<Item, Item> SILVERNUGGET = REGISTRY.register("silvernugget", SilvernuggetItem::new);
	public static final DeferredHolder<Item, Item> TINNUGGET = REGISTRY.register("tinnugget", TinnuggetItem::new);
	public static final DeferredHolder<Item, Item> TITANIUMNUGGET = REGISTRY.register("titaniumnugget", TitaniumnuggetItem::new);
	public static final DeferredHolder<Item, Item> TUNGSTENNUGGET = REGISTRY.register("tungstennugget", TungstennuggetItem::new);
	public static final DeferredHolder<Item, Item> RAWADAMANTITE = REGISTRY.register("rawadamantite", RawadamantiteItem::new);
	public static final DeferredHolder<Item, Item> RAWCOBALT = REGISTRY.register("rawcobalt", RawcobaltItem::new);
	public static final DeferredHolder<Item, Item> RAWINFERNAL = REGISTRY.register("rawinfernal", RawinfernalItem::new);
	public static final DeferredHolder<Item, Item> RAWLEAD = REGISTRY.register("rawlead", RawleadItem::new);
	public static final DeferredHolder<Item, Item> RAWMYTHRIL = REGISTRY.register("rawmythril", RawmythrilItem::new);
	public static final DeferredHolder<Item, Item> RAWORICHALCUM = REGISTRY.register("raworichalcum", RaworichalcumItem::new);
	public static final DeferredHolder<Item, Item> RAWPALLADIUM = REGISTRY.register("rawpalladium", RawpalladiumItem::new);
	public static final DeferredHolder<Item, Item> RAWPLATINUM = REGISTRY.register("rawplatinum", RawplatinumItem::new);
	public static final DeferredHolder<Item, Item> RAWSILVER = REGISTRY.register("rawsilver", RawsilverItem::new);
	public static final DeferredHolder<Item, Item> RAWTIN = REGISTRY.register("rawtin", RawtinItem::new);
	public static final DeferredHolder<Item, Item> RAWTITANIUM = REGISTRY.register("rawtitanium", RawtitaniumItem::new);
	public static final DeferredHolder<Item, Item> RAWTUNGSTEN = REGISTRY.register("rawtungsten", RawtungstenItem::new);
	public static final DeferredHolder<Item, Item> ADAMANTITEBLOCK = block(ManyMoreOresAndCraftsModBlocks.ADAMANTITEBLOCK);
	public static final DeferredHolder<Item, Item> RAWADAMANTITEBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWADAMANTITEBLOCK);
	public static final DeferredHolder<Item, Item> DEEPSLATEADAMANTITEORE = block(ManyMoreOresAndCraftsModBlocks.DEEPSLATEADAMANTITEORE);
	public static final DeferredHolder<Item, Item> COBALTORE = block(ManyMoreOresAndCraftsModBlocks.COBALTORE);
	public static final DeferredHolder<Item, Item> NETHERINFERNALORE = block(ManyMoreOresAndCraftsModBlocks.NETHERINFERNALORE);
	public static final DeferredHolder<Item, Item> LEADORE = block(ManyMoreOresAndCraftsModBlocks.LEADORE);
	public static final DeferredHolder<Item, Item> DEEPSLATEMYTHRILORE = block(ManyMoreOresAndCraftsModBlocks.DEEPSLATEMYTHRILORE);
	public static final DeferredHolder<Item, Item> DEEPSLATEORICHALCUMORE = block(ManyMoreOresAndCraftsModBlocks.DEEPSLATEORICHALCUMORE);
	public static final DeferredHolder<Item, Item> PALLADIUMORE = block(ManyMoreOresAndCraftsModBlocks.PALLADIUMORE);
	public static final DeferredHolder<Item, Item> PLATINUMORE = block(ManyMoreOresAndCraftsModBlocks.PLATINUMORE);
	public static final DeferredHolder<Item, Item> SILVERORE = block(ManyMoreOresAndCraftsModBlocks.SILVERORE);
	public static final DeferredHolder<Item, Item> TINORE = block(ManyMoreOresAndCraftsModBlocks.TINORE);
	public static final DeferredHolder<Item, Item> TITANIUMORE = block(ManyMoreOresAndCraftsModBlocks.TITANIUMORE);
	public static final DeferredHolder<Item, Item> TUNGSTENORE = block(ManyMoreOresAndCraftsModBlocks.TUNGSTENORE);
	public static final DeferredHolder<Item, Item> COBALTBLOCK = block(ManyMoreOresAndCraftsModBlocks.COBALTBLOCK);
	public static final DeferredHolder<Item, Item> INFERNALBLOCK = block(ManyMoreOresAndCraftsModBlocks.INFERNALBLOCK);
	public static final DeferredHolder<Item, Item> LEADBLOCK = block(ManyMoreOresAndCraftsModBlocks.LEADBLOCK);
	public static final DeferredHolder<Item, Item> MYTHRILBLOCK = block(ManyMoreOresAndCraftsModBlocks.MYTHRILBLOCK);
	public static final DeferredHolder<Item, Item> OBSIDIANBLOCK = block(ManyMoreOresAndCraftsModBlocks.OBSIDIANBLOCK);
	public static final DeferredHolder<Item, Item> ORICHALCUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.ORICHALCUMBLOCK);
	public static final DeferredHolder<Item, Item> PALLADIUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.PALLADIUMBLOCK);
	public static final DeferredHolder<Item, Item> PLATINUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.PLATINUMBLOCK);
	public static final DeferredHolder<Item, Item> SILVERBLOCK = block(ManyMoreOresAndCraftsModBlocks.SILVERBLOCK);
	public static final DeferredHolder<Item, Item> TINBLOCK = block(ManyMoreOresAndCraftsModBlocks.TINBLOCK);
	public static final DeferredHolder<Item, Item> TITANIUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.TITANIUMBLOCK);
	public static final DeferredHolder<Item, Item> TUNGSTENBLOCK = block(ManyMoreOresAndCraftsModBlocks.TUNGSTENBLOCK);
	public static final DeferredHolder<Item, Item> RAWCOBALTBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWCOBALTBLOCK);
	public static final DeferredHolder<Item, Item> RAWINFERNALBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWINFERNALBLOCK);
	public static final DeferredHolder<Item, Item> RAWLEADBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWLEADBLOCK);
	public static final DeferredHolder<Item, Item> RAWMYTHRILBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWMYTHRILBLOCK);
	public static final DeferredHolder<Item, Item> RAWORICHALCUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWORICHALCUMBLOCK);
	public static final DeferredHolder<Item, Item> RAWPALLADIUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWPALLADIUMBLOCK);
	public static final DeferredHolder<Item, Item> RAWPLATINUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWPLATINUMBLOCK);
	public static final DeferredHolder<Item, Item> RAWSILVERBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWSILVERBLOCK);
	public static final DeferredHolder<Item, Item> RAWTINBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWTINBLOCK);
	public static final DeferredHolder<Item, Item> RAWTITANIUMBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWTITANIUMBLOCK);
	public static final DeferredHolder<Item, Item> RAWTUNGSTENBLOCK = block(ManyMoreOresAndCraftsModBlocks.RAWTUNGSTENBLOCK);
	public static final DeferredHolder<Item, Item> ADAMANTITEARMOR_HELMET = REGISTRY.register("adamantitearmor_helmet", AdamantitearmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> ADAMANTITEARMOR_CHESTPLATE = REGISTRY.register("adamantitearmor_chestplate", AdamantitearmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> ADAMANTITEARMOR_LEGGINGS = REGISTRY.register("adamantitearmor_leggings", AdamantitearmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> ADAMANTITEARMOR_BOOTS = REGISTRY.register("adamantitearmor_boots", AdamantitearmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> COBALTARMOR_HELMET = REGISTRY.register("cobaltarmor_helmet", CobaltarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> COBALTARMOR_CHESTPLATE = REGISTRY.register("cobaltarmor_chestplate", CobaltarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> COBALTARMOR_LEGGINGS = REGISTRY.register("cobaltarmor_leggings", CobaltarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> COBALTARMOR_BOOTS = REGISTRY.register("cobaltarmor_boots", CobaltarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> AMETHYSTARMOR_HELMET = REGISTRY.register("amethystarmor_helmet", AmethystarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> AMETHYSTARMOR_CHESTPLATE = REGISTRY.register("amethystarmor_chestplate", AmethystarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> AMETHYSTARMOR_LEGGINGS = REGISTRY.register("amethystarmor_leggings", AmethystarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> AMETHYSTARMOR_BOOTS = REGISTRY.register("amethystarmor_boots", AmethystarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> INFERNALARMOR_HELMET = REGISTRY.register("infernalarmor_helmet", InfernalarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> INFERNALARMOR_CHESTPLATE = REGISTRY.register("infernalarmor_chestplate", InfernalarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> INFERNALARMOR_LEGGINGS = REGISTRY.register("infernalarmor_leggings", InfernalarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> INFERNALARMOR_BOOTS = REGISTRY.register("infernalarmor_boots", InfernalarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> LEADARMOR_HELMET = REGISTRY.register("leadarmor_helmet", LeadamorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> LEADARMOR_CHESTPLATE = REGISTRY.register("leadarmor_chestplate", LeadamorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> LEADARMOR_LEGGINGS = REGISTRY.register("leadarmor_leggings", LeadamorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> LEADARMOR_BOOTS = REGISTRY.register("leadarmor_boots", LeadamorItem.Boots::new);
	public static final DeferredHolder<Item, Item> MYTHRILARMOR_HELMET = REGISTRY.register("mythrilarmor_helmet", MythrilarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> MYTHRILARMOR_CHESTPLATE = REGISTRY.register("mythrilarmor_chestplate", MythrilarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> MYTHRILARMOR_LEGGINGS = REGISTRY.register("mythrilarmor_leggings", MythrilarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> MYTHRILARMOR_BOOTS = REGISTRY.register("mythrilarmor_boots", MythrilarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> OBSIDIANARMOR_HELMET = REGISTRY.register("obsidianarmor_helmet", ObsidianarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> OBSIDIANARMOR_CHESTPLATE = REGISTRY.register("obsidianarmor_chestplate", ObsidianarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> OBSIDIANARMOR_LEGGINGS = REGISTRY.register("obsidianarmor_leggings", ObsidianarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> OBSIDIANARMOR_BOOTS = REGISTRY.register("obsidianarmor_boots", ObsidianarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> ORICHALCUMARMOR_HELMET = REGISTRY.register("orichalcumarmor_helmet", OrichalcumarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> ORICHALCUMARMOR_CHESTPLATE = REGISTRY.register("orichalcumarmor_chestplate", OrichalcumarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> ORICHALCUMARMOR_LEGGINGS = REGISTRY.register("orichalcumarmor_leggings", OrichalcumarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> ORICHALCUMARMOR_BOOTS = REGISTRY.register("orichalcumarmor_boots", OrichalcumarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> PALLADIUMARMOR_HELMET = REGISTRY.register("palladiumarmor_helmet", PalladiumarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> PALLADIUMARMOR_CHESTPLATE = REGISTRY.register("palladiumarmor_chestplate", PalladiumarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> PALLADIUMARMOR_LEGGINGS = REGISTRY.register("palladiumarmor_leggings", PalladiumarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> PALLADIUMARMOR_BOOTS = REGISTRY.register("palladiumarmor_boots", PalladiumarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> PLATINUMARMOR_HELMET = REGISTRY.register("platinumarmor_helmet", PlatinumarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> PLATINUMARMOR_CHESTPLATE = REGISTRY.register("platinumarmor_chestplate", PlatinumarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> PLATINUMARMOR_LEGGINGS = REGISTRY.register("platinumarmor_leggings", PlatinumarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> PLATINUMARMOR_BOOTS = REGISTRY.register("platinumarmor_boots", PlatinumarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> SILVERARMOR_HELMET = REGISTRY.register("silverarmor_helmet", SilverarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> SILVERARMOR_CHESTPLATE = REGISTRY.register("silverarmor_chestplate", SilverarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> SILVERARMOR_LEGGINGS = REGISTRY.register("silverarmor_leggings", SilverarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> SILVERARMOR_BOOTS = REGISTRY.register("silverarmor_boots", SilverarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> TINARMOR_HELMET = REGISTRY.register("tinarmor_helmet", TinarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> TINARMOR_CHESTPLATE = REGISTRY.register("tinarmor_chestplate", TinarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> TINARMOR_LEGGINGS = REGISTRY.register("tinarmor_leggings", TinarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> TINARMOR_BOOTS = REGISTRY.register("tinarmor_boots", TinarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> TITANIUMARMOR_HELMET = REGISTRY.register("titaniumarmor_helmet", TitaniumarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> TITANIUMARMOR_CHESTPLATE = REGISTRY.register("titaniumarmor_chestplate", TitaniumarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> TITANIUMARMOR_LEGGINGS = REGISTRY.register("titaniumarmor_leggings", TitaniumarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> TITANIUMARMOR_BOOTS = REGISTRY.register("titaniumarmor_boots", TitaniumarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> TUNGSTENARMOR_HELMET = REGISTRY.register("tungstenarmor_helmet", TungstenarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> TUNGSTENARMOR_CHESTPLATE = REGISTRY.register("tungstenarmor_chestplate", TungstenarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> TUNGSTENARMOR_LEGGINGS = REGISTRY.register("tungstenarmor_leggings", TungstenarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> TUNGSTENARMOR_BOOTS = REGISTRY.register("tungstenarmor_boots", TungstenarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> ADAMANTITESWORD = REGISTRY.register("adamantitesword", AdamantiteswordItem::new);
	public static final DeferredHolder<Item, Item> ADAMANTITEPICKAXE = REGISTRY.register("adamantitepickaxe", AdamantitepickaxeItem::new);
	public static final DeferredHolder<Item, Item> ADAMANTITEAXE = REGISTRY.register("adamantiteaxe", AdamantiteaxeItem::new);
	public static final DeferredHolder<Item, Item> ADAMANTITESHOVEL = REGISTRY.register("adamantiteshovel", AdamantiteshovelItem::new);
	public static final DeferredHolder<Item, Item> ADAMANTITEHOE = REGISTRY.register("adamantitehoe", AdamantitehoeItem::new);
	public static final DeferredHolder<Item, Item> AMETHYSTSWORD = REGISTRY.register("amethystsword", AmethystswordItem::new);
	public static final DeferredHolder<Item, Item> AMETHYSTPICKAXE = REGISTRY.register("amethystpickaxe", AmethystpickaxeItem::new);
	public static final DeferredHolder<Item, Item> AMETHYSTAXE = REGISTRY.register("amethystaxe", AmethystaxeItem::new);
	public static final DeferredHolder<Item, Item> AMETHYSTSHOVEL = REGISTRY.register("amethystshovel", AmethystshovelItem::new);
	public static final DeferredHolder<Item, Item> AMETHYSTHOE = REGISTRY.register("amethysthoe", AmethysthoeItem::new);
	public static final DeferredHolder<Item, Item> COBALTSWORD = REGISTRY.register("cobaltsword", CobaltswordItem::new);
	public static final DeferredHolder<Item, Item> COBALTPICKAXE = REGISTRY.register("cobaltpickaxe", CobaltpickaxeItem::new);
	public static final DeferredHolder<Item, Item> COBALTAXE = REGISTRY.register("cobaltaxe", CobaltaxeItem::new);
	public static final DeferredHolder<Item, Item> COBALTSHOVEL = REGISTRY.register("cobaltshovel", CobaltshovelItem::new);
	public static final DeferredHolder<Item, Item> COBALTHOE = REGISTRY.register("cobalthoe", CobalthoeItem::new);
	public static final DeferredHolder<Item, Item> INFERNALSWORD = REGISTRY.register("infernalsword", InfernalswordItem::new);
	public static final DeferredHolder<Item, Item> INFERNALPICKAXE = REGISTRY.register("infernalpickaxe", InfernalpickaxeItem::new);
	public static final DeferredHolder<Item, Item> INFERNALAXE = REGISTRY.register("infernalaxe", InfernalaxeItem::new);
	public static final DeferredHolder<Item, Item> INFERNALSHOVEL = REGISTRY.register("infernalshovel", InfernalshovelItem::new);
	public static final DeferredHolder<Item, Item> INFERNALHOE = REGISTRY.register("infernalhoe", InfernalhoeItem::new);
	public static final DeferredHolder<Item, Item> LEADSWORD = REGISTRY.register("leadsword", LeadswordItem::new);
	public static final DeferredHolder<Item, Item> LEADPICKAXE = REGISTRY.register("leadpickaxe", LeadpickaxeItem::new);
	public static final DeferredHolder<Item, Item> LEADAXE = REGISTRY.register("leadaxe", LeadaxeItem::new);
	public static final DeferredHolder<Item, Item> LEADSHOVEL = REGISTRY.register("leadshovel", LeadshovelItem::new);
	public static final DeferredHolder<Item, Item> LEADHOE = REGISTRY.register("leadhoe", LeadhoeItem::new);
	public static final DeferredHolder<Item, Item> MYTHRILSWORD = REGISTRY.register("mythrilsword", MythrilswordItem::new);
	public static final DeferredHolder<Item, Item> MYTHRILPICKAXE = REGISTRY.register("mythrilpickaxe", MythrilpickaxeItem::new);
	public static final DeferredHolder<Item, Item> MYTHRILAXE = REGISTRY.register("mythrilaxe", MythrilaxeItem::new);
	public static final DeferredHolder<Item, Item> MYTHRILSHOVEL = REGISTRY.register("mythrilshovel", MythrilshovelItem::new);
	public static final DeferredHolder<Item, Item> MYTHRILHOE = REGISTRY.register("mythrilhoe", MythrilhoeItem::new);
	public static final DeferredHolder<Item, Item> OBSIDIANSWORD = REGISTRY.register("obsidiansword", ObsidianswordItem::new);
	public static final DeferredHolder<Item, Item> OBSIDIANPICKAXE = REGISTRY.register("obsidianpickaxe", ObsidianpickaxeItem::new);
	public static final DeferredHolder<Item, Item> OBSIDIANAXE = REGISTRY.register("obsidianaxe", ObsidianaxeItem::new);
	public static final DeferredHolder<Item, Item> OBSIDIANSHOVEL = REGISTRY.register("obsidianshovel", ObsidianshovelItem::new);
	public static final DeferredHolder<Item, Item> OBSIDIANHOE = REGISTRY.register("obsidianhoe", ObsidianhoeItem::new);
	public static final DeferredHolder<Item, Item> ORICHLCUMSWORD = REGISTRY.register("orichlcumsword", OrichlcumswordItem::new);
	public static final DeferredHolder<Item, Item> ORICHLCUMPICKAXE = REGISTRY.register("orichlcumpickaxe", OrichlcumpickaxeItem::new);
	public static final DeferredHolder<Item, Item> ORICHLCUMAXE = REGISTRY.register("orichlcumaxe", OrichlcumaxeItem::new);
	public static final DeferredHolder<Item, Item> ORICHLCUMSHOVEL = REGISTRY.register("orichlcumshovel", OrichlcumshovelItem::new);
	public static final DeferredHolder<Item, Item> ORICHLCUMHOE = REGISTRY.register("orichlcumhoe", OrichlcumhoeItem::new);
	public static final DeferredHolder<Item, Item> PALLADIUMSWORD = REGISTRY.register("palladiumsword", PalladiumswordItem::new);
	public static final DeferredHolder<Item, Item> PALLADIUMPICKAXE = REGISTRY.register("palladiumpickaxe", PalladiumpickaxeItem::new);
	public static final DeferredHolder<Item, Item> PALLADIUMAXE = REGISTRY.register("palladiumaxe", PalladiumaxeItem::new);
	public static final DeferredHolder<Item, Item> PALLADIUMSHOVEL = REGISTRY.register("palladiumshovel", PalladiumshovelItem::new);
	public static final DeferredHolder<Item, Item> PALLADIUMHOE = REGISTRY.register("palladiumhoe", PalladiumhoeItem::new);
	public static final DeferredHolder<Item, Item> PLATINUMSWORD = REGISTRY.register("platinumsword", PlatinumswordItem::new);
	public static final DeferredHolder<Item, Item> PLATINUMPICKAXE = REGISTRY.register("platinumpickaxe", PlatinumpickaxeItem::new);
	public static final DeferredHolder<Item, Item> PLATINUMAXE = REGISTRY.register("platinumaxe", PlatinumaxeItem::new);
	public static final DeferredHolder<Item, Item> PLATINUMSHOVEL = REGISTRY.register("platinumshovel", PlatinumshovelItem::new);
	public static final DeferredHolder<Item, Item> PLATINUMHOE = REGISTRY.register("platinumhoe", PlatinumhoeItem::new);
	public static final DeferredHolder<Item, Item> SILVERSWORD = REGISTRY.register("silversword", SilverswordItem::new);
	public static final DeferredHolder<Item, Item> SILVERPICKAXE = REGISTRY.register("silverpickaxe", SilverpickaxeItem::new);
	public static final DeferredHolder<Item, Item> SILVERAXE = REGISTRY.register("silveraxe", SilveraxeItem::new);
	public static final DeferredHolder<Item, Item> SILVERSHOVEL = REGISTRY.register("silvershovel", SilvershovelItem::new);
	public static final DeferredHolder<Item, Item> SILVERHOE = REGISTRY.register("silverhoe", SilverhoeItem::new);
	public static final DeferredHolder<Item, Item> TINSWORD = REGISTRY.register("tinsword", TinswordItem::new);
	public static final DeferredHolder<Item, Item> TINPICKAXE = REGISTRY.register("tinpickaxe", TinpickaxeItem::new);
	public static final DeferredHolder<Item, Item> TINAXE = REGISTRY.register("tinaxe", TinaxeItem::new);
	public static final DeferredHolder<Item, Item> TINSHOVEL = REGISTRY.register("tinshovel", TinshovelItem::new);
	public static final DeferredHolder<Item, Item> TINHOE = REGISTRY.register("tinhoe", TinhoeItem::new);
	public static final DeferredHolder<Item, Item> TITANIUMSWORD = REGISTRY.register("titaniumsword", TitaniumswordItem::new);
	public static final DeferredHolder<Item, Item> TITANIUMPICKAXE = REGISTRY.register("titaniumpickaxe", TitaniumpickaxeItem::new);
	public static final DeferredHolder<Item, Item> TITANIUMAXE = REGISTRY.register("titaniumaxe", TitaniumaxeItem::new);
	public static final DeferredHolder<Item, Item> TITANIUMSHOVEL = REGISTRY.register("titaniumshovel", TitaniumshovelItem::new);
	public static final DeferredHolder<Item, Item> TITANIUMHOE = REGISTRY.register("titaniumhoe", TitaniumhoeItem::new);
	public static final DeferredHolder<Item, Item> TUNGSTENSWORD = REGISTRY.register("tungstensword", TungstenswordItem::new);
	public static final DeferredHolder<Item, Item> TUNGSTENPICKAXE = REGISTRY.register("tungstenpickaxe", TungstenpickaxeItem::new);
	public static final DeferredHolder<Item, Item> TUNGSTENAXE = REGISTRY.register("tungstenaxe", TungstenaxeItem::new);
	public static final DeferredHolder<Item, Item> TUNGSTENSHOVEL = REGISTRY.register("tungstenshovel", TungstenshovelItem::new);
	public static final DeferredHolder<Item, Item> TUNGSTENHOE = REGISTRY.register("tungstenhoe", TungstenhoeItem::new);

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
