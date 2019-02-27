package com.javaman.subterranean.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityWrath extends EntityZombie  {

	public EntityWrath(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected boolean shouldBurnInDay()
    {
        return false;
    }
	 protected SoundEvent getAmbientSound()
	    {
	        return SoundEvents.ENTITY_BLAZE_AMBIENT;
	    }

	    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
	    {
	        return SoundEvents.ENTITY_WITHER_HURT;
	    }

	    protected SoundEvent getDeathSound()
	    {
	        return SoundEvents.ENTITY_BLAZE_DEATH;
	    }

	    protected SoundEvent getStepSound()
	    {
	        return null;
	    }

	    protected void playStepSound(BlockPos pos, Block blockIn)
	    {
	        this.playSound(this.getStepSound(), 0.15F, 1.0F);
	    }

	    public boolean attackEntityAsMob(Entity entityIn)
	    {
	    	setHealth( (float) (getHealth() +  getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getBaseValue()));
	    	
	    	//System.out.println(getHealth());
	    	super.attackEntityAsMob(entityIn);
	    	
	    	
	    	
	    	 return true;
	    }
	    @Override
	    public void setChild(boolean childZombie)
	    {
	       
	    }
}

	