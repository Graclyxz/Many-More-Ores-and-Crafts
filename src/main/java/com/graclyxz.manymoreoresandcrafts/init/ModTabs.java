package com.graclyxz.manymoreoresandcrafts.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.graclyxz.manymoreoresandcrafts.ManyMoreOresandCrafts.MODID;


public class ModTabs {

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("tab_many_more_ores_and_crafts", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.many_more_ores_and_crafts.tab_many_more_ores_and_crafts")) //The language key for the title of your CreativeModeTab
			.withTabsBefore(CreativeModeTabs.TOOLS_AND_UTILITIES)
			.icon(() -> ModItems.ADAMANTITE_ITEMS.get(1).get().getDefaultInstance())
			.displayItems((parameters, output) -> {
				for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries())
					output.accept(item.get());
			}).build());

	public static void register(IEventBus bus) {
		CREATIVE_MODE_TABS.register(bus);
	}
}