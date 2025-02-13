package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Armor;
import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Tool;
import static com.graclyxz.many_more_ores_and_crafts.init.ModRegisters.BLOCKS;
import static com.graclyxz.many_more_ores_and_crafts.init.ModRegisters.ITEMS;
import static com.graclyxz.many_more_ores_and_crafts.init.ModRegisters.*;


public class ModItems {

    /*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/

    /* **** Items Register ****/
    /* 1. Items Name 
       2. Items ToolMaterial 
       3. Items ArmorMaterial 
       4. Tools attributes float[]: sword, pickaxe, axe, hoe, shovel 
       5. Item propeties */

    /* **** Blocks Register ****/
    /* 1. Blocks Name 
       2. Strength ore ottribute 
       3. Ore Sound
       4. BlockBehaviour prpeties
       5. Item propeties */

    public static final List<DeferredItem<Item>> ADAMANTITE_ITEMS = registerAllItems("adamantite", Tool.ADAMANTITE, Armor.ADAMANTITE,
            new float[]{7.5f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0f, 0f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<DeferredBlock<Block>> ADAMANTITE_BLOCKS =  ModRegisters.registerAllBlocks("adamantite",  new float[]{8f, 10f}, SoundType.DEEPSLATE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.RARE));

    public static final List<DeferredItem<Item>> COBALT_ITEMS =  registerAllItems("cobalt", Tool.COBALT, Armor.COBALT,
            new float[]{6f, -2f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, 0f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<DeferredBlock<Block>> COBALT_BLOCKS =  ModRegisters.registerAllBlocks("cobalt",  new float[]{6f, 8f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<DeferredItem<Item>> INFERNAL_ITEMS = registerAllItems("infernal", Tool.INFERNAL, Armor.INFERNAL,
            new float[]{7f, -1.8f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
            new Item.Properties().fireResistant().rarity(Rarity.RARE));
    public static final List<DeferredBlock<Block>> INFERNAL_BLOCKS = registerAllBlocks("infernal",  new float[]{8f, 10f}, SoundType.NETHER_ORE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().fireResistant().rarity(Rarity.RARE));

    public static final List<DeferredItem<Item>> LEAD_ITEMS = registerAllItems("lead", Tool.LEAD, Armor.LEAD,
            new float[]{4f, -2.6f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<DeferredBlock<Block>> LEAD_BLOCKS = registerAllBlocks("lead",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<DeferredItem<Item>> MYTHRIL_ITEMS = registerAllItems("mythril", Tool.MYTHRIL, Armor.MYTHRIL,
            new float[]{8f, -2.4f}, new float[]{5f, -2.8f}, new float[]{9f, -3f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<DeferredBlock<Block>> MYTHRIL_BLOCKS = registerAllBlocks("mythril",  new float[]{10f, 12f}, SoundType.DEEPSLATE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.EPIC));

    public static final List<DeferredItem<Item>> OBSIDIAN_ITEMS = registerAllItems("obsidian", Tool.OBSIDIAN, Armor.OBSIDIAN,
            new float[]{9f, -3f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{1, -1f}, new float[]{4.5f, -3f},
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));
    public static final DeferredBlock<Block> OBSIDIAN_BLOCK =  registerBlock("obsidian_block", Block::new, BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(4f, 6f).sound(SoundType.METAL),
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));

    public static final List<DeferredItem<Item>> ORICHALCUM_ITEMS =  registerAllItems("orichalcum", Tool.ORICHALCUM, Armor.ORICHALCUM,
            new float[]{7.5f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<DeferredBlock<Block>> ORICHALCUM_BLOCKS =  registerAllBlocks("orichalcum",  new float[]{8f, 10f}, SoundType.DEEPSLATE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.RARE));

    public static final List<DeferredItem<Item>> PALLADIUM_ITEMS =  registerAllItems("palladium", Tool.PALLADIUM, Armor.PALLADIUM,
            new float[]{6f, -2.4f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{1, 0f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<DeferredBlock<Block>> PALLADIUM_BLOCKS =  registerAllBlocks("palladium",  new float[]{6f, 8f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<DeferredItem<Item>> PLATINUM_ITEMS =  registerAllItems("platinum", Tool.PLATINUM, Armor.PLATINUM,
            new float[]{6f, -2.4f}, new float[]{1f, -2.8f}, new float[]{6f, -3f}, new float[]{0f, -3f}, new float[]{1.5f, -3f},
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<DeferredBlock<Block>> PLATINUM_BLOCKS =  registerAllBlocks("platinum",  new float[]{6f, 8f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<DeferredItem<Item>> SILVER_ITEMS =  registerAllItems("silver", Tool.SILVER, Armor.SILVER,
            new float[]{5f, -2f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, 0f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<DeferredBlock<Block>> SILVER_BLOCKS =  registerAllBlocks("silver",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<DeferredItem<Item>> TIN_ITEMS =  registerAllItems("tin", Tool.TIN, Armor.TIN,
            new float[]{4f, -2.4f}, new float[]{2f, -2.8f}, new float[]{8f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
            new Item.Properties());
    public static final List<DeferredBlock<Block>> TIN_BLOCKS =  registerAllBlocks("tin",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<DeferredItem<Item>> TITANIUM_ITEMS =  registerAllItems("titanium", Tool.TITANIUM, Armor.TITANIUM,
            new float[]{8f, -2.6f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<DeferredBlock<Block>> TITANIUM_BLOCKS =  registerAllBlocks("titanium",  new float[]{10f, 14f}, SoundType.DEEPSLATE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.EPIC));

    public static final List<DeferredItem<Item>> TUNGSTEM_ITEMS =  registerAllItems("tungsten", Tool.TUNGSTEM, Armor.TUNGSTEM,
            new float[]{5f, -2.4f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<DeferredBlock<Block>> TUNGSTEM_BLOCKS =  registerAllBlocks("tungsten",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<DeferredItem<Item>> COPPER_ITEMS =  registerItems("copper", Tool.COPPER, Armor.COPPER,
            new float[]{4f, -2.4f}, new float[]{2f, -2.8f}, new float[]{8f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
            new Item.Properties());

    public static final List<DeferredItem<Item>> AMETHYST_ITEMS =  registerItems("amethyst", Tool.AMETHYST, Armor.AMETHYST,
            new float[]{4f, -2.4f}, new float[]{2f, -2.8f}, new float[]{8f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
            new Item.Properties());

    public static final List<DeferredItem<Item>> EMERALD_ITEMS =  registerItems("emerald", Tool.EMERALD, Armor.EMERALD,
            new float[]{4f, -2.4f}, new float[]{2f, -2.8f}, new float[]{8f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
            new Item.Properties());


    public static void init(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }
}