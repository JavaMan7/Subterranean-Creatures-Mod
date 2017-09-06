package com.javaman.subterranean;

import java.util.Random;

import com.javaman.subteranean.items.ModItems;

//import com.javaman.subteranean.items.EssenceOfLifeDrain;
//import com.javaman.subteranean.items.ModItems;
//import com.javaman.subterranean.blocks.LapisCobblestone;
//import com.javaman.subterranean.blocks.ModBlocks;
//import com.javaman.subterranean.entity.EntityFireToad;
//import com.javaman.subterranean.entity.EntityFlailSnail;
//import com.javaman.subterranean.entity.EntityWrath;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SubEventHandler
{
public static Random random;
public static int dropped;
//public static DamageSource LIfedrain = (new DamageSource("LIfedrain")).setDamageAllowedInCreativeMode();
Blocks b;
BlockOre b2;
TileEntityChest  t = new TileEntityChest();

@SubscribeEvent
public void onEntityDrop(LivingDropsEvent event)
{
random = new Random();


		
	}
@SubscribeEvent
public void EntityInteractEvent(EntityInteract e) {
	//((EntityLivingBase) e.getEntity()).setHealth( ((EntityLivingBase) e.getEntity()).getHealth() - 10.0f );
	
	
	
	
	
	
}
		
@SubscribeEvent
public void AttackEntityEvent(AttackEntityEvent e)
{
	
try {
	
	if(e.getEntityPlayer().inventory.getCurrentItem().getItem() != null ){
		if(e.getEntityPlayer().inventory.getCurrentItem().getItem() == ModItems.WRAITH_SWORD )
		{
		
			
			
				
			 EntityPlayerMP thePlayer =  (EntityPlayerMP) e.getEntityPlayer();
			e.getTarget().attackEntityFrom(DamageSource.WITHER, 7.0F);
			
			
			
				e.getEntityPlayer().setHealth( e.getEntityPlayer().getHealth() + 0.5f );
				//System.out.println("bey"
				//		+ "");
				
				
				
			
			
			
			
		}
		
		
			//if(e.entityPlayer.inventory.getCurrentItem().getItem() == AddItem.WraithSword && e.target )
			//{
			
				
				
					
				 //EntityPlayerMP thePlayer =  e.;
					//e.entityPlayer.
					
			//}
		
		
		}

} catch (Exception e2) {
	// TODO: handle exception
}
	
}
		

		
		
		
		
		
		
		
		
		
		
		
	
	
	private int rand() {
		int rand = random.nextInt(100);
		return rand;
		
	}
	
}
