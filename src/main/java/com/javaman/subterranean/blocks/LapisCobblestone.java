package com.javaman.subterranean.blocks;

import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LapisCobblestone extends Block {

	public LapisCobblestone() {
		super(Material.ROCK);
		this.setUnlocalizedName("lapiscobblestone");
		this.setRegistryName(SubterraneanCreaturesMod.MODID+":"+"lapiscobblestone");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
	}
	
	
	

}
