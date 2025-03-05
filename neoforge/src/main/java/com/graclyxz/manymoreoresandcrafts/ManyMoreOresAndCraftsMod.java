package com.graclyxz.manymoreoresandcrafts;

import com.graclyxz.manymoreoresandcrafts.init.ModMaterials;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;

import com.graclyxz.manymoreoresandcrafts.init.ModTabs;
import com.graclyxz.manymoreoresandcrafts.init.ModItems;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

@Mod(MOD_ID)
public class ManyMoreOresAndCraftsMod {
	public ManyMoreOresAndCraftsMod(IEventBus bus) {
		CommonClass.init();
		ModMaterials.init(bus);
		ModItems.init(bus);
		ModTabs.init(bus);
	}
}
