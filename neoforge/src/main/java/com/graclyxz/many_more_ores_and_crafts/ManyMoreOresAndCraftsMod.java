package com.graclyxz.many_more_ores_and_crafts;

import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;

import com.graclyxz.many_more_ores_and_crafts.init.ManyMoreOresAndCraftsModTabs;
import com.graclyxz.many_more_ores_and_crafts.init.ManyMoreOresAndCraftsModItems;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;

@Mod(MOD_ID)
public class ManyMoreOresAndCraftsMod {
	public ManyMoreOresAndCraftsMod(IEventBus modEventBus) {

		//ManyMoreOresAndCraftsModBlocks.init(modEventBus);
		ManyMoreOresAndCraftsModItems.init(modEventBus);
		ManyMoreOresAndCraftsModTabs.init(modEventBus);

		CommonClass.init();
	}
}
