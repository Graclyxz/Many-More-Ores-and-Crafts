package com.graclyxz.many_more_ores_and_crafts.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;

public class ManyMoreOresAndCraftsModTabs {
	public static final CreativeModeTab MODTAB = FabricItemGroup.builder()
			.icon(() -> new ItemStack(ManyMoreOresAndCraftsModItems.OBSIDIANINGOT))
			.displayItems((features, event) -> {
				for (Item item : ManyMoreOresAndCraftsModItems.ITEMS)
					event.accept(item);
			})
			.title(Component.translatable("item_group.many_more_ores_and_crafts.modtab"))
			.build();
	public static void init() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "tab_many_more_ores_and_crafts"), MODTAB);
		System.out.println("Registrando Items para " + MOD_ID);
	}
}
