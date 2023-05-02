
package net.jinonethreefiveeight.mixedore.item;

import net.jinonethreefiveeight.mixedore.procedures.Xiaog3Procedure;
import net.jinonethreefiveeight.mixedore.procedures.Xg2Procedure;
import net.jinonethreefiveeight.mixedore.init.MixedOreModItems;

public class MixedOreAxeItem extends AxeItem {
	public MixedOreAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3340;
			}

			public float getSpeed() {
				return 14.5f;
			}

			public float getAttackDamageBonus() {
				return 15.6f;
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
		}, 1, -2.31f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Xg2Procedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Xiaog3Procedure.execute(itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
