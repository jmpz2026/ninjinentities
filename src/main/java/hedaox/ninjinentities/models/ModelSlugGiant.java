/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSlugGiant
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Head2;
    private final ModelRenderer EarR;
    private final ModelRenderer EarL;
    private final ModelRenderer AntennaR;
    private final ModelRenderer AntennaL;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelSlugGiant(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Head2 = new ModelRenderer(this);
        this.Head2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.Head2);
        this.Head2.cubeList.add(new ModelBox(this.Head2, 0, 16, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.5f));
        this.EarR = new ModelRenderer(this);
        this.EarR.setRotationPoint(-4.0f, -3.0f, -3.0f);
        this.setRotationAngle(this.EarR, 0.0f, -0.4363f, 0.0f);
        this.Head.addChild(this.EarR);
        this.EarR.cubeList.add(new ModelBox(this.EarR, 24, 16, 0.4226f, -4.0f, 0.9063f, 0, 4, 4, 0.0f));
        this.EarL = new ModelRenderer(this);
        this.EarL.setRotationPoint(4.0f, -3.0f, -3.0f);
        this.setRotationAngle(this.EarL, 0.0f, 0.4363f, 0.0f);
        this.Head.addChild(this.EarL);
        this.EarL.mirror = true;
        this.EarL.cubeList.add(new ModelBox(this.EarL, 24, 16, -0.4226f, -4.0f, 0.9063f, 0, 4, 4, 0.0f));
        this.AntennaR = new ModelRenderer(this);
        this.AntennaR.setRotationPoint(-1.25f, -6.0f, -4.5f);
        this.setRotationAngle(this.AntennaR, 0.1745f, 0.6981f, 0.0f);
        this.Head.addChild(this.AntennaR);
        this.AntennaR.cubeList.add(new ModelBox(this.AntennaR, 28, 16, -1.0f, -1.0f, -2.0f, 1, 1, 3, 0.0f));
        this.AntennaL = new ModelRenderer(this);
        this.AntennaL.setRotationPoint(1.25f, -6.0f, -4.5f);
        this.setRotationAngle(this.AntennaL, 0.1745f, -0.6981f, 0.0f);
        this.Head.addChild(this.AntennaL);
        this.AntennaL.mirror = true;
        this.AntennaL.cubeList.add(new ModelBox(this.AntennaL, 28, 16, 0.0f, -1.0f, -2.0f, 1, 1, 3, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 28, 28, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 32, 44, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 32, 0, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 32, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 16, 40, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef((float)this.scaleX, (float)this.scaleY, (float)this.scaleZ);
        GL11.glTranslatef((float)0.0f, (float)((float)((double)-1.04f + 5.5 / (1.0 + Math.pow(this.scaleY / 0.45f, 1.88f)))), (float)0.0f);
        this.Head.render(f5);
        this.Body.render(f5);
        GL11.glPopMatrix();
        this.Head.rotateAngleY = f3 / 57.295776f;
        this.Head.rotateAngleX = f4 / 57.295776f;
        this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 2.0f * f1 * 0.5f;
        this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662f) * 2.0f * f1 * 0.5f;
        this.RArm.rotateAngleZ = 0.0f;
        this.LArm.rotateAngleZ = 0.0f;
        this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662f) * 1.4f * f1;
        this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f1;
        this.RLeg.rotateAngleY = 0.0f;
        this.LLeg.rotateAngleY = 0.0f;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

