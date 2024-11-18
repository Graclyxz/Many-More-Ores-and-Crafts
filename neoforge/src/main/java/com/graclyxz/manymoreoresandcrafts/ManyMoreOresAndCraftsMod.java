package com.graclyxz.manymoreoresandcrafts;

import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModTabs;
import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;
import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModBlocks;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

@Mod(MOD_ID)
public class ManyMoreOresAndCraftsMod {
	public ManyMoreOresAndCraftsMod(IEventBus modEventBus) {
		ManyMoreOresAndCraftsModBlocks.init(modEventBus);
		ManyMoreOresAndCraftsModItems.init(modEventBus);
		ManyMoreOresAndCraftsModTabs.init(modEventBus);
		CommonClass.init();
	}
}
