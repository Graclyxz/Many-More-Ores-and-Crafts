package com.graclyxz.manymoreoresandcrafts.init;

import com.graclyxz.manymoreoresandcrafts.util.ModTags;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;

public class ModMaterials {

    public static final DeferredRegister<ArmorMaterial> MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, MOD_ID);

    public static final Holder<ArmorMaterial> ADAMANTITE = register("adamantite", createMap(new int[]{3, 8, 6, 3, 8}),
            22, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ModTags.Items.ADAMANTITE_INGOT));

    public static final Holder<ArmorMaterial> COBALT = register("cobalt", createMap(new int[]{2, 7, 5, 2, 7}),
            15, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f, () -> Ingredient.of(ModTags.Items.COBALT_INGOT));

    public static final Holder<ArmorMaterial> INFERNAL = register("infernal", createMap(new int[]{3, 8, 6, 3, 8}),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE, 1f, 0.2f, () -> Ingredient.of(ModTags.Items.INFERNAL_INGOT));

    public static final Holder<ArmorMaterial> LEAD = register("lead", createMap(new int[]{2, 4, 3, 1, 4}),
            14, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModTags.Items.LEAD_INGOT));

    public static final Holder<ArmorMaterial> MYTHRIL = register("mythril", createMap(new int[]{2, 7, 5, 2, 7}),
            24, SoundEvents.ARMOR_EQUIP_NETHERITE, 2f, 0.1f, () -> Ingredient.of(ModTags.Items.MYTHRIL_INGOT));

    public static final Holder<ArmorMaterial> OBSIDIAN = register("obsidian", createMap(new int[]{2, 6, 5, 2, 6}),
            22, SoundEvents.ARMOR_EQUIP_NETHERITE, 2f, 0.4f, () -> Ingredient.of(ModTags.Items.OBSIDIAN_INGOT));

    public static final Holder<ArmorMaterial> ORICHALCUM = register("orichalcum", createMap(new int[]{2, 6, 5, 2, 6}),
            22, SoundEvents.ARMOR_EQUIP_DIAMOND, 1f, 0.2f, () -> Ingredient.of(ModTags.Items.ORICHALCUM_INGOT));

    public static final Holder<ArmorMaterial> PALLADIUM = register("palladium", createMap(new int[]{2, 7, 5, 2, 7}),
            25, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0f, () -> Ingredient.of(ModTags.Items.PALLADIUM_INGOT));

    public static final Holder<ArmorMaterial> PLATINUM = register("platinum", createMap(new int[]{2, 6, 5, 2, 6}),
            15, SoundEvents.ARMOR_EQUIP_GOLD, 0.2f, 0f,() -> Ingredient.of(ModTags.Items.PLATINUM_INGOT));

    public static final Holder<ArmorMaterial> SILVER = register("silver", createMap(new int[]{2, 5, 4, 2, 5}),
            16, SoundEvents.ARMOR_EQUIP_CHAIN, 0f, 0f, () -> Ingredient.of(ModTags.Items.SILVER_INGOT));

    public static final Holder<ArmorMaterial> TIN = register("tin", createMap(new int[]{2, 3, 2, 1, 3}),
            6, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModTags.Items.TIN_INGOT));

    public static final Holder<ArmorMaterial> TITANIUM = register("titanium", createMap(new int[]{2, 6, 5, 2, 8}),
            14, SoundEvents.ARMOR_EQUIP_TURTLE, 3f, 0.2f, () -> Ingredient.of(ModTags.Items.TITANIUM_INGOT));

    public static final Holder<ArmorMaterial> TUNGSTEM = register("tungsten", createMap(new int[]{2, 5, 4, 2, 5}),
            16, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModTags.Items.TUNGSTEM_INGOT));

    public static final Holder<ArmorMaterial> COPPER = register("copper", createMap(new int[]{2, 3, 2, 1, 3}),
            6, Holder.direct(SoundEvents.COPPER_HIT), 0f, 0f, () -> Ingredient.of(ModTags.Items.COPPER));

    public static final Holder<ArmorMaterial> AMETHYST = register("amethyst", createMap(new int[]{2, 4, 3, 2, 4}),
            25, Holder.direct(SoundEvents.AMETHYST_BLOCK_RESONATE), 0f, 0f, () -> Ingredient.of(ModTags.Items.AMETHYST_SHARD));

    public static final Holder<ArmorMaterial> EMERALD = register("emerald", createMap(new int[]{3, 6, 5, 3, 4}),
            9, SoundEvents.ARMOR_EQUIP_GENERIC, 0f, 0f, () -> Ingredient.of(ModTags.Items.EMERALD));

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
        return MATERIALS.register(name, () -> new ArmorMaterial(defense, i, holder, supplier,
                List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MOD_ID, name))), f, g));
    }

    public static void init(IEventBus bus) {
        MATERIALS.register(bus);
    }
}