package com.javaman.subterranean.dimension;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderHell;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegister 
{
	
	public static void mainRegistry()
	{
		registerDimension();
		
		
		
	}
	
	public static final int  dimensionId = 8;
	
	public static void registerDimension()
	{
		
		//DimensionManager.registerProviderType(dimensionId, WorldProviderSub.class,false);
		//DimensionManager.registerDimension(dimensionId, dimensionId);
		//DimensionManager.unregisterDimension(-1);
		DimensionManager.registerDimension(dimensionId,DimensionType.THE_END);
	    
		//DimensionManager.registerDimension(-1,DimensionType.THE_END);
		
		
	}
	

}
