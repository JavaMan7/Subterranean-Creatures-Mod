package com.javaman.subterranean.dimension;

import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class DimensionTeleporter extends Teleporter{
	Entity player;
	public DimensionTeleporter(WorldServer worldIn,Entity player) {
		super(worldIn);
		// TODO Auto-generated constructor stub
		this.player = player;
		MinecraftServer minecraftserver = player.getServer();
		WorldServer worldserver1 = minecraftserver.getWorld(DimensionRegister.dimensionId);
		world.getMinecraftServer().getPlayerList().transferEntityToWorld((Entity)player, 0, player.getServer().getWorld(0), worldserver1,this);
	}

	@Override
	public void placeInPortal(Entity entityIn, float rotationYaw) {
		
	}

	@Override
	public boolean placeInExistingPortal(Entity entityIn, float rotationYaw) {
		
		return false;
	}

	@Override
	public boolean makePortal(Entity entityIn) {
		return false;
	}

	@Override
	public void removeStalePortalLocations(long worldTime) {
		
	}
	
	
	
}

  