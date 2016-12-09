package com.javaman.subterranean.crafting;

import com.javaman.subteranean.items.ModItems;
import com.javaman.subterranean.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void	initCrafting(){
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.SUBTERRANEAN_BLOCKS), "x#",'#', ModItems.SUBTERRANEAN_Items,'x',Blocks.cobblestone);
		
			GameRegistry.addRecipe(new ItemStack(ModItems.FireStaff), new Object[]{//for some bullshit reason if you change this recipe game crash
		    	"  A",
		    	"BCB",
		    	"A  ",
		    	'A', Items.stick, 'B', Items.gold_ingot,'C',ModItems.FireToadGland
		    	});
			GameRegistry.addRecipe(new ItemStack(ModItems.LifeDrainCrystal), new Object[]{
		    	"BBB",
		    	"BAB",
		    	"BBB",
		    	'A', Items.diamond, 'B', ModItems.EssenceOfLifeDrain
		    	});
			GameRegistry.addRecipe(new ItemStack(ModItems.WraithSword), new Object[]{
		    	" A ",
		    	"ABA",
		    	" C ",
		    	'A', Items.iron_ingot, 'B', ModItems.LifeDrainCrystal,'C',Items.stick
		    	});
			GameRegistry.addRecipe(new ItemStack(ModItems.FlailSnailShellChestplate), new Object[]{
		    	"A A",
		    	"AAA",
		    	"AAA",
		    	'A', ModItems.FlailShellFragment
		    	});
			GameRegistry.addRecipe(new ItemStack(ModItems.FlailSnailShellHelmet), new Object[]{
		    	"AAA",
		    	"A A",
		    	"   ",
		    	'A', ModItems.FlailShellFragment
		    	});
			GameRegistry.addRecipe(new ItemStack(ModItems.FlailSnailShellLeggings), new Object[]{
		    	"AAA",
		    	"A A",
		    	"A A",
		    	'A', ModItems.FlailShellFragment
		    	});
			GameRegistry.addRecipe(new ItemStack(ModItems.FlailSnailShellBoots), new Object[]{
		    	"   ",
		    	"A A",
		    	"A A",
		    	'A', ModItems.FlailShellFragment
		    	});
			
			
			
			GameRegistry.addRecipe(new ItemStack(ModItems.TransDimensionalOrb), new Object[]{
		    	"BBB",
		    	"BAB",
		    	"BBB",
		    	'A', ModItems.EssenceOfLifeDrain,'B',Items.ender_pearl
		    	});
			
			}
		
		}

