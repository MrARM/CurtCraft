package org.ncapsdev.curtcraft.items;



import org.ncapsdev.curtcraft.util.MusicDisc;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CurtDisc {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}

	public static Item record_curtphone;
	

	public static void initializeItem() {
		
		// records
		record_curtphone = new MusicDisc("curtphone").setUnlocalizedName("curtphone").setCreativeTab(CreativeTabs.tabMisc);

	}

	public static void registerItem() {
		GameRegistry.registerItem(record_curtphone, "curtphone");
		
	}
}
