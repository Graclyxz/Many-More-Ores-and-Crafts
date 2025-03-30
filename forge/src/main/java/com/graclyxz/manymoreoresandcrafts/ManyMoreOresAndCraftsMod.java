package com.graclyxz.manymoreoresandcrafts;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import com.graclyxz.manymoreoresandcrafts.init.ModTabs;
import com.graclyxz.manymoreoresandcrafts.init.ModItems;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

@Mod(MOD_ID)
public class ManyMoreOresAndCraftsMod {
	public ManyMoreOresAndCraftsMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ModItems.init(bus);

		ModTabs.init(bus);
	}
}
