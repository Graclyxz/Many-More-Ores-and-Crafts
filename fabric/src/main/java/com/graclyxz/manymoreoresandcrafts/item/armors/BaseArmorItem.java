package com.graclyxz.manymoreoresandcrafts.item.armors;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class BaseArmorItem extends ArmorItem {
    public BaseArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties.durability(material.getDurabilityForType(type)));
    }
}