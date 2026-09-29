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

public class ModelDore
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer HeadGear;
    private final ModelRenderer Body;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Hair4;
    private final ModelRenderer Hair5;
    private final ModelRenderer Hair6;
    private final ModelRenderer Hair7;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelDore(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.HeadGear = new ModelRenderer(this);
        this.HeadGear.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.HeadGear);
        this.HeadGear.cubeList.add(new ModelBox(this.HeadGear, 32, 44, -4.0f, -8.0f, -4.0f, 8, 7, 8, 0.5f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 28, 28, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(5.0f, 2.0f, -0.5f);
        this.setRotationAngle(this.leftarmshoulder, 0.0f, 0.0f, -0.1f);
        this.Body.addChild(this.leftarmshoulder);
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 27, 11, -1.0f, -3.0f, -2.0f, 7, 4, 5, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 46, 0, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 16, 40, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 32, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 48, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(1.0f, 0.0f, 3.0f);
        this.setRotationAngle(this.Hair1, 0.3491f, 0.0f, 0.0f);
        this.Body.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 5, 18, -5.0f, -1.1496f, -0.4111f, 8, 11, 2, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(3.1875f, 0.9375f, 3.0f);
        this.setRotationAngle(this.Hair2, 0.3491f, -0.2618f, 0.7854f);
        this.Body.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 7, 24, -3.0f, -1.1496f, -0.4111f, 6, 3, 2, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(3.1875f, 5.9375f, 5.0f);
        this.setRotationAngle(this.Hair3, 0.3491f, -0.2618f, 0.7854f);
        this.Body.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 7, 22, -3.0f, -1.1496f, -0.4111f, 6, 7, 2, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(-3.1875f, 0.9375f, 3.0f);
        this.setRotationAngle(this.Hair4, 0.3491f, 0.2618f, -0.7854f);
        this.Body.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 7, 24, -3.0f, -1.1496f, -0.4111f, 6, 3, 2, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(-3.1875f, 5.9375f, 5.0f);
        this.setRotationAngle(this.Hair5, 0.3491f, 0.2618f, -0.7854f);
        this.Body.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 7, 21, -3.0f, -1.1496f, -0.4111f, 6, 7, 2, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(-0.1875f, 0.9375f, 4.0f);
        this.setRotationAngle(this.Hair6, 0.0f, 0.6109f, -1.5708f);
        this.Body.addChild(this.Hair6);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 5, 21, -3.0f, -2.1496f, -2.4111f, 6, 6, 4, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(-0.1875f, 5.9375f, 6.0f);
        this.setRotationAngle(this.Hair7, 0.0f, 0.6109f, -1.5708f);
        this.Body.addChild(this.Hair7);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 6, 22, -3.0f, -2.1496f, -1.4111f, 6, 6, 3, 0.0f));
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

