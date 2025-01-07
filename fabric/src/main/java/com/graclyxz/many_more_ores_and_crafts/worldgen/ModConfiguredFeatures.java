package com.graclyxz.many_more_ores_and_crafts.worldgen;

import com.graclyxz.many_more_ores_and_crafts.init.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

import static com.graclyxz.many_more_ores_and_crafts.Constants.MOD_ID;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ADAMANTITE_ORE_KEY = registerKey("adamantite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_INFERNAL_ORE_KEY = registerKey("infernal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MYTHRIL_ORE_KEY = registerKey("mythril_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORICHALCUM_ORE_KEY = registerKey("orichalcum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PALLADIUM_ORE_KEY = registerKey("palladium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TUNGSTEM_ORE_KEY = registerKey("tungsten_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldAdamantiteOres = List.of(
                OreConfiguration.target(deepslateReplaceables, ModItems.ADAMANTITE_BLOCKS.get(1).defaultBlockState()));
                //,OreConfiguration.target(deepslateReplaceables, ModItems.TIN_BLOCKS.get(1).get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCobaltOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModItems.COBALT_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherInfernalOres = List.of(
                OreConfiguration.target(netherrackReplaceables, ModItems.INFERNAL_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldLeadOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModItems.LEAD_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldMythrilOres = List.of(
                OreConfiguration.target(deepslateReplaceables, ModItems.MYTHRIL_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldOrichalcumOres = List.of(
                OreConfiguration.target(deepslateReplaceables, ModItems.ORICHALCUM_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldPalladiumOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModItems.PALLADIUM_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModItems.PLATINUM_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModItems.SILVER_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModItems.TIN_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldTitaniumOres = List.of(
                OreConfiguration.target(deepslateReplaceables, ModItems.TITANIUM_BLOCKS.get(1).defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldTungstenOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModItems.TUNGSTEM_BLOCKS.get(1).defaultBlockState()));


        register(context, OVERWORLD_ADAMANTITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAdamantiteOres, 4));
        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, 6));
        register(context, NETHER_INFERNAL_ORE_KEY, Feature.ORE, new OreConfiguration(netherInfernalOres, 8));
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOres, 8));
        register(context, OVERWORLD_MYTHRIL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMythrilOres, 4));
        register(context, OVERWORLD_ORICHALCUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOrichalcumOres, 4));
        register(context, OVERWORLD_PALLADIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPalladiumOres, 6));
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres, 6));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres, 8));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 10));
        register(context, OVERWORLD_TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTitaniumOres, 4));
        register(context, OVERWORLD_TUNGSTEM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTungstenOres, 8));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register
            (BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
