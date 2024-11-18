package com.graclyxz.manymoreoresandcrafts;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;
import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModTabs;
import net.fabricmc.api.ModInitializer;


public class ManyMoreOresAndCraftsMod implements ModInitializer {

	@Override
	public void onInitialize() {

		ManyMoreOresAndCraftsModItems.init();
		ManyMoreOresAndCraftsModTabs.init();
		CommonClass.init();
	}
}
