package com.javaman.subterranean.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;


public class BasicBlock extends Block {
    
	
	 //MaterialColor coler = blockMapColor.CYAN;
    public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance, MaterialColor coler ) {
        super(Properties.create(material));
       
    }

    public BasicBlock() {
    	super(Properties.create(Material.ROCK));
    }

   // public BasicBlock(String unlocalizedName) {
      //  this(unlocalizedName, 2.0f, 10.0f);
   // }
}