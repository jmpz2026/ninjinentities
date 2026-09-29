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

public class ModelTambourine
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer bipedHeadwear;
    private final ModelRenderer bone2;
    private final ModelRenderer HeadChild_3;
    private final ModelRenderer HeadChild_1;
    private final ModelRenderer Body;
    private final ModelRenderer bone;
    private final ModelRenderer bb_main;
    private final ModelRenderer LeftWing;
    private final ModelRenderer RightWing;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelTambourine(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 105;
        this.textureHeight = 100;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 20, 34, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.bipedHeadwear = new ModelRenderer(this);
        this.bipedHeadwear.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.bipedHeadwear);
        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 0, 0, -0.25f, -10.0f, -4.0f, 0, 2, 8, 0.0f));
        this.bone2.cubeList.add(new ModelBox(this.bone2, 0, 12, 0.0f, -9.0f, 4.0f, 0, 9, 2, 0.0f));
        this.HeadChild_3 = new ModelRenderer(this);
        this.HeadChild_3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_3, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.HeadChild_3);
        this.HeadChild_3.cubeList.add(new ModelBox(this.HeadChild_3, 93, 90, 4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.HeadChild_1 = new ModelRenderer(this);
        this.HeadChild_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_1, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.HeadChild_1);
        this.HeadChild_1.cubeList.add(new ModelBox(this.HeadChild_1, 93, 90, -4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 36, 50, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Body.addChild(this.bone);
        this.bone.cubeList.add(new ModelBox(this.bone, 0, 25, 0.0f, -24.0f, 2.0f, 0, 10, 2, 0.0f));
        this.bb_main = new ModelRenderer(this);
        this.bb_main.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Body.addChild(this.bb_main);
        this.bb_main.cubeList.add(new ModelBox(this.bb_main, 20, 67, -4.5f, -13.6f, -2.4f, 9, 7, 5, 0.0f));
        this.LeftWing = new ModelRenderer(this);
        this.LeftWing.setRotationPoint(2.3f, 2.2f, 0.8f);
        this.setRotationAngle(this.LeftWing, 0.4098f, -0.0911f, -0.4098f);
        this.Body.addChild(this.LeftWing);
        this.LeftWing.cubeList.add(new ModelBox(this.LeftWing, 81, 0, 0.0f, 0.0f, 0.0f, 1, 16, 11, 0.0f));
        this.RightWing = new ModelRenderer(this);
        this.RightWing.setRotationPoint(-2.3f, 2.2f, 0.8f);
        this.setRotationAngle(this.RightWing, 0.4098f, 0.0911f, 0.4098f);
        this.Body.addChild(this.RightWing);
        this.RightWing.mirror = true;
        this.RightWing.cubeList.add(new ModelBox(this.RightWing, 81, 0, -1.0f, 0.0f, 0.0f, 1, 16, 11, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.0f, 2.0f, 0.0f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 60, 50, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(4.0f, 2.0f, 0.0f);
        this.Body.addChild(this.LArm);
        this.LArm.mirror = true;
        this.LArm.cubeList.add(new ModelBox(this.LArm, 60, 50, 0.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 20, 50, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.LLeg);
        this.LLeg.mirror = true;
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 20, 50, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

