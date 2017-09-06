package com.javaman.subteranean.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class FireToadGland extends ItemFood {
	
public FireToadGland(int hunger, float sat, boolean isWolffood) {
		super(hunger, sat, isWolffood);
		
		this.setUnlocalizedName("FireToadGland");
		
		 this.setMaxDamage(384);
		 //
		 this.setMaxStackSize(64);
		 
		 this.setCreativeTab(CreativeTabs.MISC);
		 
	}



	

}
