
package com.graclyxz.manymoreoresandcrafts.item.infernalItems;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class InfernalnuggetItem extends Item {
	public InfernalnuggetItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
