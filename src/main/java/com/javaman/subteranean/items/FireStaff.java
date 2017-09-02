package com.javaman.subteranean.items;

import com.javaman.subteranean.projectiles.EntityFireShot;
//import com.javaman.subteranean.projectiles.EntityFireShot;
import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class FireStaff  extends  Item{
	

	public FireStaff( ) {
		super();
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("fire_staff");
		this.setRegistryName(SubterraneanCreaturesMod.MODID+":"+"fire_staff");

		 this.setMaxDamage(384);
		 
		 this.setMaxStackSize(64);
		 this.setCreativeTab(CreativeTabs.COMBAT);
		 
	}

	/**
	* Called whenever this item is equipped and the right mouse button is pressed.
	* Args: itemStack, world, entityPlayer
	*/
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityplayer, EnumHand handIn) {
	
	
	

	//world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	// IMPORTANT! Only spawn new entities on the server. If the world is not remote,
	// that means you are on the server:
	if (!world.isRemote) {
		
		
			
		//world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), 0.0, 0.0,0.01 , 100); //make fier stot
		EntityFireShot entityFireShot = new EntityFireShot(world, entityplayer);
		entityFireShot.setHeadingFromThrower(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, 1.5F, 1.0F);
        world.spawnEntity(entityFireShot);
		 
		//player.attackEntityFrom(DamageSource.OUT_OF_WORLD, 1);
		
		
	}

	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, entityplayer.getHeldItem(handIn));
	}

}
