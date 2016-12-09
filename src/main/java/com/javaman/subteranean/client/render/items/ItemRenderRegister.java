package com.javaman.subteranean.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.javaman.subteranean.items.ModItems;
import com.javaman.subterranean.SubterraneanCreaturesMod;

public final class ItemRenderRegister {

	public static void registerItemRenderer() {
		reg(ModItems.SUBTERRANEAN_Items);
		reg(ModItems.EssenceOfLifeDrain);
		reg(ModItems.FireStaff);
		reg(ModItems.FireToadGland);
		reg(ModItems.FlailShellFragment);
	    reg(ModItems.TransDimensionalOrb);
	    reg(ModItems.WraithSword);
	    reg(ModItems.LifeDrainCrystal);
	    reg(ModItems.FlailSnailShellBoots);
	    reg(ModItems.FlailSnailShellChestplate);
	    reg(ModItems.FlailSnailShellHelmet);
	    reg(ModItems.FlailSnailShellLeggings);
				
	}

	//==========================================================================

	public static String modid = SubterraneanCreaturesMod.MODID;

	public static void reg(Item item) {
		
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
