
package com.graclyxz.manymoreoresandcrafts.item.adamantiteItems;

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
public abstract class AdamantitearmorItem extends ArmorItem {
	public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

	@SubscribeEvent
	public static void registerArmorMaterial(RegisterEvent event) {
		event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
			ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 3);
				map.put(ArmorItem.Type.LEGGINGS, 6);
				map.put(ArmorItem.Type.CHESTPLATE, 8);
				map.put(ArmorItem.Type.HELMET, 3);
				map.put(ArmorItem.Type.BODY, 8);
			}), 15, DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_iron")), () -> Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.ADAMANTITEINGOT.get())),
					List.of(new ArmorMaterial.Layer(ResourceLocation.parse("many_more_ores_and_crafts:adamantite"))), 1f, 0.2f);
			registerHelper.register(ResourceLocation.parse("many_more_ores_and_crafts:adamantitearmor"), armorMaterial);
			ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
		});
	}

	public AdamantitearmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties.rarity(Rarity.RARE));
	}

	public static class Helmet extends AdamantitearmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25)));
		}
	}

	public static class Chestplate extends AdamantitearmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25)));
		}
	}

	public static class Leggings extends AdamantitearmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25)));
		}
	}

	public static class Boots extends AdamantitearmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25)));
		}
	}
}
