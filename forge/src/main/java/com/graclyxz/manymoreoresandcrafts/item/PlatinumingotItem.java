
package com.graclyxz.manymoreoresandcrafts.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlatinumingotItem extends Item {
	public PlatinumingotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}