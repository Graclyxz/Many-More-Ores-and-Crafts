
package com.graclyxz.manymoreoresandcrafts.item.tungstenItems;


import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import java.util.List;
import java.util.EnumMap;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;

public class TungstenarmorItem extends ArmorItem {
    public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

    public static void registerArmorMaterial(RegisterEvent event) {
        event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
            ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 5);
            }), 12, DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_iron")), () -> Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.TUNGSTENINGOT.get())),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.parse("many_more_ores_and_crafts:tungsten"))), 0f, 0f);
            registerHelper.register(ResourceLocation.parse("many_more_ores_and_crafts:tungstenarmor"), armorMaterial);
            ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
        });
    }

    public TungstenarmorItem(ArmorItem.Type type, Item.Properties properties) {
        super(ARMOR_MATERIAL, type, properties);
    }

    public static class Helmet extends TungstenarmorItem {
        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15)));
        }
    }

    public static class Chestplate extends TungstenarmorItem {
        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15)));
        }
    }

    public static class Leggings extends TungstenarmorItem {
        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)));
        }
    }

    public static class Boots extends TungstenarmorItem {
        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15)));
        }
    }
}
