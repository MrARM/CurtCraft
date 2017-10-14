package org.ncapsdev.curtcraft.items;

import org.ncapsdev.curtcraft.util.EntityMonsterPlacer;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CurtEgg {
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
			public static Item curt_egg;
			

			public static void initializeItem() {
				
				 curt_egg = new EntityMonsterPlacer("Curt_Kelly", 0x000000, 0xFFFFFF)
						.setUnlocalizedName ("curt_egg")
						.setTextureName("curtcraft:curtegg");
						

			}

			public static void registerItem() {
				GameRegistry.registerItem(curt_egg, "curtegg");
				
			}
}
