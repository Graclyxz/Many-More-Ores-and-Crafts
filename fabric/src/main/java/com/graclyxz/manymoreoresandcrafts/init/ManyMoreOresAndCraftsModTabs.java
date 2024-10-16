package com.graclyxz.manymoreoresandcrafts.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ManyMoreOresAndCraftsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
	public static final RegistryObject<CreativeModeTab> MODTAB = REGISTRY.register("modtab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.many_more_ores_and_crafts.modtab")).icon(() -> new ItemStack(ManyMoreOresAndCraftsModItems.OBSIDIANINGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITEINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHALCUMINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TININGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENINGOT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITENUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHALCUMNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENNUGGET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWADAMANTITE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWCOBALT.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWINFERNAL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWLEAD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWMYTHRIL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWORICHALCUM.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWPALLADIUM.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWPLATINUM.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWSILVER.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWTIN.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWTITANIUM.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.RAWTUNGSTEN.get());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.DEEPSLATEADAMANTITEORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.COBALTORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.NETHERINFERNALORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.LEADORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.DEEPSLATEMYTHRILORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.DEEPSLATEORICHALCUMORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.PALLADIUMORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.PLATINUMORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.SILVERORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.TINORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.TITANIUMORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.TUNGSTENORE.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.ADAMANTITEBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.COBALTBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.INFERNALBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.LEADBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.MYTHRILBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.OBSIDIANBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.ORICHALCUMBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.PALLADIUMBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.PLATINUMBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.SILVERBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.TINBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.TITANIUMBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.TUNGSTENBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWADAMANTITEBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWCOBALTBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWINFERNALBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWLEADBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWMYTHRILBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWORICHALCUMBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWPALLADIUMBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWPLATINUMBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWSILVERBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWTINBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWTITANIUMBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModBlocks.RAWTUNGSTENBLOCK.get().asItem());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITEARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITEARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITEARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITEARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.AMETHYSTARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.AMETHYSTARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.AMETHYSTARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.AMETHYSTARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHALCUMARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHALCUMARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHALCUMARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHALCUMARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENARMOR_HELMET.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENARMOR_CHESTPLATE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENARMOR_LEGGINGS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENARMOR_BOOTS.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITESWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITEPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITEAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITESHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ADAMANTITEHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.AMETHYSTSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.AMETHYSTPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.AMETHYSTAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.AMETHYSTSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.AMETHYSTHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.COBALTHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.INFERNALHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.LEADHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.MYTHRILHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.OBSIDIANHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHLCUMSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHLCUMPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHLCUMAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHLCUMSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.ORICHLCUMHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PALLADIUMHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.PLATINUMHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.SILVERHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TINHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TITANIUMHOE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENSWORD.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENPICKAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENAXE.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENSHOVEL.get());
				tabData.accept(ManyMoreOresAndCraftsModItems.TUNGSTENHOE.get());
			}).withSearchBar().build());
}