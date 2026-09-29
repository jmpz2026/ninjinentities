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

public class ModelHatchiyackSuper
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Crown1;
    private final ModelRenderer Crown2_1;
    private final ModelRenderer Crown2;
    private final ModelRenderer Crowngem;
    private final ModelRenderer Body;
    private final ModelRenderer bodyChild_1;
    private final ModelRenderer bodyChild_3;
    private final ModelRenderer bodyChild_2;
    private final ModelRenderer bodyChild;
    private final ModelRenderer RArm;
    private final ModelRenderer bone3;
    private final ModelRenderer rightarmshoulder;
    private final ModelRenderer LArm;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer RLeg;
    private final ModelRenderer bone;
    private final ModelRenderer LLeg;
    private final ModelRenderer bone2;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelHatchiyackSuper(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Crown1 = new ModelRenderer(this);
        this.Crown1.setRotationPoint(0.5f, -0.9f, -4.2f);
        this.setRotationAngle(this.Crown1, -0.6981f, 0.0f, 0.0f);
        this.Head.addChild(this.Crown1);
        this.Crown1.cubeList.add(new ModelBox(this.Crown1, 48, 9, -4.0f, -10.4088f, -3.8767f, 7, 5, 1, 0.5f));
        this.Crown2_1 = new ModelRenderer(this);
        this.Crown2_1.setRotationPoint(-1.9f, -0.8f, -1.0f);
        this.setRotationAngle(this.Crown2_1, 0.0f, 0.0f, 1.3271f);
        this.Head.addChild(this.Crown2_1);
        this.Crown2_1.cubeList.add(new ModelBox(this.Crown2_1, 20, 34, -5.9409f, -6.4826f, -4.0f, 1, 3, 1, 0.5f));
        this.Crown2 = new ModelRenderer(this);
        this.Crown2.setRotationPoint(3.5f, -7.5f, -1.0f);
        this.setRotationAngle(this.Crown2, 0.0f, 0.0f, -1.3273f);
        this.Head.addChild(this.Crown2);
        this.Crown2.cubeList.add(new ModelBox(this.Crown2, 20, 30, -2.059f, -6.4822f, -4.0f, 1, 3, 1, 0.5f));
        this.Crowngem = new ModelRenderer(this);
        this.Crowngem.setRotationPoint(3.5f, -0.9f, -4.7f);
        this.setRotationAngle(this.Crowngem, -0.6894f, 0.0f, 0.0f);
        this.Head.addChild(this.Crowngem);
        this.Crowngem.cubeList.add(new ModelBox(this.Crowngem, 32, 54, -4.5f, -9.5433f, -5.2721f, 2, 3, 1, 0.3f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 16, -5.0f, 0.0f, -2.0f, 10, 5, 5, 0.0f));
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 71, -4.0f, 0.0f, -3.0f, 8, 5, 5, 0.0f));
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 26, -3.0f, 5.0f, -3.0f, 1, 3, 1, 0.0f));
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 16, 2.0f, 5.0f, -3.0f, 1, 3, 1, 0.0f));
        this.bodyChild_1 = new ModelRenderer(this);
        this.bodyChild_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild_1);
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 46, 19, -3.5f, 5.0f, -2.0f, 7, 7, 4, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 55, 38, 3.0f, 8.0f, -2.0f, 1, 2, 4, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 54, 0, -4.0f, 8.0f, -2.0f, 1, 2, 4, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 46, 52, -4.0f, 8.0f, -3.0f, 8, 2, 1, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 24, 4, -3.0f, 10.0f, -3.0f, 6, 1, 1, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 52, 30, -2.0f, 11.0f, -3.0f, 4, 1, 1, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 0, 6, -1.0f, 5.0f, -3.0f, 2, 1, 1, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 12, 43, -1.0f, 1.0f, -4.0f, 2, 3, 1, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 24, 2, -3.0f, 5.0f, 2.0f, 6, 1, 1, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 28, 52, -2.0f, 6.0f, 2.0f, 4, 1, 1, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 20, 26, -2.0f, 11.0f, 2.0f, 4, 1, 1, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 24, 0, -3.0f, 10.0f, 2.0f, 6, 1, 1, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 50, 35, -4.0f, 8.0f, 2.0f, 8, 2, 1, 0.0f));
        this.bodyChild_3 = new ModelRenderer(this);
        this.bodyChild_3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild_3, 0.5236f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild_3);
        this.bodyChild_2 = new ModelRenderer(this);
        this.bodyChild_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild_2, -0.3491f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild_2);
        this.bodyChild = new ModelRenderer(this);
        this.bodyChild.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild, -0.1745f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild);
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.RArm, -0.0231f, 0.0f, 0.0791f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 20, 35, -5.0f, -2.0f, -2.0f, 5, 12, 5, 0.0f));
        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(5.0f, 22.0f, 0.0f);
        this.RArm.addChild(this.bone3);
        this.bone3.cubeList.add(new ModelBox(this.bone3, 50, 62, -10.3522f, -16.6322f, -0.8067f, 1, 3, 2, 0.0f));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 40, 40, -11.1487f, -17.7562f, -3.0406f, 4, 5, 7, 0.0f));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 52, 32, -10.6683f, -18.6186f, -0.8988f, 1, 1, 2, 0.0f));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 40, 40, -11.3491f, -16.5532f, -0.8048f, 1, 3, 2, 0.0f));
        this.rightarmshoulder = new ModelRenderer(this);
        this.rightarmshoulder.setRotationPoint(0.0f, 0.0f, -0.6f);
        this.setRotationAngle(this.rightarmshoulder, 0.0f, 0.0f, 0.1f);
        this.RArm.addChild(this.rightarmshoulder);
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 32, 0, -8.0f, -2.8398f, -1.9984f, 8, 3, 6, 0.0f));
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 30, 19, -7.0f, -3.595f, -1.0654f, 6, 1, 3, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.LArm, 0.0231f, 0.0f, -0.0791f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 0, 26, 0.0f, -2.0f, -2.0f, 5, 12, 5, 0.0f));
        this.LArm.cubeList.add(new ModelBox(this.LArm, 0, 59, 4.3491f, 5.4468f, -1.1952f, 1, 3, 3, 0.0f));
        this.LArm.cubeList.add(new ModelBox(this.LArm, 32, 52, 2.0f, 4.1648f, -2.9576f, 4, 5, 6, 0.0f));
        this.LArm.cubeList.add(new ModelBox(this.LArm, 15, 26, 4.6652f, 3.4604f, -1.1031f, 1, 1, 3, 0.0f));
        this.LArm.cubeList.add(new ModelBox(this.LArm, 0, 0, 5.346f, 5.5258f, -1.197f, 1, 3, 3, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(0.0f, 0.0f, -0.5f);
        this.setRotationAngle(this.leftarmshoulder, 0.0f, 0.0f, -0.1f);
        this.LArm.addChild(this.leftarmshoulder);
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 26, 10, 0.0815f, -2.7938f, -2.0021f, 8, 3, 6, 0.0f));
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 35, 35, 1.0f, -3.4169f, -0.9364f, 6, 1, 3, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 43, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 54, 15, -1.0f, 7.0f, -3.0f, 2, 3, 1, 0.0f));
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 8, 59, -3.0f, 4.0f, -1.0f, 1, 3, 2, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(2.0f, 13.0f, 0.0f);
        this.setRotationAngle(this.bone, -0.1745f, 0.0f, 0.0f);
        this.RLeg.addChild(this.bone);
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 16, 52, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 60, 0, -1.0f, 7.0f, -3.0f, 2, 3, 1, 0.0f));
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 60, 30, 2.0f, 4.0f, -1.0f, 1, 3, 2, 0.0f));
        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(2.0f, 13.0f, 0.0f);
        this.setRotationAngle(this.bone2, -0.1745f, 0.0f, 0.0f);
        this.LLeg.addChild(this.bone2);
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

