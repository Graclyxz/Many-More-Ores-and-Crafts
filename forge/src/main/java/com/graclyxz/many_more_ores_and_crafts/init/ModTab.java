package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;


public class ModTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final Supplier<CreativeModeTab> TAB_TIN_ORES_AND_CRAFTS = TABS.register("tab_many_more_ores_and_crafts", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.MYTHRIL_ITEMS.get(1).get()))
            .displayItems((features, event) -> {
                for (RegistryObject<Item> item : ModRegisters.ITEMS.getEntries())
                    event.accept(item.get());
            })
            .title(Component.translatable("item_group.many_more_ores_and_crafts.tab_many_more_ores_and_crafts")).withSearchBar()
            .build());


    public static void init(IEventBus bus) {
        TABS.register(bus);
    }
}