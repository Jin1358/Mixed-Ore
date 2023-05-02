
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jinonethreefiveeight.mixedore.init;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MixedOreModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MixedOreModEntities.MIXED_ORE_BOW.get(), ThrownItemRenderer::new);
	}
}
