package com.javaman.subteranean.items;



import com.javaman.subterranean.dimension.DimensionRegister;
import com.javaman.subterranean.dimension.DimensionTeleporter;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class TransDimensionalOrb  extends  Item{
	

	public TransDimensionalOrb( ) {
		
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("TransDimensionalOrb");

		 this.setMaxDamage(384);
		
		 this.setMaxStackSize(64);
		 this.setCreativeTab(CreativeTabs.tabCombat);
		 
	}

	/**
	* Called whenever this item is equipped and the right mouse button is pressed.
	* Args: itemStack, world, entityPlayer
	*/
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		
	if (!world.isRemote) {
		if(player instanceof EntityPlayer){
			EntityPlayerMP thePlayer = (EntityPlayerMP) player;
			
		//world.spawnEntityInWorld(new EntityFireShot(world, player));
			MinecraftServer server = MinecraftServer.getServer();
			
			
			if(thePlayer.dimension != DimensionRegister.dimensionId)
			{
				//,new DimensionTeleporter(server.worldServerForDimension(DimensionRegister.dimensionId))
				//thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DimensionRegister.dimensionId);
				try {
					thePlayer.timeUntilPortal = 1000;
					
					
					//thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DimensionRegister.dimensionId);
					thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DimensionRegister.dimensionId, new DimensionTeleporter(thePlayer.mcServer.worldServerForDimension(DimensionRegister.dimensionId)));
					
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
				
			}else{
				
				
				try {
					thePlayer.timeUntilPortal = 1000;
					thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0);
							
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
			}
			
			
		
		}
		
		
		
		
	}

	return stack;
	}
	
}

