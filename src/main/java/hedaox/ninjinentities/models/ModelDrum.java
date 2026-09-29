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

public class ModelDrum
extends ModelBase {
    private final ModelRenderer Body;
    private final ModelRenderer bone3;
    private final ModelRenderer RArm;
    private final ModelRenderer rightarmshoulder;
    private final ModelRenderer LArm;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private final ModelRenderer bb_main;
    private final ModelRenderer Head;
    private final ModelRenderer HeadChild_2;
    private final ModelRenderer HeadChild_3;
    private final ModelRenderer HeadChild_1;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelDrum(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 90;
        this.textureHeight = 90;
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 13, 13, -6.0f, 0.0f, -3.0f, 12, 12, 6, 0.0f));
        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Body.addChild(this.bone3);
        this.bone3.cubeList.add(new ModelBox(this.bone3, 72, 48, 0.0f, -23.0f, 3.0f, 0, 10, 2, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.RArm, -0.0086f, 0.0f, 0.0873f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 55, 28, -5.0f, -2.0f, -2.0f, 4, 11, 4, 0.0f));
        this.rightarmshoulder = new ModelRenderer(this);
        this.rightarmshoulder.setRotationPoint(0.0f, 0.0f, -0.6f);
        this.setRotationAngle(this.rightarmshoulder, 0.0f, 0.0f, 0.1f);
        this.RArm.addChild(this.rightarmshoulder);
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.LArm, 0.0086f, 0.0f, -0.0873f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 49, 13, 1.0f, -2.0f, -2.0f, 4, 11, 4, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(0.0f, 0.0f, -0.5f);
        this.setRotationAngle(this.leftarmshoulder, 0.0f, 0.0f, -0.1f);
        this.LArm.addChild(this.leftarmshoulder);
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 13, 47, -3.0f, 0.0f, -3.0f, 5, 12, 6, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 39, 41, -1.9f, 0.0f, -3.0f, 5, 12, 6, 0.0f));
        this.bb_main = new ModelRenderer(this);
        this.bb_main.setRotationPoint(0.0f, 34.0f, 0.0f);
        this.Body.addChild(this.bb_main);
        this.bb_main.cubeList.add(new ModelBox(this.bb_main, 7, 70, -6.0f, -24.0f, -4.0f, 12, 7, 8, 0.0f));
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 13, 31, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.5f));
        this.HeadChild_2 = new ModelRenderer(this);
        this.HeadChild_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_2, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.HeadChild_2);
        this.HeadChild_3 = new ModelRenderer(this);
        this.HeadChild_3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_3, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.HeadChild_3);
        this.HeadChild_3.cubeList.add(new ModelBox(this.HeadChild_3, 37, 29, 4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.HeadChild_1 = new ModelRenderer(this);
        this.HeadChild_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_1, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.HeadChild_1);
        this.HeadChild_1.cubeList.add(new ModelBox(this.HeadChild_1, 37, 29, -4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0f, 1.0f, -1.0f);
        this.setRotationAngle(this.bone, -0.1745f, 0.0f, 0.0f);
        this.Head.addChild(this.bone);
        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 57, 65, 0.0f, -10.0f, -4.0f, 0, 2, 9, 0.0f));
        this.bone2.cubeList.add(new ModelBox(this.bone2, 72, 47, 0.0f, -10.0f, 4.0f, 0, 10, 2, 0.0f));
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

