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

public class ModelHatchiyack
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer bone5;
    private final ModelRenderer Crown1;
    private final ModelRenderer Crown2_1;
    private final ModelRenderer Crown2;
    private final ModelRenderer Crowngem;
    private final ModelRenderer Body;
    private final ModelRenderer bodyChild_1;
    private final ModelRenderer RArm;
    private final ModelRenderer bone3;
    private final ModelRenderer rightarmshoulder;
    private final ModelRenderer LArm;
    private final ModelRenderer bone4;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer RLeg;
    private final ModelRenderer bone;
    private final ModelRenderer LLeg;
    private final ModelRenderer bone2;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelHatchiyack(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Head.addChild(this.bone5);
        this.bone5.cubeList.add(new ModelBox(this.bone5, 0, 0, -4.0f, -33.0f, -2.0f, 8, 1, 6, 0.0f));
        this.bone5.cubeList.add(new ModelBox(this.bone5, 0, 0, -4.0f, -32.0f, -4.0f, 8, 8, 8, 0.5f));
        this.Crown1 = new ModelRenderer(this);
        this.Crown1.setRotationPoint(0.5f, -0.9f, -4.2f);
        this.setRotationAngle(this.Crown1, -0.6981f, 0.0f, 0.0f);
        this.Head.addChild(this.Crown1);
        this.Crown1.cubeList.add(new ModelBox(this.Crown1, 42, 19, -4.0f, -10.4088f, -3.8767f, 7, 5, 1, 0.5f));
        this.Crown2_1 = new ModelRenderer(this);
        this.Crown2_1.setRotationPoint(-1.9f, -0.8f, -1.0f);
        this.setRotationAngle(this.Crown2_1, 0.0f, 0.0f, 1.3271f);
        this.Head.addChild(this.Crown2_1);
        this.Crown2_1.cubeList.add(new ModelBox(this.Crown2_1, 0, 26, -5.9409f, -6.4826f, -4.0f, 1, 3, 1, 0.5f));
        this.Crown2 = new ModelRenderer(this);
        this.Crown2.setRotationPoint(3.5f, -7.5f, -1.0f);
        this.setRotationAngle(this.Crown2, 0.0f, 0.0f, -1.3273f);
        this.Head.addChild(this.Crown2);
        this.Crown2.cubeList.add(new ModelBox(this.Crown2, 0, 16, -2.059f, -6.4822f, -4.0f, 1, 3, 1, 0.5f));
        this.Crowngem = new ModelRenderer(this);
        this.Crowngem.setRotationPoint(3.5f, -0.9f, -4.7f);
        this.setRotationAngle(this.Crowngem, -0.6894f, 0.0f, 0.0f);
        this.Head.addChild(this.Crowngem);
        this.Crowngem.cubeList.add(new ModelBox(this.Crowngem, 25, 16, -4.5f, -9.5433f, -5.2721f, 2, 3, 1, 0.3f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 16, -5.0f, 0.0f, -2.0f, 10, 5, 5, 0.0f));
        this.bodyChild_1 = new ModelRenderer(this);
        this.bodyChild_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild_1);
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 0, 26, -3.5f, 5.0f, -2.0f, 7, 7, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.RArm, -0.0231f, 0.0f, 0.0791f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 0, 37, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(5.0f, 22.0f, 0.0f);
        this.RArm.addChild(this.bone3);
        this.bone3.cubeList.add(new ModelBox(this.bone3, 24, 0, -9.3553f, -16.7112f, -0.8085f, 1, 3, 2, 0.0f));
        this.rightarmshoulder = new ModelRenderer(this);
        this.rightarmshoulder.setRotationPoint(0.0f, 0.0f, -0.6f);
        this.setRotationAngle(this.rightarmshoulder, 0.0f, 0.0f, 0.1f);
        this.RArm.addChild(this.rightarmshoulder);
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 26, 25, -5.0f, -2.8398f, -1.9984f, 5, 3, 5, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.LArm, 0.0231f, 0.0f, -0.0791f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 32, 0, 0.0031f, -2.079f, -1.9982f, 4, 12, 4, 0.0f));
        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(-5.0f, 22.0f, 0.0f);
        this.LArm.addChild(this.bone4);
        this.bone4.cubeList.add(new ModelBox(this.bone4, 0, 0, 8.3522f, -16.6322f, -1.1934f, 1, 3, 2, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(0.0f, 0.0f, -0.5f);
        this.setRotationAngle(this.leftarmshoulder, 0.0f, 0.0f, -0.1f);
        this.LArm.addChild(this.leftarmshoulder);
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 43, 10, 0.0815f, -2.7938f, -2.0021f, 5, 3, 5, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 18, 33, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(2.0f, 13.0f, 0.0f);
        this.setRotationAngle(this.bone, -0.1745f, 0.0f, 0.0f);
        this.RLeg.addChild(this.bone);
        this.bone.cubeList.add(new ModelBox(this.bone, 18, 26, -3.0f, -6.0f, -3.0f, 2, 3, 1, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 34, 34, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(2.0f, 13.0f, 0.0f);
        this.setRotationAngle(this.bone2, -0.1745f, 0.0f, 0.0f);
        this.LLeg.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 24, 26, -3.0f, -6.0f, -3.0f, 2, 3, 1, 0.0f));
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

