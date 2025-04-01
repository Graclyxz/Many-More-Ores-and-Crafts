package com.graclyxz.manymoreoresandcrafts;

import com.graclyxz.manymoreoresandcrafts.init.ModItems;
import com.graclyxz.manymoreoresandcrafts.init.ModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ManyMoreOresAndCraftsMod {
    
    public ManyMoreOresAndCraftsMod() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
        ModItems.init(bus);
        ModTabs.init(bus);
        
    }
}