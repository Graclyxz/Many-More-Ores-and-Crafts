
package com.graclyxz.manymoreoresandcrafts.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawinfernalItem extends Item {
	public RawinfernalItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
