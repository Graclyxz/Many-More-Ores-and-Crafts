package com.graclyxz.many_more_ores_and_crafts;

import com.graclyxz.many_more_ores_and_crafts.init.ModItems;
import com.graclyxz.many_more_ores_and_crafts.init.ModTab;
import com.graclyxz.many_more_ores_and_crafts.worldgen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

public class ManyMoreOresandCraftsMod implements ModInitializer {

    @Override
    public void onInitialize() {

        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
        ModItems.init();
        ModTab.init();
        ModWorldGeneration.generateModWorldGen();
    }
}
