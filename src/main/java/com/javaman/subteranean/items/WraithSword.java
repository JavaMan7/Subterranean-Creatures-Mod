package com.javaman.subteranean.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class WraithSword extends ItemSword{

	public WraithSword(ToolMaterial arg0) {
		super(arg0);
		
		this.setUnlocalizedName("WraithSword");
	
		 
		 //this.setMaxStackSize(64);
		 
		 this.setCreativeTab(CreativeTabs.COMBAT);
	}

	
	

}
