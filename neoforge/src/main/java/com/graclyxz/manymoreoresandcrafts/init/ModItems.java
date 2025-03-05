package com.graclyxz.manymoreoresandcrafts.init;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.function.Supplier;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ModItems {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    /*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/

    /* **** Items Register ****/
    /* 1. Items Name
       2. Items ModTier
       3. Tools attributes float[]: sword, pickaxe, axe, hoe, shovel
       4. Item propeties */

    /* **** Blocks Register ****/
    /* 1. Blocks Name
       2. Strength ore ottribute
       3. Ore Sound
       4. MapColor
       5. BlockBehaviour prpeties
       6. Item propeties */

    public static final List<DeferredItem<Item>> ADAMANTITE_ITEMS = registerAllItems("adamantite", ModTiers.ADAMANTITE,
            new float[]{7.5f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0f, 0f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<DeferredItem<Item>> ADAMANTITE_ARMOR = registerArmor(ModMaterials.ADAMANTITE, 20,
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<DeferredBlock<Block>> ADAMANTITE_BLOCKS = registerAllBlocks("adamantite",  new float[]{8f, 10f}, SoundType.DEEPSLATE, MapColor.COLOR_RED,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.RARE));


    public static final List<DeferredItem<Item>> COBALT_ITEMS = registerAllItems("cobalt", ModTiers.COBALT,
            new float[]{6f, -2f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{0, 0f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<DeferredItem<Item>> COBALT_ARMOR = registerArmor(ModMaterials.COBALT, 20,
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<DeferredBlock<Block>> COBALT_BLOCKS = registerAllBlocks("cobalt",  new float[]{6f, 8f}, SoundType.STONE, MapColor.COLOR_BLUE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<DeferredItem<Item>> INFERNAL_ITEMS = registerAllItems("infernal", ModTiers.INFERNAL,
            new float[]{7f, -1.8f}, new float[]{4f, -2.8f}, new float[]{8f, -2.6f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
            new Item.Properties().fireResistant().rarity(Rarity.RARE));
    public static final List<DeferredItem<Item>> INFERNAL_ARMOR = registerArmor(ModMaterials.INFERNAL, 25,
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<DeferredBlock<Block>> INFERNAL_BLOCKS = registerAllBlocks("infernal",  new float[]{8f, 10f}, SoundType.NETHER_ORE, MapColor.COLOR_RED,
            BlockBehaviour.Properties.of(),
            new Item.Properties().fireResistant().rarity(Rarity.RARE));

    public static final List<DeferredItem<Item>> LEAD_ITEMS = registerAllItems("lead", ModTiers.LEAD,
            new float[]{4f, -2.6f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<DeferredItem<Item>> LEAD_ARMOR = registerArmor(ModMaterials.LEAD, 15,
            new Item.Properties());
    public static final List<DeferredBlock<Block>> LEAD_BLOCKS = registerAllBlocks("lead",  new float[]{4f, 6f}, SoundType.STONE,MapColor.COLOR_GRAY,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<DeferredItem<Item>> MYTHRIL_ITEMS = registerAllItems("mythril", ModTiers.MYTHRIL,
            new float[]{8f, -2.8f}, new float[]{5f, -2.8f}, new float[]{9f, -2.8f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<DeferredItem<Item>> MYTHRIL_ARMOR = registerArmor(ModMaterials.MYTHRIL, 32,
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<DeferredBlock<Block>> MYTHRIL_BLOCKS = registerAllBlocks("mythril",  new float[]{10f, 12f}, SoundType.DEEPSLATE, MapColor.COLOR_LIGHT_GREEN,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.EPIC));

    public static final List<DeferredItem<Item>> OBSIDIAN_ITEMS = registerAllItems("obsidian", ModTiers.OBSIDIAN,
            new float[]{9f, -3.2f}, new float[]{4f, -2.8f}, new float[]{10f, -3.6f}, new float[]{1, -1f}, new float[]{4.5f, -3f},
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));
    public static final List<DeferredItem<Item>> OBSIDIAN_ARMOR = registerArmor(ModMaterials.OBSIDIAN, 18,
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final DeferredBlock<Block> OBSIDIAN_BLOCK = registerBlock("obsidian_block", ()-> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
                    .strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)),
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));

    public static final DeferredBlock<Block> RAW_OBSIDIAN_BLOCK = registerBlock("raw_obsidian_block", ()-> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
                    .strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)),
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));


    public static final List<DeferredItem<Item>> ORICHALCUM_ITEMS = registerAllItems("orichalcum", ModTiers.ORICHALCUM,
            new float[]{7.5f, -2f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{0, -1f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<DeferredItem<Item>> ORICHALCUM_ARMOR = registerArmor(ModMaterials.ORICHALCUM, 25,
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<DeferredBlock<Block>> ORICHALCUM_BLOCKS = registerAllBlocks("orichalcum",  new float[]{8f, 10f}, SoundType.DEEPSLATE, MapColor.COLOR_PINK,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.RARE));

    public static final List<DeferredItem<Item>> PALLADIUM_ITEMS = registerAllItems("palladium", ModTiers.PALLADIUM,
            new float[]{6f, -2.4f}, new float[]{3f, -2.8f}, new float[]{8f, -3.1f}, new float[]{1, 0f}, new float[]{4.5f, -3f},
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<DeferredItem<Item>> PALLADIUM_ARMOR = registerArmor(ModMaterials.PALLADIUM, 25,
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<DeferredBlock<Block>> PALLADIUM_BLOCKS = registerAllBlocks("palladium",  new float[]{6f, 8f}, SoundType.STONE, MapColor.COLOR_RED,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<DeferredItem<Item>> PLATINUM_ITEMS = registerAllItems("platinum", ModTiers.PLATINUM,
            new float[]{6f, -2.4f}, new float[]{1f, -2.8f}, new float[]{7f, -3f}, new float[]{0f, -3f}, new float[]{1.5f, -3f},
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<DeferredItem<Item>> PLATINUM_ARMOR = registerArmor(ModMaterials.PLATINUM, 20,
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<DeferredBlock<Block>> PLATINUM_BLOCKS = registerAllBlocks("platinum",  new float[]{6f, 8f}, SoundType.STONE, MapColor.COLOR_GRAY,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<DeferredItem<Item>> SILVER_ITEMS = registerAllItems("silver", ModTiers.SILVER,
            new float[]{5f, -2f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, 0f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<DeferredItem<Item>> SILVER_ARMOR = registerArmor(ModMaterials.SILVER, 18,
            new Item.Properties());
    public static final List<DeferredBlock<Block>> SILVER_BLOCKS = registerAllBlocks("silver",  new float[]{4f, 6f}, SoundType.STONE, MapColor.COLOR_GRAY,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<DeferredItem<Item>> TIN_ITEMS = registerAllItems("tin", ModTiers.TIN,
            new float[]{4f, -2.4f}, new float[]{2f, -2.8f}, new float[]{6f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
            new Item.Properties());
    public static final List<DeferredItem<Item>> TIN_ARMOR = registerArmor(ModMaterials.TIN, 15,
            new Item.Properties());
    public static final List<DeferredBlock<Block>> TIN_BLOCKS = registerAllBlocks("tin",  new float[]{4f, 6f}, SoundType.STONE, MapColor.COLOR_BROWN,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<DeferredItem<Item>> TITANIUM_ITEMS = registerAllItems("titanium", ModTiers.TITANIUM,
            new float[]{8f, -2.6f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<DeferredItem<Item>> TITANIUM_ARMOR = registerArmor(ModMaterials.TITANIUM, 34,
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<DeferredBlock<Block>> TITANIUM_BLOCKS = registerAllBlocks("titanium",  new float[]{10f, 14f}, SoundType.DEEPSLATE, MapColor.COLOR_CYAN,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.EPIC));

    public static final List<DeferredItem<Item>> TUNGSTEM_ITEMS = registerAllItems("tungsten", ModTiers.TUNGSTEM,
            new float[]{5f, -2.4f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, -1f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<DeferredItem<Item>> TUNGSTEM_ARMOR = registerArmor(ModMaterials.TUNGSTEM, 18,
            new Item.Properties());
    public static final List<DeferredBlock<Block>> TUNGSTEM_BLOCKS = registerAllBlocks("tungsten",  new float[]{4f, 6f}, SoundType.STONE, MapColor.COLOR_GREEN,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<DeferredItem<Item>> COPPER_ITEMS =  registerItems("copper", ModTiers.COPPER,
            new float[]{4f, -2.5f}, new float[]{2f, -2.8f}, new float[]{6f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
            new Item.Properties());
    public static final List<DeferredItem<Item>> COPPER_ARMOR = registerArmor(ModMaterials.COPPER, 10,
            new Item.Properties());

    public static final List<DeferredItem<Item>> AMETHYST_ITEMS = registerItems("amethyst", ModTiers.AMETHYST,
            new float[]{5f, -2.4f}, new float[]{2f, -2.8f}, new float[]{6f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
            new Item.Properties());
    public static final List<DeferredItem<Item>> AMETHYST_ARMOR = registerArmor(ModMaterials.AMETHYST, 16,
            new Item.Properties());

    public static final List<DeferredItem<Item>> EMERALD_ITEMS =  registerItems("emerald", ModTiers.EMERALD,
            new float[]{6f, -2.6f}, new float[]{2f, -2.8f}, new float[]{7f, -3.2f}, new float[]{0, -2f}, new float[]{2.5f, -3f},
            new Item.Properties());
    public static final List<DeferredItem<Item>> EMERALD_ARMOR = registerArmor(ModMaterials.EMERALD, 15,
            new Item.Properties());


    /*-******************************************************************************************************************-*/
    /*--------------------------------                  REGISTERS               ------------------------------------------*/
    /*-******************************************************************************************************************-*/


    private static DeferredBlock<Block> registerBlock(String name, Supplier<Block> supplier, Item.Properties itemProp) {
        var blockReg = registerBlock(name, supplier);
        registerItem(name, () -> new BlockItem(blockReg.get(), itemProp));
        return blockReg;
    }

    private static DeferredBlock<Block> registerBlock(String name, Supplier<Block> supplier) {
        return BLOCKS.register(name, supplier);
    }

    private static DeferredItem<Item> registerItem(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }


    private static List<DeferredItem<Item>> registerAllItems(String name, Tier tooltier,
                                                               float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
                                                               Item.Properties itemProp) {
        return List.of(
                registerItem( "raw_" + name, () -> new Item(itemProp)),
                registerItem( name +"_ingot", () -> new Item(itemProp)),
                registerItem( name +"_nugget", () -> new Item(itemProp)),

                registerItem(name + "_sword", () -> new SwordItem(tooltier, itemProp.attributes(SwordItem.createAttributes(tooltier, (int) swordattr[0], swordattr[1])))),
                registerItem(name + "_pickaxe", () -> new PickaxeItem(tooltier, itemProp.attributes(PickaxeItem.createAttributes(tooltier, pickaxeattr[0], pickaxeattr[1])))),
                registerItem(name + "_axe", () -> new AxeItem(tooltier, itemProp.attributes(AxeItem.createAttributes(tooltier,axeattr[0], axeattr[1])))),
                registerItem(name + "_hoe", () -> new HoeItem(tooltier, itemProp.attributes(HoeItem.createAttributes(tooltier,hoeattr[0], hoeattr[1])))),
                registerItem(name + "_shovel", () -> new ShovelItem(tooltier, itemProp.attributes(ShovelItem.createAttributes(tooltier, shovelattr[0], shovelattr[1]))))
        );
    }

    private static List<DeferredItem<Item>> registerItems(String name, Tier tooltier,
                                                            float[] swordattr, float[] pickaxeattr, float[] axeattr, float[] hoeattr, float[] shovelattr,
                                                            Item.Properties itemProp) {
        return List.of(
                registerItem(name + "_sword", () -> new SwordItem(tooltier, itemProp.attributes(SwordItem.createAttributes(tooltier, (int) swordattr[0], swordattr[1])))),
                registerItem(name + "_pickaxe", () -> new PickaxeItem(tooltier, itemProp.attributes(PickaxeItem.createAttributes(tooltier, pickaxeattr[0], pickaxeattr[1])))),
                registerItem(name + "_axe", () -> new AxeItem(tooltier, itemProp.attributes(AxeItem.createAttributes(tooltier,axeattr[0], axeattr[1])))),
                registerItem(name + "_hoe", () -> new HoeItem(tooltier, itemProp.attributes(HoeItem.createAttributes(tooltier,hoeattr[0], hoeattr[1])))),
                registerItem(name + "_shovel", () -> new ShovelItem(tooltier, itemProp.attributes(ShovelItem.createAttributes(tooltier, shovelattr[0], shovelattr[1]))))
        );
    }

    private static List<DeferredItem<Item>> registerArmor(Holder<ArmorMaterial> material, int durabilityMultiplier, Item.Properties itemProp) {
        String name = material.getRegisteredName().substring(material.getRegisteredName().indexOf(ResourceLocation.NAMESPACE_SEPARATOR) + 1);
        return List.of(
                registerItem(name + "_helmet", () -> new ArmorItem(material, ArmorItem.Type.HELMET, itemProp.durability(ArmorItem.Type.HELMET.getDurability(durabilityMultiplier)))),
                registerItem(name + "_chestplate", () -> new ArmorItem(material, ArmorItem.Type.CHESTPLATE, itemProp.durability(ArmorItem.Type.CHESTPLATE.getDurability(durabilityMultiplier)))),
                registerItem(name + "_leggings", () -> new ArmorItem(material, ArmorItem.Type.LEGGINGS, itemProp.durability(ArmorItem.Type.LEGGINGS.getDurability(durabilityMultiplier)))),
                registerItem(name + "_boots", () -> new ArmorItem(material, ArmorItem.Type.BOOTS, itemProp.durability(ArmorItem.Type.BOOTS.getDurability(durabilityMultiplier))))
        );
    }

    private static List<DeferredBlock<Block>> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock, MapColor color, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        return List.of(
                registerBlock(name +"_block", () -> new Block(blockProp.mapColor(color)
                        .strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), itemProp),

                registerBlock(name +"_ore", () -> new Block(blockProp.mapColor(color)
                        .strength(strengthattr[0],strengthattr[1]).requiresCorrectToolForDrops().sound(soundblock)), itemProp),

                registerBlock("raw_" + name + "_block", () -> new Block(blockProp.mapColor(color)
                        .strength(4f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), itemProp)
        );
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
