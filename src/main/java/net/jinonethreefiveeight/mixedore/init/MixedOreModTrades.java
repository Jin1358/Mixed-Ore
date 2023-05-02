
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.jinonethreefiveeight.mixedore.init;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MixedOreModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.DIAMOND, 20), new ItemStack(Items.EMERALD, 33), new ItemStack(MixedOreModItems.MIXED_ORE_INGOT.get(), 3), 5, 9, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MixedOreModItems.MIXED_ORE_INGOT.get(), 2),

					new ItemStack(Items.NETHERITE_INGOT, 4), 8, 7, 0.05f));
		}
	}
}
