package com.graclyxz.many_more_ores_and_crafts;

import com.graclyxz.many_more_ores_and_crafts.init.ModItems;
import com.graclyxz.many_more_ores_and_crafts.init.ModTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ManyMoreOresandCraftsMod {


    public ManyMoreOresandCraftsMod(FMLJavaModLoadingContext context) {

        IEventBus eventBus = context.getModEventBus();
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.

        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
        ModItems.init(eventBus);
        ModTab.init(eventBus);
    }
}
