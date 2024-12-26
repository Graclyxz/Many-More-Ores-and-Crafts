package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Function;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;
import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Armor;
import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Tool;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MOD_ID);

    /*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/
    public static final List<RegistryObject<Item>> TIN_ITEMS = registerAllItems("tin", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<RegistryObject<Block>> TIN_BLOCKS = registerAllBlocks("tin",  new float[]{4f, 6f}, SoundType.STONE);

    /*-*-*-*-*-*-*-*-* item and blocks registration *-*-*-*-*-*-*-*-*/
    public static RegistryObject<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        var blockReg = registerBlock(name, function, blockProp);
        registerItem(name, (p) -> new BlockItem(blockReg.get(), p), itemProp.useBlockDescriptionPrefix());
        return blockReg;
    }

    public static RegistryObject<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
        return BLOCKS.register(name, () -> function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
    }

    public static RegistryObject<Item> registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        return ITEMS.register(name, () -> function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
    }

    /*-*-*-*-*-*-*-*-* Items list *-*-*-*-*-*-*-*-*/
    private static List<RegistryObject<Item>> registerAllItems(String name, ToolMaterial toolmaterial, ArmorMaterial armormaterial, Item.Properties itemProp) {
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
    private static List<RegistryObject<Block>> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock) {
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

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }
}
