
package net.jinonethreefiveeight.mixedore.item;

import net.jinonethreefiveeight.mixedore.procedures.Xiaog2Procedure;
import net.jinonethreefiveeight.mixedore.init.MixedOreModItems;

public class MixedOreShovelItem extends ShovelItem {
	public MixedOreShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 3840;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 6.5f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MixedOreModItems.MIXED_ORE_INGOT.get()));
			}
		}, 1, -2f, new Item.Properties().fireResistant());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Xiaog2Procedure.execute(itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
