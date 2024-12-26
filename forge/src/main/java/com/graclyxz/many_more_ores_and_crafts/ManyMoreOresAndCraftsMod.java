package com.graclyxz.many_more_ores_and_crafts;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import com.graclyxz.many_more_ores_and_crafts.init.ManyMoreOresAndCraftsModTabs;
import com.graclyxz.many_more_ores_and_crafts.init.ManyMoreOresAndCraftsModItems;
import com.graclyxz.many_more_ores_and_crafts.init.ManyMoreOresAndCraftsModBlocks;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;

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
