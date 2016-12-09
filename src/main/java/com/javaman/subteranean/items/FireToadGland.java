package com.javaman.subteranean.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class FireToadGland extends ItemFood {
	
public FireToadGland(int hunger, float sat, boolean isWolffood) {
		super(hunger, sat, isWolffood);
		
		this.setUnlocalizedName("FireToadGland");
		
		 this.setMaxDamage(384);
		 //
		 this.setMaxStackSize(64);
		 
		 this.setCreativeTab(CreativeTabs.tabMisc);
		 setPotionEffect(12, 5,1 , 1.0f);
	}



	

}
