package com.javaman.subteranean.items;



import com.javaman.subterranean.SubterraneanCreaturesMod;
import com.javaman.subterranean.dimension.DimensionRegister;



import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class TransDimensionalOrb  extends  Item{
	

	public TransDimensionalOrb() {
		super(new Properties().group(ItemGroup.COMBAT));
		// TODO Auto-generated constructor stub
		
		
		this.setRegistryName(SubterraneanCreaturesMod.MODID+":"+"trans_dimensional_orb");
		 
		
	
		 
	}

	/**
	* Called whenever this item is equipped and the right mouse button is pressed.
	* Args: itemStack, world, entityPlayer
	*/
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
	
	if (!world.isRemote) {
		if(player instanceof EntityPlayer){
			EntityPlayerMP thePlayer = (EntityPlayerMP) player;
			
		
			
			
			
			if(thePlayer.dimension.getId() != DimensionRegister.dimensionId)
			{
				
				
					
				//PlayerList
				//MinecraftServer minecraftserver = player.getServer();
				//WorldServer worldserver1 = minecraftserver.getWorld(DimensionRegister.dimensionId);
				//thePlayer.changeDimension(DimensionRegister.dimensionId);
				//world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(0), worldserver1);
				//world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(0), worldserver1,new DimensionTeleporter(worldserver1,player));
			
				//thePlayer.changeDimension(DimensionRegister.dimensionId);
			    
				//new DimensionTeleporter(worldserver1,player);
			
				try {
					thePlayer.timeUntilPortal = 1000;
					
					
					//thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DimensionRegister.dimensionId);
					//thePlayer.changeDimension(DimensionRegister.dimensionId);
					
					//MinecraftServer minecraftserver = player.getServer();
					//WorldServer worldserver1 = minecraftserver.getWorld(DimensionRegister.dimensionId);
					//thePlayer.changeDimension(DimensionRegister.dimensionId);
					//world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(0), worldserver1);
					//world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(0), worldserver1,new DimensionTeleporter(worldserver1,player));
				
					com.javaman.subterranean.dimension.CustomTeleporter.teleportToDimension(thePlayer, DimensionRegister.dimensionId, 0, 100, 0);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
			}else{
				try {
					thePlayer.timeUntilPortal = 1000;
					
					
					//MinecraftServer minecraftserver = player.getServer();
					//WorldServer worldserver1 = minecraftserver.getWorld(DimensionRegister.dimensionId);
					//thePlayer.changeDimension(DimensionRegister.dimensionId);
					//world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(0), worldserver1);
					//world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(0), worldserver1,new DimensionTeleporter(worldserver1,player));
				
					
					com.javaman.subterranean.dimension.CustomTeleporter.teleportToDimension(thePlayer, 0, 0, 100, 0);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			
				
			}
			
			
		
		}
		
		
		
		
	}
	 return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	   
	}
	
	
}

