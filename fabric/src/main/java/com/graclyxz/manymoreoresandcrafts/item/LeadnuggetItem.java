
package com.graclyxz.manymoreoresandcrafts.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class LeadnuggetItem extends Item {
	public LeadnuggetItem(FabricItemSettings fabricItemSettings) {
		super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}