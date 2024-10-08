
package com.graclyxz.manymoreoresandcrafts.item.obsidianItems;

import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import java.util.List;
import java.util.EnumMap;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class ObsidianarmorItem extends ArmorItem {
	public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

	@SubscribeEvent
	public static void registerArmorMaterial(RegisterEvent event) {
		event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
			ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 2);
				map.put(ArmorItem.Type.LEGGINGS, 5);
				map.put(ArmorItem.Type.CHESTPLATE, 6);
				map.put(ArmorItem.Type.HELMET, 2);
				map.put(ArmorItem.Type.BODY, 6);
			}), 25, DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_diamond")), () -> Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.OBSIDIANINGOT.get())),
					List.of(new ArmorMaterial.Layer(ResourceLocation.parse("many_more_ores_and_crafts:obsidian"))), 2f, 0.1f);
			registerHelper.register(ResourceLocation.parse("many_more_ores_and_crafts:obsidianarmor"), armorMaterial);
			ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
		});
	}

	public ObsidianarmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties.rarity(Rarity.UNCOMMON));
	}

	public static class Helmet extends ObsidianarmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20)).fireResistant());
		}
	}

	public static class Chestplate extends ObsidianarmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20)).fireResistant());
		}
	}

	public static class Leggings extends ObsidianarmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20)).fireResistant());
		}
	}

	public static class Boots extends ObsidianarmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20)).fireResistant());
		}
	}
}
