package com.graclyxz.manymoreoresandcrafts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.graclyxz.manymoreoresandcrafts.block.TungstenoreBlock;
import com.graclyxz.manymoreoresandcrafts.block.TungstenblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.TitaniumoreBlock;
import com.graclyxz.manymoreoresandcrafts.block.TitaniumblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.TinoreBlock;
import com.graclyxz.manymoreoresandcrafts.block.TinblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.SilveroreBlock;
import com.graclyxz.manymoreoresandcrafts.block.SilverblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawtungstenblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawtitaniumblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawtinblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawsilverblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawplatinumblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawpalladiumblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RaworichalcumblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawmythrilblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawleadblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawinfernalblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawcobaltblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.RawadamantiteblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.PlatinumoreBlock;
import com.graclyxz.manymoreoresandcrafts.block.PlatinumblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.PalladiumoreBlock;
import com.graclyxz.manymoreoresandcrafts.block.PalladiumblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.OrichalcumblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.ObsidianblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.NetherinfernaloreBlock;
import com.graclyxz.manymoreoresandcrafts.block.MythrilblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.LeadoreBlock;
import com.graclyxz.manymoreoresandcrafts.block.LeadblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.InfernalblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.DeepslateorichalcumoreBlock;
import com.graclyxz.manymoreoresandcrafts.block.DeepslatemythriloreBlock;
import com.graclyxz.manymoreoresandcrafts.block.DeepslateadamantiteoreBlock;
import com.graclyxz.manymoreoresandcrafts.block.CobaltoreBlock;
import com.graclyxz.manymoreoresandcrafts.block.CobaltblockBlock;
import com.graclyxz.manymoreoresandcrafts.block.AdamantiteblockBlock;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ManyMoreOresAndCraftsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

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

	public static final RegistryObject<Block> ADAMANTITEBLOCK = REGISTRY.register("adamantiteblock", () -> new AdamantiteblockBlock());
	public static final RegistryObject<Block> RAWADAMANTITEBLOCK = REGISTRY.register("rawadamantiteblock", () -> new RawadamantiteblockBlock());
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
	public static final RegistryObject<Block> RAWTUNGSTENBLOCK = REGISTRY.register("rawtungstenblock", () -> new RawtungstenblockBlock());
}
