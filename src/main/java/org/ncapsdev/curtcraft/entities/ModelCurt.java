package org.ncapsdev.curtcraft.entities;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelCurt extends ModelBiped
{

            public ModelCurt()
            {
               this(0.0F);
            }

            public ModelCurt(float par1)
            {
                this(par1, 0.0F);
            }

            public ModelCurt(float par1, float par2)
            {
                heldItemLeft = 0;
                heldItemRight = 0;
                isSneak = false;
                aimedBow = false;
                CurtCloak = new ModelRenderer(this, 0, 0);
                CurtCloak.addBox(-5F, 0.0F, -1F, 10, 16, 1, par1);
                CurtEars = new ModelRenderer(this, 24, 0);
                CurtEars.addBox(-3F, -6F, -1F, 6, 6, 1, par1);
                CurtHead = new ModelRenderer(this, 0, 0);
                CurtHead.addBox(-4F, -8F, -4F, 8, 8, 8, par1);
                CurtHead.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
                CurtHeadwear = new ModelRenderer(this, 32, 0);
                CurtHeadwear.addBox(-4F, -8F, -4F, 8, 8, 8, par1 + 0.5F);
                CurtHeadwear.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
                CurtBody = new ModelRenderer(this, 16, 16);
                CurtBody.addBox(-4F, 0.0F, -2F, 8, 12, 4, par1);
                CurtBody.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
                CurtRightArm = new ModelRenderer(this, 40, 16);
                CurtRightArm.addBox(-3F, -2F, -2F, 4, 12, 4, par1);
                CurtRightArm.setRotationPoint(-5F, 2.0F + par2, 0.0F);
                CurtLeftArm = new ModelRenderer(this, 40, 16);
                CurtLeftArm.mirror = true;
                CurtLeftArm.addBox(-1F, -2F, -2F, 4, 12, 4, par1);
                CurtLeftArm.setRotationPoint(5F, 2.0F + par2, 0.0F);
                CurtRightLeg = new ModelRenderer(this, 0, 16);
                CurtRightLeg.addBox(-2F, 0.0F, -2F, 4, 12, 4, par1);
                CurtRightLeg.setRotationPoint(-2F, 12F + par2, 0.0F);
                CurtLeftLeg = new ModelRenderer(this, 0, 16);
                CurtLeftLeg.mirror = true;
                CurtLeftLeg.addBox(-2F, 0.0F, -2F, 4, 12, 4, par1);
                CurtLeftLeg.setRotationPoint(2.0F, 12F + par2, 0.0F);
            }

            public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
            {
                //render(par1Entity, par2, par3, par4, par5, par6, par7);
                CurtHead.render(par7);
                CurtBody.render(par7);
                CurtRightArm.render(par7);
                CurtLeftArm.render(par7);
                CurtRightLeg.render(par7);
                CurtLeftLeg.render(par7);
                CurtHeadwear.render(par7);
            }

            public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
            {
                CurtHead.rotateAngleY = par4 / 57.29578F;
                CurtHead.rotateAngleX = par5 / 57.29578F;
                CurtHeadwear.rotateAngleY = CurtHead.rotateAngleY;
                CurtHeadwear.rotateAngleX = CurtHead.rotateAngleX;
                CurtRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + 3.141593F) * 2.0F * par2 * 0.5F;
                CurtLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
                CurtRightArm.rotateAngleZ = 0.0F;
                CurtLeftArm.rotateAngleZ = 0.0F;
                CurtRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
                CurtLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + 3.141593F) * 1.4F * par2;
                CurtRightLeg.rotateAngleY = 0.0F;
                CurtLeftLeg.rotateAngleY = 0.0F;
                if(isRiding)
                {
                	CurtRightArm.rotateAngleX += -0.6283185F;
                	CurtLeftArm.rotateAngleX += -0.6283185F;
                	CurtRightLeg.rotateAngleX = -1.256637F;
                	CurtLeftLeg.rotateAngleX = -1.256637F;
                	CurtRightLeg.rotateAngleY = 0.3141593F;
					CurtLeftLeg.rotateAngleY = -0.3141593F;
                }
                if(heldItemLeft != 0)
                  CurtLeftArm.rotateAngleX = CurtLeftArm.rotateAngleX * 0.5F - 0.3141593F * (float)heldItemLeft;
                if(heldItemRight != 0)
                CurtRightArm.rotateAngleX = CurtRightArm.rotateAngleX * 0.5F - 0.3141593F * (float)heldItemRight;
                CurtRightArm.rotateAngleY = 0.0F;
                CurtLeftArm.rotateAngleY = 0.0F;
                if(this.onGround > -9990F)
                {
                    float var7 = this.onGround;
                    CurtBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(var7) * 3.141593F * 2.0F) * 0.2F;
                    CurtRightArm.rotationPointZ = MathHelper.sin(CurtBody.rotateAngleY) * 5F;
                    CurtRightArm.rotationPointX = -MathHelper.cos(CurtBody.rotateAngleY) * 5F;
                    CurtLeftArm.rotationPointZ = -MathHelper.sin(CurtBody.rotateAngleY) * 5F;
                    CurtLeftArm.rotationPointX = MathHelper.cos(CurtBody.rotateAngleY) * 5F;
                    CurtRightArm.rotateAngleY += CurtBody.rotateAngleY;
                    CurtLeftArm.rotateAngleY += CurtBody.rotateAngleY;
                    CurtLeftArm.rotateAngleX += CurtBody.rotateAngleY;
                    var7 = 1.0F - this.onGround;    
                    var7 *= var7;
		            var7 *= var7;
					var7 = 1.0F - var7;
                    float var8 = MathHelper.sin(var7 * 3.141593F);
                    float var9 = MathHelper.sin(this.onGround * 3.141593F) * -(CurtHead.rotateAngleX - 0.7F) * 0.75F;
                    CurtRightArm.rotateAngleX = (float)((double)CurtRightArm.rotateAngleX - ((double)var8 * 1.2D + (double)var9));
                    CurtRightArm.rotateAngleY += CurtBody.rotateAngleY * 2.0F;
                    CurtRightArm.rotateAngleZ = MathHelper.sin(this.onGround * 3.141593F) * -0.4F;
                }
                 if(isSneak)
                {
                    CurtBody.rotateAngleX = 0.5F;
                    CurtRightArm.rotateAngleX += 0.4F;
                    CurtLeftArm.rotateAngleX += 0.4F;
                    CurtRightLeg.rotationPointZ = 4F;
                    CurtLeftLeg.rotationPointZ = 4F;
                    CurtRightLeg.rotationPointY = 9F;
                    CurtLeftLeg.rotationPointY = 9F;
                    CurtHead.rotationPointY = 1.0F;
                } else
                {
                    CurtBody.rotateAngleX = 0.0F;
					CurtRightLeg.rotationPointZ = 0.0F;
					CurtLeftLeg.rotationPointZ = 0.0F;
					CurtRightLeg.rotationPointY = 12F;
                    CurtLeftLeg.rotationPointY = 12F;
                    CurtHead.rotationPointY = 0.0F;
                }
                CurtRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                CurtLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                CurtRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
                CurtLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
                if(aimedBow)
                {
                    float var7 = 0.0F;
                    float var8 = 0.0F;
                    CurtRightArm.rotateAngleZ = 0.0F;
                    CurtLeftArm.rotateAngleZ = 0.0F;
					CurtRightArm.rotateAngleY = -(0.1F - var7 * 0.6F) + CurtHead.rotateAngleY;
					CurtLeftArm.rotateAngleY = (0.1F - var7 * 0.6F) + CurtHead.rotateAngleY + 0.4F;
					CurtRightArm.rotateAngleX = -1.570796F + CurtHead.rotateAngleX;
					CurtLeftArm.rotateAngleX = -1.570796F + CurtHead.rotateAngleX;
					CurtRightArm.rotateAngleX -= var7 * 1.2F - var8 * 0.4F;
					CurtLeftArm.rotateAngleX -= var7 * 1.2F - var8 * 0.4F;
					CurtRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                    CurtLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                    CurtRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
                    CurtLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
                }
            }

            public void renderEars(float par1)
            {
                CurtEars.rotateAngleY = CurtHead.rotateAngleY;
                CurtEars.rotateAngleX = CurtHead.rotateAngleX;
                CurtEars.rotationPointX = 0.0F;
                CurtEars.rotationPointY = 0.0F;
                CurtEars.render(par1);
            }

            public void renderCloak(float par1)
            {
               CurtCloak.render(par1);
            }

            public ModelRenderer CurtHead;
            public ModelRenderer CurtHeadwear;
            public ModelRenderer CurtBody;
            public ModelRenderer CurtRightArm;
            public ModelRenderer CurtLeftArm;
            public ModelRenderer CurtRightLeg;
            public ModelRenderer CurtLeftLeg;
            public ModelRenderer CurtEars;
            public ModelRenderer CurtCloak;
            public int heldItemLeft;
            public int heldItemRight;
            public boolean isSneak;
            public boolean aimedBow;
}
