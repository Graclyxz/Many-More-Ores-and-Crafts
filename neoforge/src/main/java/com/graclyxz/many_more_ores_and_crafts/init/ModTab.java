package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;


public class ModTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final Supplier<CreativeModeTab> TAB_TIN_ORES_AND_CRAFTS = TABS.register("tab_tinoresandcrafts", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.TIN_ITEMS.get(1).asItem()))
            .displayItems((features, event) -> {
                for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries())
                    event.accept(item.get());
            })
            .title(Component.translatable("item_group.tinoresandcrafts.tab_tinoresandcrafts")).withSearchBar()
            .build());


    public static void init(IEventBus bus) {
        TABS.register(bus);
    }
}