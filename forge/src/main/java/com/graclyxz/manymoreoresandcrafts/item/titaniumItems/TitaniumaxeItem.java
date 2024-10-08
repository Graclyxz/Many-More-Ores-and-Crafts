
package com.graclyxz.manymoreoresandcrafts.item.titaniumItems;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;
import net.minecraft.world.level.block.Block;

public class TitaniumaxeItem extends AxeItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 2031;
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
			return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 10;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.TITANIUMINGOT.get()));
		}
	};

	public TitaniumaxeItem() {
		super(TOOL_TIER, new Item.Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 8f, -3f)).rarity(Rarity.EPIC));
	}
}

