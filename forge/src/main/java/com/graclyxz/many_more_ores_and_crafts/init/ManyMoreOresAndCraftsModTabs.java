package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;
import static com.graclyxz.many_more_ores_and_crafts.init.ManyMoreOresAndCraftsModItems.OBSIDIANINGOT;

public class ManyMoreOresAndCraftsModTabs {

	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

	public static final RegistryObject<CreativeModeTab> MODTAB = REGISTRY.register("modtab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.many_more_ores_and_crafts.modtab")).icon(
					() -> new ItemStack(OBSIDIANINGOT.get())).displayItems((parameters, tabData) -> {
				for (RegistryObject<Item> item : ManyMoreOresAndCraftsModItems.REGISTRY.getEntries())
					tabData.accept(item.get());
			}).withSearchBar().build());

	public static void init(IEventBus bus) {
		REGISTRY.register(bus);
	}
}