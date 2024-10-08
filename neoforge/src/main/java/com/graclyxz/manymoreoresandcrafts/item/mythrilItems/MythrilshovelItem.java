
package com.graclyxz.manymoreoresandcrafts.item.mythrilItems;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;

public class MythrilshovelItem extends ShovelItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 2031;
		}

		@Override
		public float getSpeed() {
			return 12f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 22;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.MYTHRILINGOT.get()));
		}
	};

	public MythrilshovelItem() {
		super(TOOL_TIER, new Item.Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 5.5f, -3f)).rarity(Rarity.EPIC));
	}
}
