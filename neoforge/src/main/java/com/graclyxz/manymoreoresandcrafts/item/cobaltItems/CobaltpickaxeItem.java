
package com.graclyxz.manymoreoresandcrafts.item.cobaltItems;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;

public class CobaltpickaxeItem extends PickaxeItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 1561;
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
			return BlockTags.INCORRECT_FOR_IRON_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 15;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.COBALTINGOT.get()));
		}
	};

	public CobaltpickaxeItem() {
		super(TOOL_TIER, new Item.Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 3f, -2.8f)).rarity(Rarity.UNCOMMON));
	}
}
