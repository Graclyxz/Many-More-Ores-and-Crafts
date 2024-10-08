
package com.graclyxz.manymoreoresandcrafts.item.obsidianItems;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ObsidiannuggetItem extends Item {
	public ObsidiannuggetItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
