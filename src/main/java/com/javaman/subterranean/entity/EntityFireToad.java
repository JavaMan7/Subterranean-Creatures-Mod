package com.javaman.subterranean.entity;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityFireToad extends EntityMob implements IRangedAttackMob  {
	
	 private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.0D, 20, 60, 15.0F);
	 private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false);
	 private int shootCoolDown = 100;
	private int explosionStrength = (int) (this.getHealth() / 4);
	private Object targetedEntity;
	private double useRageAttackAt = 16.0D;
	public EntityFireToad(World par1World) {
		super(par1World);
		
		this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        //int check sight ; nearby only
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        
        if (par1World != null && !par1World.isRemote)
        {
            this.setCombatTask();
        }
        this.setSize(0.8F, 0.8F);
        
		
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	 public void onLivingUpdate()
	    {
	        super.onLivingUpdate();
	        
	        int var1 = MathHelper.floor_double(this.posX);
	        int var2 = MathHelper.floor_double(this.posY);
	        int var3 = MathHelper.floor_double(this.posZ);

	        if(getAttackTarget() instanceof EntityLivingBase && shootCoolDown >= 100)
	        {
	        
	        attackEntityWithRangedAttack(getAttackTarget(),  0.10f);
	        shootCoolDown = 0;
	        
	        }
	        for (int var4 = 0; var4 < 4; ++var4)
	        {
	            var1 = MathHelper.floor_double(this.posX + (double)((float)(var4 % 2 * 2 - 1) * 0.25F));
	            var2 = MathHelper.floor_double(this.posY);
	            var3 = MathHelper.floor_double(this.posZ + (double)((float)(var4 / 2 % 2 * 2 - 1) * 0.25F));

	        }
	        shootCoolDown++; 
	    }
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	}
	public void setCombatTask()
    {
        this.tasks.removeTask(this.aiAttackOnCollide);
        this.tasks.removeTask(this.aiArrowAttack);
        ItemStack var1 = this.getHeldItem();

        if (var1 != null && var1.getItem() == Items.bow)
        {
            this.tasks.addTask(4, this.aiArrowAttack);
        }
        else
        {
            this.tasks.addTask(4, this.aiAttackOnCollide);
        }
    }

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_) {
		

	 // if (this.targetedEntity != null && target.getDistanceSqToEntity(this) > useRageAttackAt * useRageAttackAt)
	 // {
		double var11 = target.posX - this.posX;
        double var13 = target.getEntityBoundingBox().minY + (double)(target.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
        double var15 = target.posZ - this.posZ;
        this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(var11, var15)) * 180.0F / (float)Math.PI;
      EntitySmallFireball fLB = new EntitySmallFireball(this.worldObj, this, var11, var13, var15);
        int x = (int)this.posX;
        int y = (int)this.posY;
        int z = (int)this.posZ;
        //this.worldObj.setBlock(x, y-1, z, Blocks.air);
       // EntityTNTPrimed fLB = new EntityTNTPrimed(this.worldObj, var11, var13, var15,this);
        		//Blocks.sand);
       // EntityMyFallingBlock fLB = new EntityMyFallingBlock(this.worldObj, var11, var13, var15,
        		//Blocks.sand);
		//fLB.field_92057_e = this.explosionStrength ;
        double var18 = 1.0D;//this was at 4
        Vec3 var20 = this.getLook(1.0F);
        fLB.posX = this.posX + var20.xCoord * var18;
        fLB.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
        fLB.posZ = this.posZ + var20.zCoord * var18;
        this.worldObj.spawnEntityInWorld(fLB);
	 //}
		/*EntityArrow var3 = new EntityArrow(this.worldObj, this, p_82196_1_, 1.6F, (float)(14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
		//EntitySnowball var3 = new EntitySnowball(this.worldObj, this);
        double var4 = p_82196_1_.posX - this.posX;
        double var6 = p_82196_1_.posY + (double)p_82196_1_.getEyeHeight() - 1.100000023841858D - var3.posY;
        double var8 = p_82196_1_.posZ - this.posZ;
        float var10 = MathHelper.sqrt_double(var4 * var4 + var8 * var8) * 0.2F;
        var3.setThrowableHeading(var4, var6 + (double)var10, var8, 1.6F, 12.0F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var3);*/
		
	}
	
	//protected String getLivingSound()
    //{
       // return "mob.wither.idle";
    //}

	//@Override
	//public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		
		//return new Wrath(worldObj);
	//}

	

}