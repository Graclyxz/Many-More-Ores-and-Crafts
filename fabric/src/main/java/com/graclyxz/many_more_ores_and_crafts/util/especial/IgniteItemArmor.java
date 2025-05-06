package com.graclyxz.many_more_ores_and_crafts.util.especial;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class IgniteItemArmor extends Item {

    public IgniteItemArmor(Properties properties) {
        super(properties);
    }

    @Override
    public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target != null) {
            target.igniteForSeconds(1);
        }
        super.hurtEnemy(stack, target, attacker);
    }
}