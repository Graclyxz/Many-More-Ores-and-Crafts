package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum ModTiers implements Tier {
    ADAMANTITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 9f, 0f, 22, () -> Ingredient.of(ModTags.Items.ADAMANTITE_INGOT)),
    COBALT(BlockTags.INCORRECT_FOR_IRON_TOOL, 1561, 8f, 0f, 15, () -> Ingredient.of(ModTags.Items.COBALT_INGOT)),
    INFERNAL(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 9f, 0f, 15, () -> Ingredient.of(ModTags.Items.INFERNAL_INGOT)),
    LEAD(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6f, 0f, 14, () -> Ingredient.of(ModTags.Items.LEAD_INGOT)),
    MYTHRIL(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 12f, 0f, 24, () -> Ingredient.of(ModTags.Items.MYTHRIL_INGOT)),
    OBSIDIAN(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2031, 7f, 0f, 22,() -> Ingredient.of(ModTags.Items.OBSIDIAN_INGOT)),
    ORICHALCUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 9f, 0f, 22, () -> Ingredient.of(ModTags.Items.ORICHALCUM_INGOT)),
    PALLADIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 1561, 8f, 0f, 15, () -> Ingredient.of(ModTags.Items.PALLADIUM_INGOT)),
    PLATINUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 8f, 0f, 15, () -> Ingredient.of(ModTags.Items.PLATINUM_INGOT)),
    SILVER(BlockTags.INCORRECT_FOR_IRON_TOOL, 1561, 9f, 0f, 22, () -> Ingredient.of(ModTags.Items.SILVER_INGOT)),
    TIN(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4f, 0f, 6, () -> Ingredient.of(ModTags.Items.TIN_INGOT)),
    TITANIUM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 9f, 0f, 10, () -> Ingredient.of(ModTags.Items.TITANIUM_INGOT)),
    TUNGSTEM(BlockTags.INCORRECT_FOR_STONE_TOOL, 300, 8f, 0f, 16, () -> Ingredient.of(ModTags.Items.TUNGSTEM_INGOT)),
    COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6f, 0f, 14, () -> Ingredient.of(ModTags.Items.COPPER)),
    AMETHYST(BlockTags.INCORRECT_FOR_STONE_TOOL, 250, 6f, 0f, 25, () -> Ingredient.of(ModTags.Items.AMETHYST_SHARD)),
    EMERALD(BlockTags.INCORRECT_FOR_GOLD_TOOL, 600, 7f, 0f, 9, () -> Ingredient.of(ModTags.Items.EMERALD));

    private final TagKey<Block> incorrect;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    ModTiers(TagKey<Block> incorrect, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.incorrect = incorrect;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = ingredient;
    }

    ModTiers(Tier tier, int i, float j) {
        this.incorrect = tier.getIncorrectBlocksForDrops();
        this.uses = tier.getUses() * i;
        this.speed = tier.getSpeed() + j;
        this.damage = tier.getAttackDamageBonus();
        this.enchantmentValue = tier.getEnchantmentValue();
        this.ingredient = tier::getRepairIngredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrect;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}