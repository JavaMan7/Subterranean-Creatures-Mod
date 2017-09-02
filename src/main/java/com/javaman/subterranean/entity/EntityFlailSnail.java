package com.javaman.subterranean.entity;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;

import net.minecraft.world.World;

public class EntityFlailSnail extends EntityMob //implements IRangedAttackMob 
{

	@Override
	public boolean attackEntityAsMob(Entity p_attackEntityAsMob_1_) {
		// TODO Auto-generated method stub
		return super.attackEntityAsMob(p_attackEntityAsMob_1_);
	}
	 //private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.0D, 20, 60, 15.0F);
	
	public EntityFlailSnail(World par1World) {
		super(par1World);
		
		//this.getNavigator().setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
        this.setSize(1.8F, 4.0F);
        
		
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	

	//@Override
	/*public void attackEntityWithRangedAttack(EntityLivingBase target, float arg1) {
		double var11 = target.posX - this.posX;
        double var13 = target.boundingBox.minY + (double)(target.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
        double var15 = target.posZ - this.posZ;
        this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(var11, var15)) * 180.0F / (float)Math.PI;
        int x = (int)this.posX;
        int y = (int)this.posY;
        int z = (int)this.posZ;
       // EntitySmallFireball fLB = new EntitySmallFireball(this.worldObj, this, var11, var13, var15);
       // this.worldObj.setBlock(x, y-1, z, Blocks.air);
        EntityMyFallingBlock fLB = new EntityMyFallingBlock(this.worldObj, var11, var13, var15,
        		Blocks.sand);
       
		//fLB.field_92057_e = this.explosionStrength ;
        double var18 = 1.0D;//this was at 4
        Vec3 var20 = this.getLook(1.0F);
        fLB.posX = this.posX + var20.xCoord * var18;
        fLB.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
        fLB.posZ = this.posZ + var20.zCoord * var18;
        this.worldObj.spawnEntityInWorld(fLB);
		
	}*/
	
	//protected String getLivingSound()
    //{
       // return "mob.wither.idle";
    //}

	//@Override
	//public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		
		//return new Wrath(worldObj);
	//}

	

}