package com.graclyxz.manymoreoresandcrafts;

import com.graclyxz.manymoreoresandcrafts.init.ModItems;
import com.graclyxz.manymoreoresandcrafts.init.ModMaterials;
import com.graclyxz.manymoreoresandcrafts.init.ModTabs;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ManyMoreOresandCrafts.MODID)
public class ManyMoreOresandCrafts
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "many_more_ores_and_crafts";


    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public ManyMoreOresandCrafts(IEventBus modEventBus)
    {

        ModMaterials.register(modEventBus);
        ModItems.register(modEventBus);
        ModTabs.register(modEventBus);

    }

}
