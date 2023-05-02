
package net.jinonethreefiveeight.mixedore.item;

public class MeatdustItem extends Item {
	public MeatdustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(7).saturationMod(0.5f).alwaysEat().meat().build()));
	}
}
