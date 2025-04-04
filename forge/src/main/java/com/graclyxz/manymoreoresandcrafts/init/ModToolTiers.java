package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModToolTiers implements Tier {

    ADAMANTITE(4, 1561, 9f, 0f, 22, () -> Ingredient.of(ModTags.Items.ADAMANTITE_INGOT)),
    COBALT(2, 1561, 8f, 0f, 15, () -> Ingredient.of(ModTags.Items.COBALT_INGOT)),
    INFERNAL(5, 2031, 9f, 0f, 15, () -> Ingredient.of(ModTags.Items.INFERNAL_INGOT)),
    LEAD(2, 250, 6f, 0f, 14, () -> Ingredient.of(ModTags.Items.LEAD_INGOT)),
    MYTHRIL(5, 2031, 12f, 0f, 24, () -> Ingredient.of(ModTags.Items.MYTHRIL_INGOT)),
    OBSIDIAN(4, 2031, 7f, 0f, 22,() -> Ingredient.of(ModTags.Items.OBSIDIAN_INGOT)),
    ORICHALCUM(4, 1561, 9f, 0f, 22, () -> Ingredient.of(ModTags.Items.ORICHALCUM_INGOT)),
    PALLADIUM(2, 1561, 8f, 0f, 15, () -> Ingredient.of(ModTags.Items.PALLADIUM_INGOT)),
    PLATINUM(2, 300, 8f, 0f, 15, () -> Ingredient.of(ModTags.Items.PLATINUM_INGOT)),
    SILVER(2, 1561, 9f, 0f, 22, () -> Ingredient.of(ModTags.Items.SILVER_INGOT)),
    TIN(1, 130, 4f, 0f, 6, () -> Ingredient.of(ModTags.Items.TIN_INGOT)),
    TITANIUM(5, 2031, 9f, 0f, 10, () -> Ingredient.of(ModTags.Items.TITANIUM_INGOT)),
    TUNGSTEN(1, 300, 8f, 0f, 16, () -> Ingredient.of(ModTags.Items.TUNGSTEN_INGOT)),
    COPPER(2, 150, 6f, 0f, 14, () -> Ingredient.of(ModTags.Items.COPPER)),
    AMETHYST(1, 250, 6f, 0f, 25, () -> Ingredient.of(ModTags.Items.AMETHYST_SHARD)),
    EMERALD(3, 600, 7f, 0f, 9, () -> Ingredient.of(ModTags.Items.EMERALD));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    ModToolTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = ingredient;
    }

    ModToolTiers(Tier tier, int i, float j) {
        this.level = tier.getLevel();
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

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}