
package com.graclyxz.manymoreoresandcrafts.item.orichalcumItems;

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
import static com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems.ORICHALCUMINGOT;

public class OrichalcumarmorItem extends ArmorItem {

    public static final Holder<ArmorMaterial> ARMOR_MATERIAL = register("orichalcum", Util.make(new EnumMap<>(ArmorItem.Type.class),
                    attribute -> {
                        attribute.put(ArmorItem.Type.BOOTS, 2);
                        attribute.put(ArmorItem.Type.LEGGINGS, 5);
                        attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                        attribute.put(ArmorItem.Type.HELMET, 2);
                        attribute.put(ArmorItem.Type.BODY, 6);
                    }), 15, 1f, 0.2f,
            () -> ORICHALCUMINGOT.get()
    );

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_DIAMOND;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }

    public OrichalcumarmorItem(ArmorItem.Type type, Item.Properties properties) {
        super(ARMOR_MATERIAL, type, properties.rarity(Rarity.RARE));
    }

    public static class Helmet extends OrichalcumarmorItem {
        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25)));
        }
    }

    public static class Chestplate extends OrichalcumarmorItem {
        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25)));
        }
    }

    public static class Leggings extends OrichalcumarmorItem {
        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25)));
        }
    }

    public static class Boots extends OrichalcumarmorItem {
        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25)));
        }
    }
}
