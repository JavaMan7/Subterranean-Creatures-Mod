package com.javaman.subteranean.items;



import com.javaman.subterranean.SubterraneanCreaturesMod;
import com.javaman.subterranean.dimension.DimensionRegister;
import com.javaman.subterranean.dimension.DimensionTeleporter;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;

public class TransDimensionalOrb  extends  Item{
	

	public TransDimensionalOrb( ) {
		
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("trans_dimensional_orb");
		
		this.setRegistryName(SubterraneanCreaturesMod.MODID+":"+"trans_dimensional_orb");
		 this.setMaxDamage(384);
		
		 this.setMaxStackSize(64);
		 this.setCreativeTab(CreativeTabs.COMBAT);
		 
	}

	/**
	* Called whenever this item is equipped and the right mouse button is pressed.
	* Args: itemStack, world, entityPlayer
	*/
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
	
	if (!world.isRemote) {
		if(player instanceof EntityPlayer){
			EntityPlayer thePlayer =  player;
			
		
			
			
			
			if(thePlayer.dimension != DimensionRegister.dimensionId&& DimensionManager.isDimensionRegistered(DimensionRegister.dimensionId))
			{
				
				
					
				//PlayerList
				//MinecraftServer minecraftserver = player.getServer();
				//WorldServer worldserver1 = minecraftserver.getWorld(DimensionRegister.dimensionId);
				//thePlayer.changeDimension(DimensionRegister.dimensionId);
				//world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(0), worldserver1);
				//world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(0), worldserver1,new DimensionTeleporter(worldserver1,player));
			
				thePlayer.changeDimension(DimensionRegister.dimensionId);
			    
				//new DimensionTeleporter(worldserver1,player);
			
				
				
				
				
			}else{
				
			
				MinecraftServer minecraftserver = player.getServer();
				WorldServer worldserver1 = minecraftserver.getWorld(0);
				//thePlayer.changeDimension();
				world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(DimensionRegister.dimensionId),worldserver1);//,new DimensionTeleporter(worldserver1,player));
					
				//new DimensionTeleporter(worldserver1,player);
			}
			
			
		
		}
		
		
		
		
	}
	 return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	   
	}
	
	
}

