package com.javaman.subteranean.items;

import com.javaman.subterranean.SubterraneanCreaturesMod;


import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemGroup;

public class FireToadGland extends ItemFood {
	private static int hunger = 10;
	private static float sat = 10f;
	private static boolean isWolffood = true;
public FireToadGland() {
	
		super(hunger, sat, isWolffood, new Properties().group(ItemGroup.FOOD));
		
		
		this.setRegistryName(SubterraneanCreaturesMod.MODID+":"+"fire_toad_gland");
		
		 
	}



	

}
