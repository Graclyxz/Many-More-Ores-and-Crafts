
package com.graclyxz.manymoreoresandcrafts.item.tools;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class LeadswordItem extends SwordItem {
	public LeadswordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.LEADINGOT));
			}
		}, 3, -2.4f, new Properties());
	}
}
