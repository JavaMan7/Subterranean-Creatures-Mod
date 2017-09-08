package com.javaman.subterranean.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;

import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
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
	        return null;
	    }

	    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
	    {
	        return null;
	    }

	    protected SoundEvent getDeathSound()
	    {
	        return null;
	    }

	    protected SoundEvent getStepSound()
	    {
	        return null;
	    }

	    protected void playStepSound(BlockPos pos, Block blockIn)
	    {
	        this.playSound(this.getStepSound(), 0.15F, 1.0F);
	    }

}

	