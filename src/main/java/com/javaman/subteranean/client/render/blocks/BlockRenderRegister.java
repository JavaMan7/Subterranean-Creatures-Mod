package com.javaman.subteranean.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.javaman.subterranean.SubterraneanCreaturesMod;
import com.javaman.subterranean.blocks.ModBlocks;

public final class BlockRenderRegister {
	public static void registerBlockRenderer() {
	    reg(ModBlocks.SUBTERRANEAN_BLOCKS);
	    reg(ModBlocks.PORTAL);
	    reg(ModBlocks.LapisCobblestone);
	}

	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(SubterraneanCreaturesMod.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}