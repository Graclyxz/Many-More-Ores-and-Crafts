package com.graclyxz.manymoreoresandcrafts;

import com.graclyxz.manymoreoresandcrafts.CommonClass;
import com.graclyxz.manymoreoresandcrafts.Constants;
import net.minecraftforge.fml.common.Mod;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

@Mod(MOD_ID)
public class ExampleMod {

    public ExampleMod() {

        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.

        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();

    }
}