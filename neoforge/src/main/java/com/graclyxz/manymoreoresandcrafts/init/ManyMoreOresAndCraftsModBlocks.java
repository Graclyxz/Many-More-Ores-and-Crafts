package com.graclyxz.manymoreoresandcrafts.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.function.Function;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;
import static com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems.registerItem;

public class ManyMoreOresAndCraftsModBlocks {

	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MOD_ID);

	public static final DeferredBlock<Block> DEEPSLATEADAMANTITEORE = registerBlock("deepslateadamantiteore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(8f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> COBALTORE = registerBlock("cobaltore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(6f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> NETHERINFERNALORE = registerBlock("netherinfernalore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.NETHER_ORE).strength(8f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> LEADORE = registerBlock("leadore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> DEEPSLATEMYTHRILORE = registerBlock("deepslatemythrilore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(10f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> DEEPSLATEORICHALCUMORE = registerBlock("deepslateorichalcumore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(8f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> PALLADIUMORE = registerBlock("palladiumore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(6f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> PLATINUMORE = registerBlock("platinumore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(6f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> SILVERORE = registerBlock("silverore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block>TINORE = registerBlock("tinore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> TITANIUMORE = registerBlock("titaniumore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(10f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> TUNGSTENORE = registerBlock("tungstenore", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> ADAMANTITEBLOCK = registerBlock("adamantiteblock", Block::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> COBALTBLOCK = registerBlock("cobaltblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> INFERNALBLOCK = registerBlock("infernalblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(2f, 8f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> LEADBLOCK = registerBlock("leadblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> MYTHRILBLOCK = registerBlock("mythrilblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 8f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> OBSIDIANBLOCK = registerBlock("obsidianblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(4f, 10f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> ORICHALCUMBLOCK = registerBlock("orichalcumblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> PALLADIUMBLOCK = registerBlock("palladiumblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> PLATINUMBLOCK = registerBlock("platinumblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> SILVERBLOCK = registerBlock("silverblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> TINBLOCK = registerBlock("tinblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> TITANIUMBLOCK = registerBlock("titaniumblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> TUNGSTENBLOCK = registerBlock("tungstenblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWADAMANTITEBLOCK = registerBlock("rawadamantiteblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWCOBALTBLOCK = registerBlock("rawcobaltblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWINFERNALBLOCK = registerBlock("rawinfernalblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWLEADBLOCK = registerBlock("rawleadblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWMYTHRILBLOCK = registerBlock("rawmythrilblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWORICHALCUMBLOCK = registerBlock("raworichalcumblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWPALLADIUMBLOCK = registerBlock("rawpalladiumblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWPLATINUMBLOCK = registerBlock("rawplatinumblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block>RAWSILVERBLOCK = registerBlock("rawsilverblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWTINBLOCK = registerBlock("rawtinblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWTITANIUMBLOCK = registerBlock("rawtitaniumblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());

	public static final DeferredBlock<Block> RAWTUNGSTENBLOCK = registerBlock("rawtungstenblock", Block::new,
			BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 6f).requiresCorrectToolForDrops(),
			new Item.Properties());


	public static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
		var blockReg = registerBlock(name, function, blockProp);
		registerItem(name, (p) -> new BlockItem(blockReg.get(), p), itemProp.useBlockDescriptionPrefix());
		return blockReg;
	}

	public static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
		return REGISTRY.register(name, () -> function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
	}

	//public static void init(IEventBus bus) {REGISTRY.register(bus);}
}
