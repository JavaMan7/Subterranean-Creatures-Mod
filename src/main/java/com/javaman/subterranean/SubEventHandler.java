package com.javaman.subterranean;

import java.util.Random;

import com.javaman.subteranean.items.EssenceOfLifeDrain;
import com.javaman.subteranean.items.ModItems;
import com.javaman.subterranean.blocks.LapisCobblestone;
import com.javaman.subterranean.blocks.ModBlocks;
import com.javaman.subterranean.entity.EntityFireToad;
import com.javaman.subterranean.entity.EntityFlailSnail;
import com.javaman.subterranean.entity.EntityWrath;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
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

EssenceOfLifeDrain eold = new EssenceOfLifeDrain();
 //DO NOT CHANGE THIS
int dropped = random.nextInt(1) + 1;



if(event.entityLiving instanceof EntityFireToad)
{
	if(rand()< 10)
event.entityLiving.entityDropItem(new ItemStack(Items.nether_wart), dropped);
	if(rand()< 10)
event.entityLiving.entityDropItem(new ItemStack(ModItems.FireToadGland), dropped);
}
if(event.entityLiving instanceof EntityWrath)
{
	if(rand()< 10)
event.entityLiving.entityDropItem(new ItemStack(ModItems.EssenceOfLifeDrain), dropped);
}
if(event.entityLiving instanceof EntityFlailSnail)
{
	if(rand()< 10)
	event.entityLiving.entityDropItem(new ItemStack(ModItems.FlailShellFragment), dropped);

}



}
@SubscribeEvent
public void PlayerInteractEvent(PlayerInteractEvent e){
	//Block b = e.entityPlayer.getEntityWorld().getBlockState(e.pos).getBlock();
	//if(b instanceof LapisCobblestone )
	//{
		
		
		
	//}
    
	
	
	
}
	@SubscribeEvent
	public void AttackEntityEvent(AttackEntityEvent e)
	{
		
	try {
		Item f = ModItems.EssenceOfLifeDrain;
		if(e.entityPlayer.inventory.getCurrentItem().getItem() != null ){
			if(e.entityPlayer.inventory.getCurrentItem().getItem() == ModItems.WraithSword )
			{
			
				
				
					
				 EntityPlayerMP thePlayer =  (EntityPlayerMP) e.entityPlayer;
				e.target.attackEntityFrom(DamageSource.wither, 7.0F);
				
				
				
					e.entityPlayer.setHealth( e.entityPlayer.getHealth() + 0.5f );
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
