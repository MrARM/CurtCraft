package org.ncapsdev.curtcraft;

import org.ncapsdev.curtcraft.entities.EntityCurt;
import org.ncapsdev.curtcraft.items.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid="curtcraft", version="1.0", name="CurtCraft", acceptedMinecraftVersions="[1.7.10]")
public class curtcraft
{
public static String MODID = "curtcraft";
public static String VERSION = "1.0";

@EventHandler
public void preInit(FMLPreInitializationEvent e)
{
	//Curt's Jamz
	CurtDisc.mainRegistry();
	//The Curt Himself
	 EntityRegistry.registerModEntity(EntityCurt.class, "Curt_Kelly", 420, this, 50, 3, true);
}

@EventHandler
public void init(FMLInitializationEvent e)
{
}

@EventHandler
public void postInit(FMLPostInitializationEvent e)
{
}
}