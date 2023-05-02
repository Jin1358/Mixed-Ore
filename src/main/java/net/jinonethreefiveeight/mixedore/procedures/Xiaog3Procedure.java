package net.jinonethreefiveeight.mixedore.procedures;

public class Xiaog3Procedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)) {
			itemstack.enchant(Enchantments.BLOCK_FORTUNE, (int) 3.09);
		} else if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, itemstack) != 0)) {
			itemstack.enchant(Enchantments.KNOCKBACK, (int) 4.01);
		}
	}
}
