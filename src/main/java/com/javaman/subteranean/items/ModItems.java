package com.javaman.subteranean.items;

import java.util.HashMap;

import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	
	public static final HashMap<String,Item> SUBTERRANEAN_ITEMS = new HashMap<String,Item>();
	
	public static void registerTtem(Item item){
		SUBTERRANEAN_ITEMS.put(item.getUnlocalizedName(), item);
		
		
		
		
		
		
	}
	
	public static void addItem()
	{
		registerTtem(new FireStaff( ) );
		registerTtem(new EssenceOfLifeDrain());
		
		
	}

}
