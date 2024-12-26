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
    public static final List<Item> BLOCKS = new ArrayList<>();

    /*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/
    public static final List<Item> ADAMANTITE_ITEMS = registerAllItems("adamantite", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> ADAMANTITE_BLOCKS = registerAllBlocks("adamantite",  new float[]{4f, 6f}, SoundType.STONE);

    /*public static final List<Item> AMETHYST_ITEMS = registerAllItems("amethyst", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> AMETHYST_BLOCKS = registerAllBlocks("amethyst",  new float[]{4f, 6f}, SoundType.STONE);*/

    public static final List<Item> COBALT_ITEMS = registerAllItems("cobalt", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> COBALT_BLOCKS = registerAllBlocks("cobalt",  new float[]{4f, 6f}, SoundType.STONE);

    public static final List<Item> INFERNAL_ITEMS = registerAllItems("infernal", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> INFERNAL_BLOCKS = registerAllBlocks("infernal",  new float[]{4f, 6f}, SoundType.STONE);

    public static final List<Item> LEAD_ITEMS = registerAllItems("lead", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> LEAD_BLOCKS = registerAllBlocks("lead",  new float[]{4f, 6f}, SoundType.STONE);

    public static final List<Item> MYTHRIL_ITEMS = registerAllItems("mythril", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> MYTHRIL_BLOCKS = registerAllBlocks("mythril",  new float[]{4f, 6f}, SoundType.STONE);

    /*public static final List<Item> OBSIDIAN_ITEMS = registerAllItems("obsidian", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> OBSIDIAN_BLOCKS = registerAllBlocks("obsidian",  new float[]{4f, 6f}, SoundType.STONE);*/

    public static final List<Item> ORICHALCUM_ITEMS = registerAllItems("orichalcum", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> ORICHALCUM_BLOCKS = registerAllBlocks("orichalcum",  new float[]{4f, 6f}, SoundType.STONE);

    public static final List<Item> PALLADIUM_ITEMS = registerAllItems("palladium", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> PALLADIUM_BLOCKS = registerAllBlocks("palladium",  new float[]{4f, 6f}, SoundType.STONE);

    public static final List<Item> PLATINUM_ITEMS = registerAllItems("platinum", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> PLATINUM_BLOCKS = registerAllBlocks("platinum",  new float[]{4f, 6f}, SoundType.STONE);

    public static final List<Item> SILVER_ITEMS = registerAllItems("silver", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> SILVER_BLOCKS = registerAllBlocks("silver",  new float[]{4f, 6f}, SoundType.STONE);

    public static final List<Item> TIN_ITEMS = registerAllItems("tin", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> TIN_BLOCKS = registerAllBlocks("tin",  new float[]{4f, 6f}, SoundType.STONE);

    public static final List<Item> TITANIUM_ITEMS = registerAllItems("titanium", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> TITANIUM_BLOCKS = registerAllBlocks("titanium",  new float[]{4f, 6f}, SoundType.STONE);

    public static final List<Item> TUNGSTEM_ITEMS = registerAllItems("tungsten", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> TUNGSTEM_BLOCKS = registerAllBlocks("tungsten",  new float[]{4f, 6f}, SoundType.STONE);


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
    private static List<Item> registerAllItems(String name, ToolMaterial toolmaterial, ArmorMaterial armormaterial, Item.Properties itemProp) {
        return List.of(
                registerItem( "raw_" + name, Item::new, itemProp),
                registerItem( name +"_ingot", Item::new, itemProp),
                registerItem( name +"_nugget", Item::new, itemProp),

                registerItem(name + "_sword", (p) -> new SwordItem(toolmaterial,  5, -2.4f, p), itemProp),
                registerItem(name + "_pickaxe", (p) -> new PickaxeItem(toolmaterial,  3, -2.8f, p), itemProp),
                registerItem(name + "_axe", (p) -> new AxeItem(toolmaterial,  8, -3.1f, p), itemProp),
                registerItem(name + "_hoe", (p) -> new HoeItem(toolmaterial,  0, -1f, p), itemProp),
                registerItem( name + "_shovel", (p) -> new ShovelItem(toolmaterial,  3.5f, -3f, p), itemProp),

                registerItem(name + "_helmet", (p) -> new ArmorItem(armormaterial, ArmorType.HELMET, p), itemProp),
                registerItem(name + "_chestplate", (p) -> new ArmorItem(armormaterial, ArmorType.CHESTPLATE, p), itemProp),
                registerItem(name + "_leggings", (p) -> new ArmorItem(armormaterial, ArmorType.LEGGINGS, p), itemProp),
                registerItem(name + "_boots", (p) -> new ArmorItem(armormaterial, ArmorType.BOOTS, p), itemProp)
        );
    }

    /*-*-*-*-*-*-*-*-* Blocks list *-*-*-*-*-*-*-*-*/
    private static List<Block> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock) {
        return List.of(
                registerBlock(name + "_block", Block::new, BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                        .strength(4f, 6f).sound(SoundType.METAL),
                        new Item.Properties()),

                registerBlock(name + "_ore", Block::new, BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                                .strength(strengthattr[0],strengthattr[1]).sound(soundblock),
                        new Item.Properties()),

                registerBlock("raw_" + name + "_block", Block::new, BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                                .strength(4f, 6f).sound(SoundType.STONE),
                        new Item.Properties())
        );
    }

    public static void init() {
    }
}