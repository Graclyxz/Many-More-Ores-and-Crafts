package com.graclyxz.manymoreoresandcrafts.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;
import static com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems.*;

public enum ModArmorMaterials implements StringRepresentable, ArmorMaterial {

    ADAMANTITE("adamantitearmor", 25, createMap(new int[]{3, 8, 6, 3}),
            15, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.2f, () -> Ingredient.of(ADAMANTITEINGOT)),

    AMETHYST("amethystarmor", 15, createMap(new int[]{1, 5, 3, 2}),
            25, SoundEvents.AMETHYST_BLOCK_RESONATE, 0f, 0f, () -> Ingredient.of(Items.AMETHYST_SHARD)),

    COBALT("cobaltarmor", 25, createMap(new int[]{2, 7, 5, 2}),
            15, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f, () -> Ingredient.of(COBALTINGOT)),

    INFERNAL("infernalarmor", 15, createMap(new int[]{3, 8, 6, 3}),
            25, SoundEvents.ARMOR_EQUIP_NETHERITE, 1f, 0.1f, () -> Ingredient.of(INFERNALINGOT)),

    LEAD("leadarmor", 15, createMap(new int[]{1, 4, 3, 2}),
            15, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(LEADINGOT)),

    MYTHRIL("mythrilarmor", 33, createMap(new int[]{3, 8, 6, 3}),
            25, SoundEvents.ARMOR_EQUIP_LEATHER, 2f, 0.1f, () -> Ingredient.of(MYTHRILINGOT)),

    OBSIDIAN("obsidianarmor", 20, createMap(new int[]{2, 6, 5, 2}),
            25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2f, 0.1f, () -> Ingredient.of(OBSIDIANINGOT)),

    ORICHALCUM("orichalcumarmor", 25, createMap(new int[]{2, 6, 5, 2}),
            15, SoundEvents.ARMOR_EQUIP_DIAMOND, 1f, 0.2f, () -> Ingredient.of(ORICHALCUMINGOT)),

    PALLADIUM("palladiumarmor", 25, createMap(new int[]{2, 7, 5, 2}),
            15, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f, () -> Ingredient.of(PALLADIUMINGOT)),

    PLATINUM("platinumarmor", 20, createMap(new int[]{2, 6, 5, 2}),
            12, SoundEvents.ARMOR_EQUIP_GOLD, 0.2f, 0f, () -> Ingredient.of(PLATINUMINGOT)),

    SILVER("silverarmor", 15, createMap(new int[]{2, 5, 4, 2}),
            12, SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.of(SILVERINGOT)),

    TIN("tinarmor", 15, createMap(new int[]{1, 3, 2, 1}),
            9, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(TININGOT)),

    TITANIUM("titaniumarmor", 33, createMap(new int[]{2, 6, 5, 2}),
            15, SoundEvents.ARMOR_EQUIP_CHAIN, 3f, 0.3f, () -> Ingredient.of(TITANIUMINGOT)),

    TUNGSTEN("tungstenarmor", 15, createMap(new int[]{2, 5, 4, 2}),
            12, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(TUNGSTENINGOT));

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    public static final StringRepresentable.EnumCodec<ModArmorMaterials> CODEC = StringRepresentable.fromEnum(ModArmorMaterials::values);
    private static final EnumMap<Type, Integer> durability = createMap(new int[]{13, 15, 16, 11});
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<Type, Integer> defense;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> ingredient;

    ModArmorMaterials(String name, int durabilityMultiplier, EnumMap<Type, Integer> defense, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> ingredient) {
        this.name = new ResourceLocation(MOD_ID, name).toString();
        this.durabilityMultiplier = durabilityMultiplier;
        this.defense = defense;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.ingredient = ingredient;
    }

    public int getDurabilityForType(Type type) {
        return durability.get(type) * durabilityMultiplier;
    }

    public int getDefenseForType(Type type) {
        return defense.get(type);
    }

    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return sound;
    }

    public Ingredient getRepairIngredient() {
        return ingredient.get();
    }

    public String getName() {
        return name;
    }

    public float getToughness() {
        return toughness;
    }

    public float getKnockbackResistance() {
        return knockbackResistance;
    }

    @Override
    public String getSerializedName() {
        return name;
    }
}