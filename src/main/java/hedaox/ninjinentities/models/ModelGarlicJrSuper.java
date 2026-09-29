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

public class ModelGarlicJrSuper
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Ear2;
    private final ModelRenderer Ear;
    private final ModelRenderer Body;
    private final ModelRenderer Body2;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelGarlicJrSuper(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Ear2 = new ModelRenderer(this);
        this.Ear2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.Ear2, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.Ear2);
        this.Ear2.cubeList.add(new ModelBox(this.Ear2, 22, 11, 4.0f, -7.0f, -1.0f, 0, 4, 6, 0.0f));
        this.Ear = new ModelRenderer(this);
        this.Ear.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.Ear, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.Ear);
        this.Ear.cubeList.add(new ModelBox(this.Ear, 22, 11, -4.0f, -7.0f, -1.0f, 0, 4, 6, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-3.8f, 5.4f, 3.8f);
        this.Body.cubeList.add(new ModelBox(this.Body, 32, 0, -1.2f, -5.4f, -6.8f, 10, 7, 6, 0.0f));
        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(3.8f, -4.4f, -3.8f);
        this.Body.addChild(this.Body2);
        this.Body2.cubeList.add(new ModelBox(this.Body2, 16, 16, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-1.2f, -3.4f, -3.8f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -5.0f, -2.0f, -2.0f, 5, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(8.8f, -3.4f, -3.8f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, 0.0f, -2.0f, -2.0f, 5, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(1.8f, 6.6f, -3.8f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(5.8f, 6.6f, -3.8f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

