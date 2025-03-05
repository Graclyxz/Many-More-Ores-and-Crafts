package com.graclyxz.manymoreoresandcrafts;

import com.graclyxz.manymoreoresandcrafts.init.ModMaterials;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import com.graclyxz.manymoreoresandcrafts.init.ModTabs;
import com.graclyxz.manymoreoresandcrafts.init.ModItems;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

@Mod(MOD_ID)
public class ManyMoreOresAndCraftsMod {
	public ManyMoreOresAndCraftsMod(FMLJavaModLoadingContext context) {
		IEventBus bus = context.getModEventBus();
		CommonClass.init();
		ModMaterials.init(bus);
		ModItems.init(bus);
		ModTabs.init(bus);
	}
}
