package com.graclyxz.manymoreoresandcrafts.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ManyMoreOresAndCraftsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

	public static final RegistryObject<CreativeModeTab> MODTAB = REGISTRY.register("modtab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.many_more_ores_and_crafts.modtab")).icon(() -> new ItemStack(ManyMoreOresAndCraftsModItems.OBSIDIANINGOT.get())).displayItems((parameters, tabData) -> {
				for (RegistryObject<Item> item : ManyMoreOresAndCraftsModItems.REGISTRY.getEntries())
					tabData.accept(item.get());
			}).withSearchBar().build());
}
