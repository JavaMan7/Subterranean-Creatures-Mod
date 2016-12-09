package com.javaman.subterranean.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public class SUBTERRANEAN_BLOCKS {

	}
	public static Block LapisCobblestone;
	public static Block SUBTERRANEAN_BLOCKS;
	public static Block PORTAL;
    public static void createBlocks() {
    	GameRegistry.registerBlock(LapisCobblestone = new LapisCobblestone("LapisCobblestone",Material.rock).setCreativeTab(CreativeTabs.tabBlock), "LapisCobblestone");

    	GameRegistry.registerBlock(SUBTERRANEAN_BLOCKS = new BasicBlock("simie_cobblestone").setCreativeTab(CreativeTabs.tabBlock), "simie_cobblestone");
    	GameRegistry.registerBlock (PORTAL = new BlockModPortal("sub_port").setCreativeTab(CreativeTabs.tabBlock),"sub_port");
    	
    	
    }
}
