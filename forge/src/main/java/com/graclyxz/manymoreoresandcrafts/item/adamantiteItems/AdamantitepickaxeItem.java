
package com.graclyxz.manymoreoresandcrafts.item.adamantiteItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;

public class AdamantitepickaxeItem extends PickaxeItem {
	public AdamantitepickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.ADAMANTITEINGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
