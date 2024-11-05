
package com.graclyxz.manymoreoresandcrafts.item.tools;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class AmethysthoeItem extends HoeItem {
	public AmethysthoeItem() {
		super(new Tier() {
			public int getUses() {
				return 131;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.AMETHYST_SHARD));
			}
		}, 0, 0f, new Properties());
	}
}
