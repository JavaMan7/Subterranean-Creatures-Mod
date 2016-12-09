package com.javaman.subteranean.items;

import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FlailSnailArmor extends ItemArmor {
	private String textureName = "FlailSnailShell";
	public FlailSnailArmor( ArmorMaterial material, String textureName, int renderIndex, int type) {
	    super(material, renderIndex, type);
	   
	   // this.textureName = textureName;
	    this.setUnlocalizedName(textureName);
	
	   
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return SubterraneanCreaturesMod.MODID + ":armor/" + this.textureName  + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem() == ModItems.FlailSnailShellChestplate);
	    player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40));
	    
	    
	   
	}
}