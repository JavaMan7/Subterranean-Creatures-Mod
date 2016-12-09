package com.javaman.subteranean.items;

import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item SUBTERRANEAN_Items;
	public  static ArmorMaterial FlailSnailShell=  EnumHelper.addArmorMaterial("EntityPlayer", "FlailSnailShell", 33, new int[] {3, 8, 6, 3}, 1);
	public static Item FireStaff = new FireStaff();
	public static Item FireToadGland = new FireToadGland(4, 0.4f, false);
	public static Item EssenceOfLifeDrain = new EssenceOfLifeDrain();
	public static Item LifeDrainCrystal = new LifeDrainCrystal();
	public static Item TransDimensionalOrb = new TransDimensionalOrb();
	public static Item FlailShellFragment = new FlailShellFragment();
	public static Item WraithSword = new WraithSword(ToolMaterial.EMERALD);
	public static ItemArmor  FlailSnailShellHelmet = new FlailSnailArmor(FlailSnailShell, "FlailSnailShellHelmet", 1,0);
	public static ItemArmor FlailSnailShellChestplate = new FlailSnailArmor(FlailSnailShell, "FlailSnailShellChestplate",1, 1);
	public static ItemArmor FlailSnailShellLeggings = new FlailSnailArmor(FlailSnailShell, "FlailSnailShellLeggings",2, 2);
	public static ItemArmor FlailSnailShellBoots = new FlailSnailArmor(FlailSnailShell, "FlailSnailShellBoots",1, 3);
	
	public static void createItems() {
		GameRegistry.registerItem(SUBTERRANEAN_Items= new BasicItem("enriched_slime"), "enriched_slime");
		
	}
	
	public static void registerTtem(){
		
		addItem(FireStaff);
		addItem(FireToadGland);
		addItem(WraithSword);
		addItem(EssenceOfLifeDrain);
		addItem(LifeDrainCrystal);
		addItem(TransDimensionalOrb);
		addItem(FlailShellFragment);
		addItem(FlailSnailShellHelmet);
		addItem(FlailSnailShellChestplate);
		addItem(FlailSnailShellLeggings);
		addItem(FlailSnailShellBoots);
		
		
		
		
	}
	
	public static void addItem(Item item)
	{
		//GameRegistry.registerItem(item, SubterraneanCreaturesMod.MODID + ":" + item.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item,item.getUnlocalizedName().substring(5));
		
		
		
	}

}
