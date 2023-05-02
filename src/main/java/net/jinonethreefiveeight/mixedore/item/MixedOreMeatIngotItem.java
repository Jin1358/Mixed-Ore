
package net.jinonethreefiveeight.mixedore.item;

public class MixedOreMeatIngotItem extends Item {
	public MixedOreMeatIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(40).saturationMod(2f).meat().build()));
	}
}
