
package com.graclyxz.manymoreoresandcrafts.item.orichalcumItems;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;
import net.minecraft.world.level.block.Block;


public class OrichlcumswordItem extends SwordItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 1561;
		}

		@Override
		public float getSpeed() {
			return 9f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 22;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.ORICHALCUMINGOT.get()));
		}
	};

	public OrichlcumswordItem() {
		super(TOOL_TIER, new Item.Properties().attributes(SwordItem.createAttributes(TOOL_TIER, 5, -3f)).rarity(Rarity.RARE));
	}
}

