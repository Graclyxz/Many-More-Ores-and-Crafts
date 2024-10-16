
package com.graclyxz.manymoreoresandcrafts.item.mythrilItems;

import net.minecraft.core.Registry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import java.util.List;
import java.util.EnumMap;
import java.util.function.Supplier;

import static com.graclyxz.manymoreoresandcrafts.Constants.MOD_ID;
import static com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems.MYTHRILINGOT;

public class MythrilarmorItem extends ArmorItem {

    public static final Holder<ArmorMaterial> ARMOR_MATERIAL = register("mythril", Util.make(new EnumMap<>(ArmorItem.Type.class),
                    attribute -> {
                        attribute.put(ArmorItem.Type.BOOTS, 3);
                        attribute.put(ArmorItem.Type.LEGGINGS, 6);
                        attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                        attribute.put(ArmorItem.Type.HELMET, 3);
                        attribute.put(ArmorItem.Type.BODY, 8);
                    }), 25, 2f, 0.1f,
            () -> MYTHRILINGOT.get()
    );

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_LEATHER;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }

    public MythrilarmorItem(ArmorItem.Type type, Item.Properties properties) {
        super(ARMOR_MATERIAL, type, properties.rarity(Rarity.EPIC));
    }

    public static class Helmet extends MythrilarmorItem {
        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(33)));
        }
    }

    public static class Chestplate extends MythrilarmorItem {
        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(33)));
        }
    }

    public static class Leggings extends MythrilarmorItem {
        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(33)));
        }
    }

    public static class Boots extends MythrilarmorItem {
        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(33)));
        }
    }
}
