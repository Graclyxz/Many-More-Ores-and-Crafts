package com.graclyxz.manymoreoresandcrafts.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ModTabs {
	public static final DeferredRegister<CreativeModeTab> TABS  = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

	public static final RegistryObject<CreativeModeTab> TAB_MANY_MORE_ORES_AND_CRAFTS = TABS.register("tab_many_more_ores_and_crafts",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.many_more_ores_and_crafts.tab_many_more_ores_and_crafts")).icon(
					() -> new ItemStack(ModItems.OBSIDIAN_ITEMS.get(1).get())).displayItems((parameters, tabData) -> {
				for (RegistryObject<Item> item : ModItems.ITEMS.getEntries())
					tabData.accept(item.get());
			}).withSearchBar().build());

	public static void init(IEventBus bus) {
		TABS.register(bus);
	}
}
