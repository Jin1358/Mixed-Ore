
package net.jinonethreefiveeight.mixedore.item;

import net.minecraft.sounds.SoundEvent;

import net.jinonethreefiveeight.mixedore.procedures.Xg5Procedure;
import net.jinonethreefiveeight.mixedore.procedures.Xg4Procedure;
import net.jinonethreefiveeight.mixedore.procedures.Xg3Procedure;
import net.jinonethreefiveeight.mixedore.init.MixedOreModBlocks;

public abstract class MixedOreaItem extends ArmorItem {
	public MixedOreaItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 43;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{6, 7, 12, 8}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 19;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MixedOreModBlocks.MIXED_ORE_BLOCK.get()));
			}

			@Override
			public String getName() {
				return "mixed_orea";
			}

			@Override
			public float getToughness() {
				return 3.6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.34f;
			}
		}, type, properties);
	}

	public static class Helmet extends MixedOreaItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mixed_ore:textures/models/armor/mixed_ore__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Xg3Procedure.execute(entity);
		}
	}

	public static class Chestplate extends MixedOreaItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mixed_ore:textures/models/armor/mixed_ore__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Xg4Procedure.execute(entity);
		}
	}

	public static class Leggings extends MixedOreaItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mixed_ore:textures/models/armor/mixed_ore__layer_2.png";
		}
	}

	public static class Boots extends MixedOreaItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mixed_ore:textures/models/armor/mixed_ore__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Xg5Procedure.execute(entity);
		}
	}
}
