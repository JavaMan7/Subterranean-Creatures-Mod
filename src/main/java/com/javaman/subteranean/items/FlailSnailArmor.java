package com.javaman.subteranean.items;

import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;


public class FlailSnailArmor extends ItemArmor {
	
	
	public  static net.minecraft.item.ArmorMaterial FlailSnailShell=  ArmorMaterial.create("flail_snail_shell", SubterraneanCreaturesMod.MODID+":"+"flail_snail_shell", 33, new int[] {3, 8, 6, 3}, 1,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0,() -> {
	      return Ingredient.fromItems(ModItems.FLAIL_SHELL_FRAGMENT);
	   });
	public FlailSnailArmor(String textureName, int renderIndex, EntityEquipmentSlot type) {
	    super(FlailSnailShell, EntityEquipmentSlot.CHEST, new Properties().group(ItemGroup.COMBAT));
	   
	   // this.textureName = textureName;
	   // this.setUnlocalizedName(textureName);
	    this.setRegistryName(SubterraneanCreaturesMod.MODID, textureName);
	
	   
	}
	//@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	//if (player.getArmorInventoryList(). != null && ((Object) player).getCurrentArmor(1).getItem() == ModItems.FlailSnailShellChestplate);
	  //  player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40));
	    
	    
	   
	}
	
	  public ItemStack getRepairItemStack()
      {
          
          return new ItemStack(ModItems.FLAIL_SHELL_FRAGMENT);
      }
	
	
}