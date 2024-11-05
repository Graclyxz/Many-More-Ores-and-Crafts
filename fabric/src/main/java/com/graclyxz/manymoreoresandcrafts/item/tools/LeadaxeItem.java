
package com.graclyxz.manymoreoresandcrafts.item.tools;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class LeadaxeItem extends AxeItem {
	public LeadaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.LEADINGOT));
			}
		}, 1, -3.1f, new Properties());
	}
}
