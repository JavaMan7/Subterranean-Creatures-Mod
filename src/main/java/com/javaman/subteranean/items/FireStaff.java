package com.javaman.subteranean.items;

import com.javaman.subteranean.projectiles.EntityFireShot;
import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FireStaff  extends  Item{
	

	public FireStaff( ) {
		super();
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("fire_staff");

		 this.setMaxDamage(384);
		 
		 this.setMaxStackSize(64);
		 this.setCreativeTab(CreativeTabs.tabCombat);
		 
	}

	/**
	* Called whenever this item is equipped and the right mouse button is pressed.
	* Args: itemStack, world, entityPlayer
	*/
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
	if (!player.capabilities.isCreativeMode) {
		int damage = this.getDamage(stack);
		
		if(damage < 1 - getMaxDamage())
		{
			this.setDamage(stack, ++damage);
			
		}
		
	}
	

	//world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	// IMPORTANT! Only spawn new entities on the server. If the world is not remote,
	// that means you are on the server:
	if (!world.isRemote) {
		
		
			
		world.spawnEntityInWorld(new EntityFireShot(world, player)); //make fier stot
		
		
		
		
	}

	return stack;
	}

}
