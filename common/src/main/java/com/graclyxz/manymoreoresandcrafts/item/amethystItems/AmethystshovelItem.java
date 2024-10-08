
package com.graclyxz.manymoreoresandcrafts.item.amethystItems;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class AmethystshovelItem extends ShovelItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 131;
		}

		@Override
		public float getSpeed() {
			return 8f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_STONE_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 22;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(Items.AMETHYST_SHARD));
		}
	};

	public AmethystshovelItem() {
		super(TOOL_TIER, new Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 2.5f, -3f)));
	}
}
