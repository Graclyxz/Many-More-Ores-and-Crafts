package com.graclyxz.manymoreoresandcrafts;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModTabs;
import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;
import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModBlocks;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

@Mod(MOD_ID)
public class ManyMoreOresAndCraftsMod {

	public ManyMoreOresAndCraftsMod(FMLJavaModLoadingContext context) {
		IEventBus bus = context.getModEventBus();

		ManyMoreOresAndCraftsModBlocks.init(bus);
		ManyMoreOresAndCraftsModItems.init(bus);
		ManyMoreOresAndCraftsModTabs.init(bus);

		CommonClass.init();
	}
}
