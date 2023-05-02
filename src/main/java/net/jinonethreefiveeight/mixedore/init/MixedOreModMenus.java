
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.jinonethreefiveeight.mixedore.init;

import net.jinonethreefiveeight.mixedore.world.inventory.OrecMenu;
import net.jinonethreefiveeight.mixedore.MixedOreMod;

public class MixedOreModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MixedOreMod.MODID);
	public static final RegistryObject<MenuType<OrecMenu>> OREC = REGISTRY.register("orec", () -> IForgeMenuType.create(OrecMenu::new));
}
