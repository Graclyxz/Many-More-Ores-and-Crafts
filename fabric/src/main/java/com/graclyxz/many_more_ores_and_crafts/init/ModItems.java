package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;
import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Armor;
import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Tool;


public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();

    /*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/

    /***** Items Register ****/
    /* 1. Items Name 
       2. Items ToolMaterial 
       3. Items ArmorMaterial 
       4. Tools attributes float[]: sword, pickaxe, axe, hoe, shovel 
       5. Item propeties */

    /***** Blocks Register ****/
    /* 1. Blocks Name 
       2. Strength ore ottribute 
       3. Ore Sound
       4. BlockBehaviour prpeties
       5. Item propeties */

    public static final List<Item> ADAMANTITE_ITEMS = registerAllItems("adamantite", Tool.ADAMANTITE, Armor.ADAMANTITE,
            new float[]{5, -1.8f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0f, 0f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<Block> ADAMANTITE_BLOCKS = registerAllBlocks("adamantite",  new float[]{8f, 10f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.RARE));

    /*public static final List<Item> AMETHYST_ITEMS = registerAllItems("amethyst", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> AMETHYST_BLOCKS = registerAllBlocks("amethyst",  new float[]{4f, 6f}, SoundType.STONE);*/

    public static final List<Item> COBALT_ITEMS = registerAllItems("cobalt", Tool.COBALT, Armor.COBALT,
            new float[]{5f, -2f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, 0f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<Block> COBALT_BLOCKS = registerAllBlocks("cobalt",  new float[]{6f, 8f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<Item> INFERNAL_ITEMS = registerAllItems("infernal", Tool.INFERNAL, Armor.INFERNAL,
            new float[]{7f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
            new Item.Properties().fireResistant().rarity(Rarity.RARE));
    public static final List<Block> INFERNAL_BLOCKS = registerAllBlocks("infernal",  new float[]{8f, 10f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().fireResistant().rarity(Rarity.RARE));

    public static final List<Item> LEAD_ITEMS = registerAllItems("lead", Tool.LEAD, Armor.LEAD,
            new float[]{5f, -2.4f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<Block> LEAD_BLOCKS = registerAllBlocks("lead",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<Item> MYTHRIL_ITEMS = registerAllItems("mythril", Tool.MYTHRIL, Armor.MYTHRIL,
            new float[]{7f, -1.4f}, new float[]{5f, -2.8f}, new float[]{9f, -3f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<Block> MYTHRIL_BLOCKS = registerAllBlocks("mythril",  new float[]{10f, 12f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.EPIC));

    public static final List<Item> OBSIDIAN_ITEMS = registerAllItems("obsidian", Tool.OBSIDIAN, Armor.OBSIDIAN,
            new float[]{7f, -3.2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{1, -1f}, new float[]{4.5f, -3f},
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));
    public static final Block OBSIDIAN_BLOCK = registerBlock("obsidian_block", Block::new, BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().strength(4f, 6f).sound(SoundType.METAL),
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));

    public static final List<Item> ORICHALCUM_ITEMS = registerAllItems("orichalcum", Tool.ORICHALCUM, Armor.ORICHALCUM,
            new float[]{5f, -3f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<Block> ORICHALCUM_BLOCKS = registerAllBlocks("orichalcum",  new float[]{8f, 10f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.RARE));

    public static final List<Item> PALLADIUM_ITEMS = registerAllItems("palladium", Tool.PALLADIUM, Armor.PALLADIUM,
            new float[]{5f, -2f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{1, 0f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<Block> PALLADIUM_BLOCKS = registerAllBlocks("palladium",  new float[]{6f, 8f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<Item> PLATINUM_ITEMS = registerAllItems("platinum", Tool.PLATINUM, Armor.PLATINUM,
            new float[]{5f, -2.2f}, new float[]{1f, -2.8f}, new float[]{6f, -3f}, new float[]{0f, -3f}, new float[]{1.5f, -3f},
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<Block> PLATINUM_BLOCKS = registerAllBlocks("platinum",  new float[]{6f, 8f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<Item> SILVER_ITEMS = registerAllItems("silver", Tool.SILVER, Armor.SILVER,
            new float[]{5f, -2f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, 0f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<Block> SILVER_BLOCKS = registerAllBlocks("silver",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<Item> TIN_ITEMS = registerAllItems("tin", Tool.TIN, Armor.TIN,
            new float[]{4f, -2.4f}, new float[]{2f, -2.8f}, new float[]{8f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
            new Item.Properties());
    public static final List<Block> TIN_BLOCKS = registerAllBlocks("tin",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<Item> TITANIUM_ITEMS = registerAllItems("titanium", Tool.TITANIUM, Armor.TITANIUM,
            new float[]{7f, -2.8f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<Block> TITANIUM_BLOCKS = registerAllBlocks("titanium",  new float[]{10f, 14f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.EPIC));

    public static final List<Item> TUNGSTEM_ITEMS = registerAllItems("tungsten", Tool.TUNGSTEM, Armor.TUNGSTEM,
            new float[]{5f, -2f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<Block> TUNGSTEM_BLOCKS = registerAllBlocks("tungsten",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    /*-*-*-*-*-*-*-*-* item and blocks registration *-*-*-*-*-*-*-*-*/
    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        var blockReg = registerBlock(name, function, blockProp);
        registerItem(name, (p) -> new BlockItem(blockReg, p), itemProp.useBlockDescriptionPrefix());
        return blockReg;
    }

    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)), function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
    }

    public static Item registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        var itemReg = Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)), function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
        ITEMS.add(itemReg);
        return itemReg;
    }

    /*-*-*-*-*-*-*-*-* Items list *-*-*-*-*-*-*-*-*/
    private static List<Item> registerAllItems(String name, ToolMaterial toolmaterial, ArmorMaterial armormaterial,
                                                             float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
                                                             Item.Properties itemProp) {
        return List.of(
                registerItem( "raw_" + name, Item::new, itemProp),
                registerItem( name +"_ingot", Item::new, itemProp),
                registerItem( name +"_nugget", Item::new, itemProp),

                registerItem(name + "_sword", (p) -> new SwordItem(toolmaterial,  swordattr[0], swordattr[1], p), itemProp),
                registerItem(name + "_pickaxe", (p) -> new PickaxeItem(toolmaterial,  pickaxeattr[0], pickaxeattr[1], p), itemProp),
                registerItem(name + "_axe", (p) -> new AxeItem(toolmaterial,  axeattr[0], axeattr[1], p), itemProp),
                registerItem(name + "_hoe", (p) -> new HoeItem(toolmaterial,  hoeattr[0], hoeattr[1], p), itemProp),
                registerItem( name + "_shovel", (p) -> new ShovelItem(toolmaterial,  shovelattr[0], shovelattr[1], p), itemProp),

                registerItem(name + "_helmet", (p) -> new ArmorItem(armormaterial, ArmorType.HELMET, p), itemProp),
                registerItem(name + "_chestplate", (p) -> new ArmorItem(armormaterial, ArmorType.CHESTPLATE, p), itemProp),
                registerItem(name + "_leggings", (p) -> new ArmorItem(armormaterial, ArmorType.LEGGINGS, p), itemProp),
                registerItem(name + "_boots", (p) -> new ArmorItem(armormaterial, ArmorType.BOOTS, p), itemProp)
        );
    }

    /*-*-*-*-*-*-*-*-* Blocks list *-*-*-*-*-*-*-*-*/
    private static List<Block> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        return List.of(
                registerBlock(name + "_block", Block::new, blockProp.requiresCorrectToolForDrops()
                        .strength(4f, 6f).sound(SoundType.METAL),
                        itemProp),

                registerBlock(name + "_ore", Block::new, blockProp.requiresCorrectToolForDrops()
                                .strength(strengthattr[0],strengthattr[1]).sound(soundblock),
                        itemProp),

                registerBlock("raw_" + name + "_block", Block::new, blockProp.requiresCorrectToolForDrops()
                                .strength(4f, 6f).sound(SoundType.STONE),
                        itemProp)
        );
    }

    public static void init() {
    }
}
