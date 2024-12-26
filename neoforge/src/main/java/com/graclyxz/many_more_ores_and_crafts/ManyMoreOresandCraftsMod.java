package com.graclyxz.many_more_ores_and_crafts;


import com.graclyxz.many_more_ores_and_crafts.init.ModItems;
import com.graclyxz.many_more_ores_and_crafts.init.ModTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ManyMoreOresandCraftsMod {

    public ManyMoreOresandCraftsMod(IEventBus eventBus) {
        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();
        ModItems.init(eventBus);
        ModTab.init(eventBus);
    }
}
