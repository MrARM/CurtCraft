package org.ncapsdev.curtcraft.render;

import org.ncapsdev.curtcraft.curtcraft;
import org.ncapsdev.curtcraft.entities.ModelCurt;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderCurt extends RenderLiving {
	 private static final ResourceLocation Texture = new ResourceLocation(curtcraft.MODID + ":textures/entities/curt.png");
	   
	    public RenderCurt(ModelBiped modelBiped, float par2)
	    {
	    	  super(modelBiped,par2);
	        
	    }
	 protected ResourceLocation getEntityTexture(Entity par1Entity) {
	 return Texture;
		 
	}
		 
	}