package com.graclyxz.manymoreoresandcrafts.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ModTabs {
	public static final CreativeModeTab TAB_MANY_MORE_ORES_AND_CRAFTS = FabricItemGroup.builder()
			.icon(() -> new ItemStack(ModItems.OBSIDIAN_ITEMS.get(1)))
			.displayItems((features, event) -> {
				for (Item item : ModItems.ITEMS)
					event.accept(item);
			})
			.title(Component.translatable("item_group.many_more_ores_and_crafts.tab_many_more_ores_and_crafts"))
			.build();

	public static void init() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "tab_many_more_ores_and_crafts"), TAB_MANY_MORE_ORES_AND_CRAFTS);
	}
}
