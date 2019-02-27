package com.javaman.subteranean.items;

import com.javaman.subterranean.SubterraneanCreaturesMod;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class LifeDrainCrystal extends Item{
	
	
	public  LifeDrainCrystal()
	{
		super(new Properties().group(ItemGroup.MISC) );

		// TODO Auto-generated constructor stub
	
		//this.setUnlocalizedName("life_drain_crystal");
		this.setRegistryName(SubterraneanCreaturesMod.MODID+":"+"life_drain_crystal");
		 
		// this.setMaxStackSize(64);
		 
		// this.setCreativeTab(CreativeTabs.MISC);
		
		
		
	}

}
