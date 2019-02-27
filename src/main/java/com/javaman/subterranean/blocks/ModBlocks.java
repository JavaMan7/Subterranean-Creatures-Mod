package com.javaman.subterranean.blocks;

import java.util.HashMap;

import net.minecraft.block.Block;

public class ModBlocks {
	
	public class SUBTERRANEAN_BLOCKS {
		
	}
public static final HashMap<String,Block> SUBTERRANEAN_BLOCKS = new HashMap<String,Block>();
	
public static void registerBlock(Block block){
	SUBTERRANEAN_BLOCKS.put(block.getRegistryName().toString(), block);
	
	
	
	
	
	
}

public static Block lapisCobblestone= new LapisCobblestone();
//public static Block GLOWSHOOM= new GlowShroom();
//public static Block GLOWSHOOM_BLOCK = new GlowShroomBlock(Material.SPONGE,MapColor.RED,GLOWSHOOM);
public static void addItem()
{
	
	
	registerBlock(lapisCobblestone);
	//registerBlock(GLOWSHOOM);
	//registerBlock(GLOWSHOOM_BLOCK);
	
}
}
