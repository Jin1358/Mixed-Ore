package net.jinonethreefiveeight.mixedore.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.jinonethreefiveeight.mixedore.init.MixedOreModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Add1Procedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel && _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("mixed_ore:dust_collector"))).isDone())) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.COAL_DUST.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.COPPER_DUST.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.IRON_DUST.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.GOLD_DUST.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.DIAMOND_DUST.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.LAPIS_DUST.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.RED_STONE_DUST.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.EMERALD_DUST.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.NETHERITE_DUST.get())) : false)) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("mixed_ore:dust_collector"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
		if (!(entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel && _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("mixed_ore:mixed_oretools"))).isDone())) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_OREA_HELMET.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_OREA_CHESTPLATE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_OREA_LEGGINGS.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_OREA_BOOTS.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_SWORD.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_PICK_AXE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_AXE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_SHOVEL.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXEDOREHOE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_BOW.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_SHOVEL.get())) : false)) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("mixed_ore:mixed_oretools"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
		if (!(entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel && _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("mixed_ore:mixedoremaster"))).isDone())) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_SWORD.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_PICK_AXE.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_AXE.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_SHOVEL.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXEDOREHOE.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_ORE_BOW.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_OREA_HELMET.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_OREA_CHESTPLATE.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_OREA_LEGGINGS.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MixedOreModItems.MIXED_OREA_BOOTS.get())) : false)) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("mixed_ore:mixedoremaster"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}
