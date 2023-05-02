
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jinonethreefiveeight.mixedore.init;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MixedOreModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("mixed_ore", "mixed_ore_t"),
				builder -> builder.title(Component.translatable("item_group.mixed_ore.mixed_ore_t")).icon(() -> new ItemStack(MixedOreModItems.MIXED_ORE_INGOT.get())).displayItems((parameters, tabData) -> {
					tabData.accept(MixedOreModItems.COAL_DUST.get());
					tabData.accept(MixedOreModItems.COPPER_DUST.get());
					tabData.accept(MixedOreModItems.IRON_DUST.get());
					tabData.accept(MixedOreModItems.GOLD_DUST.get());
					tabData.accept(MixedOreModItems.DIAMOND_DUST.get());
					tabData.accept(MixedOreModItems.RED_STONE_DUST.get());
					tabData.accept(MixedOreModItems.LAPIS_DUST.get());
					tabData.accept(MixedOreModItems.EMERALD_DUST.get());
					tabData.accept(MixedOreModItems.NETHERITE_DUST.get());
					tabData.accept(MixedOreModItems.MEATDUST.get());
					tabData.accept(MixedOreModItems.MIXED_ORE_INGOT.get());
					tabData.accept(MixedOreModBlocks.MIXED_ORE.get().asItem());
					tabData.accept(MixedOreModBlocks.DEEPSLATE_MIXED_ORE.get().asItem());
					tabData.accept(MixedOreModBlocks.MIXED_ORE_BLOCK.get().asItem());
					tabData.accept(MixedOreModBlocks.ORE_CRUSHER.get().asItem());
					tabData.accept(MixedOreModItems.MIXED_OREA_HELMET.get());
					tabData.accept(MixedOreModItems.MIXED_OREA_CHESTPLATE.get());
					tabData.accept(MixedOreModItems.MIXED_OREA_LEGGINGS.get());
					tabData.accept(MixedOreModItems.MIXED_OREA_BOOTS.get());
					tabData.accept(MixedOreModItems.MIXED_ORE_SWORD.get());
					tabData.accept(MixedOreModItems.MIXED_ORE_PICK_AXE.get());
					tabData.accept(MixedOreModItems.MIXED_ORE_AXE.get());
					tabData.accept(MixedOreModItems.MIXED_ORE_SHOVEL.get());
					tabData.accept(MixedOreModItems.MIXEDOREHOE.get());
					tabData.accept(MixedOreModItems.MIXED_ORE_BOW.get());
					tabData.accept(MixedOreModItems.MIXED_ORE_MEAT_INGOT.get());
				})

		);
	}
}
