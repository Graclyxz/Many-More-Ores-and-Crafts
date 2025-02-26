package com.graclyxz.manymoreoresandcrafts;

import com.graclyxz.manymoreoresandcrafts.init.ModItems;
import com.graclyxz.manymoreoresandcrafts.init.ModMaterials;
import com.graclyxz.manymoreoresandcrafts.init.ModTabs;
import net.fabricmc.api.ModInitializer;


public class ManyMoreOresAndCraftsMod implements ModInitializer {

	@Override
	public void onInitialize() {
		CommonClass.init();
		ModItems.init();
		ModMaterials.init();
		ModTabs.init();

	}
}
