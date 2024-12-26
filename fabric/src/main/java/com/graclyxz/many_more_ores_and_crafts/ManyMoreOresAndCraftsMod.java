package com.graclyxz.many_more_ores_and_crafts;

import com.graclyxz.many_more_ores_and_crafts.init.ManyMoreOresAndCraftsModItems;
import com.graclyxz.many_more_ores_and_crafts.init.ManyMoreOresAndCraftsModTabs;
import net.fabricmc.api.ModInitializer;


public class ManyMoreOresAndCraftsMod implements ModInitializer {

	@Override
	public void onInitialize() {

		ManyMoreOresAndCraftsModItems.init();
		ManyMoreOresAndCraftsModTabs.init();
		CommonClass.init();
	}
}
