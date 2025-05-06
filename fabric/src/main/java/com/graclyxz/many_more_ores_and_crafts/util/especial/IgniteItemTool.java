package com.graclyxz.many_more_ores_and_crafts.util.especial;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;

public class IgniteItemTool extends Item {

    public IgniteItemTool(Properties properties) {
        super(properties);
    }

    @Override
    public void hurtEnemy(ItemStack itemStack, LivingEntity livingEntity, LivingEntity livingEntity2) {
        livingEntity.igniteForSeconds(5);
        super.hurtEnemy(itemStack, livingEntity, livingEntity2);
    }
}