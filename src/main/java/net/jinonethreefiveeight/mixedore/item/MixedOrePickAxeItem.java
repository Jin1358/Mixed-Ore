
package net.jinonethreefiveeight.mixedore.item;

import net.jinonethreefiveeight.mixedore.procedures.Xiaog2Procedure;
import net.jinonethreefiveeight.mixedore.init.MixedOreModItems;

public class MixedOrePickAxeItem extends PickaxeItem {
	public MixedOrePickAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3450;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 7.5f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MixedOreModItems.MIXED_ORE_INGOT.get()));
			}
		}, 1, -2.35f, new Item.Properties().fireResistant());
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
