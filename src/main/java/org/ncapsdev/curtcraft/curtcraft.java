package org.ncapsdev.curtcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="curtcraft", version="1.0", name="CurtCraft", acceptedMinecraftVersions="[1.8]")
public class curtcraft {
	public static String MODID = "modid";
	public static String VERSION = "version";

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	}
}
