
package com.graclyxz.manymoreoresandcrafts.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class InfernalnuggetItem extends Item {
	public InfernalnuggetItem(FabricItemSettings fabricItemSettings) {
		super(new Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
