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

public class ModelAngol
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer bone;
    private final ModelRenderer HeadChild_2;
    private final ModelRenderer HeadChild_1;
    private final ModelRenderer Nose;
    private final ModelRenderer Body;
    private final ModelRenderer Skilt;
    private final ModelRenderer RArm;
    private final ModelRenderer LLeg;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelAngol(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.bone);
        this.HeadChild_2 = new ModelRenderer(this);
        this.HeadChild_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_2, 0.0f, 0.5236f, 0.0f);
        this.bone.addChild(this.HeadChild_2);
        this.HeadChild_2.cubeList.add(new ModelBox(this.HeadChild_2, 52, 9, 4.5f, -6.0f, -1.866f, 0, 4, 6, 0.0f));
        this.HeadChild_1 = new ModelRenderer(this);
        this.HeadChild_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_1, 0.0f, -0.5236f, 0.0f);
        this.bone.addChild(this.HeadChild_1);
        this.HeadChild_1.cubeList.add(new ModelBox(this.HeadChild_1, 52, 9, -4.5f, -6.0f, -1.866f, 0, 4, 6, 0.0f));
        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(1.0f, -1.3125f, -4.0f);
        this.setRotationAngle(this.Nose, 0.6109f, 0.0f, 0.0f);
        this.Head.addChild(this.Nose);
        this.Nose.cubeList.add(new ModelBox(this.Nose, 47, 0, -2.0f, -2.0f, -2.0f, 2, 2, 4, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.Skilt = new ModelRenderer(this);
        this.Skilt.setRotationPoint(3.5f, 18.4f, -3.2f);
        this.Body.addChild(this.Skilt);
        this.Skilt.cubeList.add(new ModelBox(this.Skilt, 32, 1, -8.0f, -9.0f, 0.8f, 9, 7, 5, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.LLeg);
        this.LLeg.mirror = true;
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.LArm);
        this.LArm.mirror = true;
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

