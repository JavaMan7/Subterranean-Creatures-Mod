package com.javaman.subterranean.dimension;

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
		
		DimensionManager.registerProviderType(dimensionId, WorldProviderSub.class,false);
		DimensionManager.registerDimension(dimensionId, dimensionId);
		
		
	}
	

}
