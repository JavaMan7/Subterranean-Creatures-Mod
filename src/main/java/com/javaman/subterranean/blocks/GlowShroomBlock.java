package com.javaman.subterranean.blocks;

import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class GlowShroomBlock extends BlockHugeMushroom{

	public GlowShroomBlock(Material materialIn, MapColor color, Block smallBlockIn) {
		super(materialIn, color, smallBlockIn);
		this.setRegistryName(SubterraneanCreaturesMod.MODID, "blue_mushroom_block");
		this.setUnlocalizedName("blue_mushroom_block");
		this.setLightLevel(.8f);
	}

}
