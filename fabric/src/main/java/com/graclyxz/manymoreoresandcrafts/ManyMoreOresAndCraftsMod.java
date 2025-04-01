package com.graclyxz.manymoreoresandcrafts;

import com.graclyxz.manymoreoresandcrafts.init.ModItems;
import com.graclyxz.manymoreoresandcrafts.init.ModTabs;
import net.fabricmc.api.ModInitializer;

public class ManyMoreOresAndCraftsMod implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
        ModItems.init();
        ModTabs.init();
    }
}
