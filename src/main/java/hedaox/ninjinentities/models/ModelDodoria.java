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

public class ModelDodoria
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer headChild_19;
    private final ModelRenderer headChild_14;
    private final ModelRenderer headChild_18;
    private final ModelRenderer headChild_11;
    private final ModelRenderer headChild_12;
    private final ModelRenderer headChild_17;
    private final ModelRenderer headChild_20;
    private final ModelRenderer headChild_13;
    private final ModelRenderer headChild_15;
    private final ModelRenderer headChild_16;
    private final ModelRenderer Body;
    private final ModelRenderer rightarmshoulder;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelDodoria(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.headChild_19 = new ModelRenderer(this);
        this.headChild_19.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.headChild_19, -0.4014f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_19);
        this.headChild_19.cubeList.add(new ModelBox(this.headChild_19, 12, 32, -5.0f, -5.0f, -3.0f, 1, 3, 2, 0.0f));
        this.headChild_14 = new ModelRenderer(this);
        this.headChild_14.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_14);
        this.headChild_14.cubeList.add(new ModelBox(this.headChild_14, 18, 32, -2.0f, -10.0f, -2.0f, 1, 3, 1, 0.0f));
        this.headChild_18 = new ModelRenderer(this);
        this.headChild_18.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_18);
        this.headChild_18.cubeList.add(new ModelBox(this.headChild_18, 18, 32, -4.0f, -10.0f, -1.0f, 1, 3, 1, 0.0f));
        this.headChild_11 = new ModelRenderer(this);
        this.headChild_11.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_11);
        this.headChild_11.cubeList.add(new ModelBox(this.headChild_11, 18, 32, 0.0f, -10.0f, 0.0f, 1, 3, 1, 0.0f));
        this.headChild_12 = new ModelRenderer(this);
        this.headChild_12.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_12);
        this.headChild_12.cubeList.add(new ModelBox(this.headChild_12, 18, 32, 3.0f, -10.0f, 1.0f, 1, 3, 1, 0.0f));
        this.headChild_17 = new ModelRenderer(this);
        this.headChild_17.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_17);
        this.headChild_17.cubeList.add(new ModelBox(this.headChild_17, 18, 32, -1.0f, -10.0f, -4.0f, 1, 3, 1, 0.0f));
        this.headChild_20 = new ModelRenderer(this);
        this.headChild_20.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.headChild_20, -0.4014f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_20);
        this.headChild_20.cubeList.add(new ModelBox(this.headChild_20, 12, 32, 4.0f, -5.0f, -3.0f, 1, 3, 2, 0.0f));
        this.headChild_13 = new ModelRenderer(this);
        this.headChild_13.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_13);
        this.headChild_13.cubeList.add(new ModelBox(this.headChild_13, 18, 32, 2.0f, -10.0f, -3.0f, 1, 3, 1, 0.0f));
        this.headChild_15 = new ModelRenderer(this);
        this.headChild_15.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_15);
        this.headChild_15.cubeList.add(new ModelBox(this.headChild_15, 18, 32, -3.0f, -10.0f, 2.0f, 1, 3, 1, 0.0f));
        this.headChild_16 = new ModelRenderer(this);
        this.headChild_16.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.headChild_16);
        this.headChild_16.cubeList.add(new ModelBox(this.headChild_16, 18, 32, 1.0f, -10.0f, 3.0f, 1, 3, 1, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -4.0f, 0.0f, -2.0f, 8, 12, 4, 1.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.RArm, 0.0f, 0.0f, 0.1f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -3.995f, -1.9002f, -2.0f, 4, 12, 4, 0.0f));
        this.rightarmshoulder = new ModelRenderer(this);
        this.rightarmshoulder.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.RArm.addChild(this.rightarmshoulder);
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 40, 32, -6.995f, -2.9002f, -3.0f, 7, 4, 6, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.LArm, 0.0f, 0.0f, -0.1f);
        this.Body.addChild(this.LArm);
        this.LArm.mirror = true;
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, -0.005f, -1.9002f, -2.0f, 4, 12, 4, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LArm.addChild(this.leftarmshoulder);
        this.leftarmshoulder.mirror = true;
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 40, 32, -0.005f, -2.9002f, -3.0f, 7, 4, 6, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.LLeg);
        this.LLeg.mirror = true;
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

