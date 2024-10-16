package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.block.AdamantiteblockBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import dev.turtywurty.tutorialmod.TutorialMod;
import dev.turtywurty.tutorialmod.block.*;
import dev.turtywurty.tutorialmod.init.worldgen.ConfiguredFeatureInit;
import dev.turtywurty.tutorialmod.list.BlockSetTypeList;
import dev.turtywurty.tutorialmod.list.WoodTypeList;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Optional;

import static jdk.internal.misc.TerminatingThreadLocal.register;

public class ManyMoreOresAndCraftsModBlocks {

	public static final Block EXAMPLE_BLOCK = registerWithItem("example_block", new Block(AbstractBlock.Settings.create()
			.strength(1.5F, 6.0F)
			.requiresTool()));


	public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
		T registered = register(name, block);
		ItemInit.register(name, new BlockItem(registered, settings));
		return registered;
	}

	public static <T extends Block> T registerWithItem(String name, T block) {
		return registerWithItem(name, block, new Item.Settings());
	}

	/*public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
	public static final RegistryObject<Block> ADAMANTITEBLOCK = REGISTRY.register("adamantiteblock", () -> new AdamantiteblockBlock());
	public static final RegistryObject<Block> RAWADAMANTITEBLOCK = REGISTRY.register("rawadamantiteblock", () -> new RawadamantiteblockBlock());
	public static final RegistryObject<Block> DEEPSLATEADAMANTITEORE = REGISTRY.register("deepslateadamantiteore", () -> new DeepslateadamantiteoreBlock());
	public static final RegistryObject<Block> COBALTORE = REGISTRY.register("cobaltore", () -> new CobaltoreBlock());
	public static final RegistryObject<Block> NETHERINFERNALORE = REGISTRY.register("netherinfernalore", () -> new NetherinfernaloreBlock());
	public static final RegistryObject<Block> LEADORE = REGISTRY.register("leadore", () -> new LeadoreBlock());
	public static final RegistryObject<Block> DEEPSLATEMYTHRILORE = REGISTRY.register("deepslatemythrilore", () -> new DeepslatemythriloreBlock());
	public static final RegistryObject<Block> DEEPSLATEORICHALCUMORE = REGISTRY.register("deepslateorichalcumore", () -> new DeepslateorichalcumoreBlock());
	public static final RegistryObject<Block> PALLADIUMORE = REGISTRY.register("palladiumore", () -> new PalladiumoreBlock());
	public static final RegistryObject<Block> PLATINUMORE = REGISTRY.register("platinumore", () -> new PlatinumoreBlock());
	public static final RegistryObject<Block> SILVERORE = REGISTRY.register("silverore", () -> new SilveroreBlock());
	public static final RegistryObject<Block> TINORE = REGISTRY.register("tinore", () -> new TinoreBlock());
	public static final RegistryObject<Block> TITANIUMORE = REGISTRY.register("titaniumore", () -> new TitaniumoreBlock());
	public static final RegistryObject<Block> TUNGSTENORE = REGISTRY.register("tungstenore", () -> new TungstenoreBlock());
	public static final RegistryObject<Block> COBALTBLOCK = REGISTRY.register("cobaltblock", () -> new CobaltblockBlock());
	public static final RegistryObject<Block> INFERNALBLOCK = REGISTRY.register("infernalblock", () -> new InfernalblockBlock());
	public static final RegistryObject<Block> LEADBLOCK = REGISTRY.register("leadblock", () -> new LeadblockBlock());
	public static final RegistryObject<Block> MYTHRILBLOCK = REGISTRY.register("mythrilblock", () -> new MythrilblockBlock());
	public static final RegistryObject<Block> OBSIDIANBLOCK = REGISTRY.register("obsidianblock", () -> new ObsidianblockBlock());
	public static final RegistryObject<Block> ORICHALCUMBLOCK = REGISTRY.register("orichalcumblock", () -> new OrichalcumblockBlock());
	public static final RegistryObject<Block> PALLADIUMBLOCK = REGISTRY.register("palladiumblock", () -> new PalladiumblockBlock());
	public static final RegistryObject<Block> PLATINUMBLOCK = REGISTRY.register("platinumblock", () -> new PlatinumblockBlock());
	public static final RegistryObject<Block> SILVERBLOCK = REGISTRY.register("silverblock", () -> new SilverblockBlock());
	public static final RegistryObject<Block> TINBLOCK = REGISTRY.register("tinblock", () -> new TinblockBlock());
	public static final RegistryObject<Block> TITANIUMBLOCK = REGISTRY.register("titaniumblock", () -> new TitaniumblockBlock());
	public static final RegistryObject<Block> TUNGSTENBLOCK = REGISTRY.register("tungstenblock", () -> new TungstenblockBlock());
	public static final RegistryObject<Block> RAWCOBALTBLOCK = REGISTRY.register("rawcobaltblock", () -> new RawcobaltblockBlock());
	public static final RegistryObject<Block> RAWINFERNALBLOCK = REGISTRY.register("rawinfernalblock", () -> new RawinfernalblockBlock());
	public static final RegistryObject<Block> RAWLEADBLOCK = REGISTRY.register("rawleadblock", () -> new RawleadblockBlock());
	public static final RegistryObject<Block> RAWMYTHRILBLOCK = REGISTRY.register("rawmythrilblock", () -> new RawmythrilblockBlock());
	public static final RegistryObject<Block> RAWORICHALCUMBLOCK = REGISTRY.register("raworichalcumblock", () -> new RaworichalcumblockBlock());
	public static final RegistryObject<Block> RAWPALLADIUMBLOCK = REGISTRY.register("rawpalladiumblock", () -> new RawpalladiumblockBlock());
	public static final RegistryObject<Block> RAWPLATINUMBLOCK = REGISTRY.register("rawplatinumblock", () -> new RawplatinumblockBlock());
	public static final RegistryObject<Block> RAWSILVERBLOCK = REGISTRY.register("rawsilverblock", () -> new RawsilverblockBlock());
	public static final RegistryObject<Block> RAWTINBLOCK = REGISTRY.register("rawtinblock", () -> new RawtinblockBlock());
	public static final RegistryObject<Block> RAWTITANIUMBLOCK = REGISTRY.register("rawtitaniumblock", () -> new RawtitaniumblockBlock());
	public static final RegistryObject<Block> RAWTUNGSTENBLOCK = REGISTRY.register("rawtungstenblock", () -> new RawtungstenblockBlock());*/
}
