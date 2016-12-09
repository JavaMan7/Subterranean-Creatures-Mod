package com.javaman.subteranean.projectiles;




import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;



public class MakeProjectile {
	
	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		createEntity();


		
	}
	
	public static void createEntity(){
		// Config, Blocks, Items, etc. go up here
		

		// I like using an incrementable index to set my IDs rather than writing 1, 2, 3, etc., so I never have
		// to worry about order or if I missed a number (doesn't really matter though)
		int modEntityID = 0;

		// If you have a lot of Entities to register, consider creating a class with an 'registerEntities' method
		// so your main class stays tidy and readable
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(EntityFireShot.class, "Throwing Rock", randomId, SubterraneanCreaturesMod.MODID, 64, 10, true);

		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}

}