
package net.jinonethreefiveeight.mixedore.item;

import net.jinonethreefiveeight.mixedore.procedures.XiaogProcedure;
import net.jinonethreefiveeight.mixedore.procedures.XgProcedure;
import net.jinonethreefiveeight.mixedore.init.MixedOreModItems;

public class MixedOreSwordItem extends SwordItem {
	public MixedOreSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3750;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 11.2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MixedOreModItems.MIXED_ORE_INGOT.get()));
			}
		}, 3, -2.05f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		XgProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		XiaogProcedure.execute(itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
