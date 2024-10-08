
package com.graclyxz.manymoreoresandcrafts.item.orichalcumItems;

import net.minecraft.world.item.*;


import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import java.util.List;
import java.util.EnumMap;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;

public class OrichalcumarmorItem extends ArmorItem {
    public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

    public static void registerArmorMaterial(RegisterEvent event) {
        event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
            ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 6);
            }), 15, DeferredHolder.create(Registries.SOUND_EVENT,  ResourceLocation.parse("item.armor.equip_diamond")), () -> Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.ORICHALCUMINGOT.get())),
                    List.of(new ArmorMaterial.Layer( ResourceLocation.parse("many_more_ores_and_crafts:orichalcum"))), 1f, 0.2f);
            registerHelper.register(ResourceLocation.parse("many_more_ores_and_crafts:orichalcumarmor"), armorMaterial);
            ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
        });
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
