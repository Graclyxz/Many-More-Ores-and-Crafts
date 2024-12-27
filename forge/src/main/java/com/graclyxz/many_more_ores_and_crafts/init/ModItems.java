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

    public static final List<RegistryObject<Item>> ADAMANTITE_ITEMS = registerAllItems("adamantite", Tool.ADAMANTITE, Armor.ADAMANTITE,
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<RegistryObject<Block>> ADAMANTITE_BLOCKS = registerAllBlocks("adamantite",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.RARE));

    /*public static final List<RegistryObject<Item>> AMETHYST_ITEMS = registerAllItems("amethyst", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<RegistryObject<Block>> AMETHYST_BLOCKS = registerAllBlocks("amethyst",  new float[]{4f, 6f}, SoundType.STONE);*/

    public static final List<RegistryObject<Item>> COBALT_ITEMS = registerAllItems("cobalt", Tool.COBALT, Armor.COBALT,
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<RegistryObject<Block>> COBALT_BLOCKS = registerAllBlocks("cobalt",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<RegistryObject<Item>> INFERNAL_ITEMS = registerAllItems("infernal", Tool.INFERNAL, Armor.INFERNAL,
            new Item.Properties().fireResistant().rarity(Rarity.RARE));
    public static final List<RegistryObject<Block>> INFERNAL_BLOCKS = registerAllBlocks("infernal",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().fireResistant().rarity(Rarity.RARE));

    public static final List<RegistryObject<Item>> LEAD_ITEMS = registerAllItems("lead", Tool.LEAD, Armor.LEAD,
            new Item.Properties());
    public static final List<RegistryObject<Block>> LEAD_BLOCKS = registerAllBlocks("lead",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<RegistryObject<Item>> MYTHRIL_ITEMS = registerAllItems("mythril", Tool.MYTHRIL, Armor.MYTHRIL,
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<RegistryObject<Block>> MYTHRIL_BLOCKS = registerAllBlocks("mythril",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.EPIC));

    public static final List<RegistryObject<Item>> OBSIDIAN_ITEMS = registerAllItems("obsidian", Tool.OBSIDIAN, Armor.OBSIDIAN,
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> OBSIDIAN_BLOCK = registerBlock("obsidian_block", Block::new, BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().strength(4f, 6f).sound(SoundType.METAL),
            new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON));

    public static final List<RegistryObject<Item>> ORICHALCUM_ITEMS = registerAllItems("orichalcum", Tool.ORICHALCUM, Armor.ORICHALCUM,
            new Item.Properties().rarity(Rarity.RARE));
    public static final List<RegistryObject<Block>> ORICHALCUM_BLOCKS = registerAllBlocks("orichalcum",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.RARE));

    public static final List<RegistryObject<Item>> PALLADIUM_ITEMS = registerAllItems("palladium", Tool.PALLADIUM, Armor.PALLADIUM,
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<RegistryObject<Block>> PALLADIUM_BLOCKS = registerAllBlocks("palladium",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<RegistryObject<Item>> PLATINUM_ITEMS = registerAllItems("platinum", Tool.PLATINUM, Armor.PLATINUM,
            new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final List<RegistryObject<Block>> PLATINUM_BLOCKS = registerAllBlocks("platinum",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final List<RegistryObject<Item>> SILVER_ITEMS = registerAllItems("silver", Tool.SILVER, Armor.SILVER,
            new Item.Properties());
    public static final List<RegistryObject<Block>> SILVER_BLOCKS = registerAllBlocks("silver",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<RegistryObject<Item>> TIN_ITEMS = registerAllItems("tin", Tool.TIN, Armor.TIN,
            new Item.Properties());
    public static final List<RegistryObject<Block>> TIN_BLOCKS = registerAllBlocks("tin",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static final List<RegistryObject<Item>> TITANIUM_ITEMS = registerAllItems("titanium", Tool.TITANIUM, Armor.TITANIUM,
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<RegistryObject<Block>> TITANIUM_BLOCKS = registerAllBlocks("titanium",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.EPIC));

    public static final List<RegistryObject<Item>> TUNGSTEM_ITEMS = registerAllItems("tungsten", Tool.TUNGSTEM, Armor.TUNGSTEM,
            new Item.Properties());
    public static final List<RegistryObject<Block>> TUNGSTEM_BLOCKS = registerAllBlocks("tungsten",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

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
    private static List<RegistryObject<Block>> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
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

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }
}
