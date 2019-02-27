package com.javaman.subteranean.items;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public abstract class BasicItem extends Item  {

	public BasicItem(String unlocalizedName ) {
		super(new Properties().group(ItemGroup.MISC));

		//this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		
	}

}
