
package com.graclyxz.manymoreoresandcrafts.item.orichalcumItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.graclyxz.manymoreoresandcrafts.init.ManyMoreOresAndCraftsModItems;

/*public abstract class OrichalcumarmorItem extends ArmorItem {
	public OrichalcumarmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 25;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{2, 5, 6, 2}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ManyMoreOresAndCraftsModItems.ORICHALCUMINGOT.get()));
			}

			@Override
			public String getName() {
				return "orichalcumarmor";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, type, properties);
	}

	public static class Helmet extends OrichalcumarmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "many_more_ores_and_crafts:textures/models/armor/orichalcum_layer_1.png";
		}
	}

	public static class Chestplate extends OrichalcumarmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "many_more_ores_and_crafts:textures/models/armor/orichalcum_layer_1.png";
		}
	}

	public static class Leggings extends OrichalcumarmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "many_more_ores_and_crafts:textures/models/armor/orichalcum_layer_2.png";
		}
	}

	public static class Boots extends OrichalcumarmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "many_more_ores_and_crafts:textures/models/armor/orichalcum_layer_1.png";
		}
	}
}
*/