package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public enum ModArmorMaterials implements StringRepresentable, ArmorMaterial {

    ADAMANTITE("adamantite", 20, createMap(new int[]{3, 8, 6, 3}),
            22, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f,
            () -> Ingredient.of(ModTags.Items.ADAMANTITE_INGOT)),

    COBALT("cobalt", 20, createMap(new int[]{2, 7, 5, 2}),
            15, SoundEvents.ARMOR_EQUIP_GOLD, 0.5f, 0f,
            () -> Ingredient.of(ModTags.Items.COBALT_INGOT)),

    INFERNAL("infernal", 25, createMap(new int[]{3, 8, 6, 3}),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE,  1f, 0.2f,
            () -> Ingredient.of(ModTags.Items.INFERNAL_INGOT)),

    LEAD("lead", 15, createMap(new int[]{2, 4, 3, 1}),
            14, SoundEvents.ARMOR_EQUIP_IRON,  0f, 0f,
            () -> Ingredient.of(ModTags.Items.LEAD_INGOT)),

    MYTHRIL("mythril", 32, createMap(new int[]{4, 8, 6, 2}),
            24, SoundEvents.ARMOR_EQUIP_NETHERITE,  2f, 0.1f,
            () -> Ingredient.of(ModTags.Items.MYTHRIL_INGOT)),

    OBSIDIAN("obsidian", 18, createMap(new int[]{2, 6, 5, 2}),
            22, SoundEvents.ARMOR_EQUIP_ELYTRA,   2f, 0.4f,
            () -> Ingredient.of(ModTags.Items.OBSIDIAN_INGOT)),

    ORICHALCUM("orichalcum", 25, createMap(new int[]{2, 6, 5, 2}),
            22, SoundEvents.ARMOR_EQUIP_DIAMOND,  1f, 0.2f,
            () -> Ingredient.of(ModTags.Items.ORICHALCUM_INGOT)),

    PALLADIUM("palladium", 25, createMap(new int[]{2, 7, 5, 2}),
            15, SoundEvents.ARMOR_EQUIP_IRON,  0.5f, 0f,
            () -> Ingredient.of(ModTags.Items.PALLADIUM_INGOT)),

    PLATINUM("platinum", 20, createMap(new int[]{2, 6, 5, 2}),
            15, SoundEvents.ARMOR_EQUIP_GOLD,  0.2f, 0f,
            () -> Ingredient.of(ModTags.Items.PLATINUM_INGOT)),

    SILVER("silver", 18, createMap(new int[]{2, 5, 4, 2}),
            16, SoundEvents.ARMOR_EQUIP_GOLD,  0f, 0f,
            () -> Ingredient.of(ModTags.Items.SILVER_INGOT)),

    TIN("tin", 15, createMap(new int[]{2, 3, 2, 1}),
            6, SoundEvents.ARMOR_EQUIP_GENERIC,  0f, 0f,
            () -> Ingredient.of(ModTags.Items.TIN_INGOT)),

    TITANIUM("titanium", 34, createMap(new int[]{2, 6, 5, 2}),
            14, SoundEvents.ARMOR_EQUIP_TURTLE,   3f, 0.2f,
            () -> Ingredient.of(ModTags.Items.TITANIUM_INGOT)),

    TUNGSTEN("tungsten", 18, createMap(new int[]{2, 5, 4, 2}),
            16, SoundEvents.ARMOR_EQUIP_IRON,  0f, 0f,
            () -> Ingredient.of(ModTags.Items.TUNGSTEN_INGOT)),

    COPPER("copper", 10, createMap(new int[]{2, 3, 2, 1}),
            6, SoundEvents.COPPER_HIT,  0f, 0f,
            () -> Ingredient.of(ModTags.Items.COPPER)),

    AMETHYST("amethyst", 16, createMap(new int[]{2, 4, 3, 2}),
            25, SoundEvents.AMETHYST_BLOCK_RESONATE,  0f, 0f,
            () -> Ingredient.of(ModTags.Items.AMETHYST_SHARD)),

    EMERALD ("emerald", 15, createMap(new int[]{3, 6, 5, 3}),
            9, SoundEvents.ARMOR_EQUIP_GENERIC,  0f, 0f,
            () -> Ingredient.of(ModTags.Items.EMERALD));

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    public static final EnumCodec<ModArmorMaterials> CODEC = StringRepresentable.fromEnum(ModArmorMaterials::values);
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

    public String getSerializedName() {
        return name;
    }
}