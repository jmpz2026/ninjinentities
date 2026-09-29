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

public class ModelRaditzNinjin
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Hair4;
    private final ModelRenderer Hair5;
    private final ModelRenderer Hair6;
    private final ModelRenderer Hair7;
    private final ModelRenderer Hair8;
    private final ModelRenderer Hair9;
    private final ModelRenderer Hair10;
    private final ModelRenderer Hair11;
    private final ModelRenderer Hair12;
    private final ModelRenderer Hair13;
    private final ModelRenderer Hair14;
    private final ModelRenderer Hair15;
    private final ModelRenderer Hair16;
    private final ModelRenderer Hair17;
    private final ModelRenderer Hair18;
    private final ModelRenderer Hair19;
    private final ModelRenderer Strand1;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer RShoulderArmor;
    private final ModelRenderer LArm;
    private final ModelRenderer LShoulderArmor;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scale = 1.0f;

    public ModelRaditzNinjin(float _scale) {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.scale = _scale;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(-1.0f, -9.0f, 0.0f);
        this.setRotationAngle(this.Hair1, -1.309f, 0.0f, 0.6109f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 42, 2, -0.5133f, -7.474f, -2.0714f, 4, 9, 4, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-3.0f, -10.0f, 0.0f);
        this.setRotationAngle(this.Hair2, -0.3491f, 0.0f, 0.2618f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 45, 2, 0.0603f, -2.658f, -3.0f, 3, 6, 3, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(1.0f, -8.0f, 0.0f);
        this.setRotationAngle(this.Hair3, -0.3491f, 0.0f, -0.0873f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 45, 2, 0.0603f, -3.342f, -3.0f, 3, 6, 3, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(2.0f, -7.0f, 0.0f);
        this.setRotationAngle(this.Hair4, 0.0f, 0.0873f, 0.2618f);
        this.Head.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 45, 2, 1.0603f, -3.342f, -3.0f, 2, 6, 3, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(-5.0f, -6.0f, -2.0f);
        this.setRotationAngle(this.Hair5, 2.7925f, 0.0873f, -0.6109f);
        this.Head.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 45, 2, -0.0028f, -3.971f, -3.2188f, 3, 6, 3, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair6, -1.2218f, 0.0f, -0.4363f);
        this.Head.addChild(this.Hair6);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 45, 2, 1.8099f, -2.1257f, -2.2188f, 3, 6, 3, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(-1.0f, -10.0f, 4.0f);
        this.setRotationAngle(this.Hair7, -0.8727f, 0.0f, 0.5236f);
        this.Head.addChild(this.Hair7);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 45, 2, 1.8099f, -1.4417f, -5.0982f, 3, 5, 5, 0.0f));
        this.Hair8 = new ModelRenderer(this);
        this.Hair8.setRotationPoint(-5.0f, -7.0f, 2.0f);
        this.setRotationAngle(this.Hair8, 2.7925f, 0.0873f, -0.4363f);
        this.Head.addChild(this.Hair8);
        this.Hair8.cubeList.add(new ModelBox(this.Hair8, 45, 2, -0.0028f, -3.971f, -3.2188f, 3, 6, 3, 0.0f));
        this.Hair9 = new ModelRenderer(this);
        this.Hair9.setRotationPoint(3.0f, -8.0f, 2.0f);
        this.setRotationAngle(this.Hair9, 2.7925f, 0.0873f, 0.5236f);
        this.Head.addChild(this.Hair9);
        this.Hair9.cubeList.add(new ModelBox(this.Hair9, 45, 2, -0.0028f, -3.971f, -3.2188f, 3, 6, 3, 0.0f));
        this.Hair10 = new ModelRenderer(this);
        this.Hair10.setRotationPoint(0.0f, -2.0f, 6.0f);
        this.setRotationAngle(this.Hair10, -2.7053f, 0.3491f, 0.0f);
        this.Head.addChild(this.Hair10);
        this.Hair10.cubeList.add(new ModelBox(this.Hair10, 43, 2, 0.9972f, -6.6289f, -0.1585f, 3, 10, 3, 0.0f));
        this.Hair11 = new ModelRenderer(this);
        this.Hair11.setRotationPoint(-4.0f, -2.0f, 4.0f);
        this.setRotationAngle(this.Hair11, -2.7053f, -0.2618f, 0.0f);
        this.Head.addChild(this.Hair11);
        this.Hair11.cubeList.add(new ModelBox(this.Hair11, 42, 2, 0.9972f, -5.6289f, -1.1585f, 3, 10, 3, 0.0f));
        this.Hair12 = new ModelRenderer(this);
        this.Hair12.setRotationPoint(-4.0f, -2.0f, 4.0f);
        this.setRotationAngle(this.Hair12, -2.7053f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair12);
        this.Hair12.cubeList.add(new ModelBox(this.Hair12, 42, 2, 1.9972f, -5.6289f, -4.1585f, 4, 10, 3, 0.0f));
        this.Hair13 = new ModelRenderer(this);
        this.Hair13.setRotationPoint(-4.0f, -2.0f, 4.0f);
        this.setRotationAngle(this.Hair13, 3.1416f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair13);
        this.Hair13.cubeList.add(new ModelBox(this.Hair13, 42, 2, 0.9972f, -11.6289f, -3.1585f, 6, 10, 3, 0.0f));
        this.Hair14 = new ModelRenderer(this);
        this.Hair14.setRotationPoint(-4.0f, -2.0f, 4.0f);
        this.setRotationAngle(this.Hair14, -2.7053f, 0.1745f, -0.2618f);
        this.Head.addChild(this.Hair14);
        this.Hair14.cubeList.add(new ModelBox(this.Hair14, 42, 2, 4.9972f, -8.6289f, -2.1585f, 4, 10, 3, 0.0f));
        this.Hair15 = new ModelRenderer(this);
        this.Hair15.setRotationPoint(4.0f, -2.0f, 4.0f);
        this.setRotationAngle(this.Hair15, -2.7053f, -0.1745f, 0.5236f);
        this.Head.addChild(this.Hair15);
        this.Hair15.cubeList.add(new ModelBox(this.Hair15, 42, 2, -8.9972f, -8.6289f, -2.1585f, 4, 10, 3, 0.0f));
        this.Hair16 = new ModelRenderer(this);
        this.Hair16.setRotationPoint(4.0f, -2.0f, 4.0f);
        this.setRotationAngle(this.Hair16, -2.7053f, -0.1745f, 0.9599f);
        this.Head.addChild(this.Hair16);
        this.Hair16.cubeList.add(new ModelBox(this.Hair16, 42, 2, -8.9972f, -8.6289f, 0.8415f, 3, 7, 3, 0.0f));
        this.Hair17 = new ModelRenderer(this);
        this.Hair17.setRotationPoint(-4.0f, -2.0f, 4.0f);
        this.setRotationAngle(this.Hair17, -2.7053f, 0.1745f, -0.9599f);
        this.Head.addChild(this.Hair17);
        this.Hair17.cubeList.add(new ModelBox(this.Hair17, 42, 2, 5.9972f, -8.6289f, 0.8415f, 3, 7, 3, 0.0f));
        this.Hair18 = new ModelRenderer(this);
        this.Hair18.setRotationPoint(0.3f, -6.0f, 4.0f);
        this.setRotationAngle(this.Hair18, -2.9671f, -0.1745f, 0.0873f);
        this.Head.addChild(this.Hair18);
        this.Hair18.cubeList.add(new ModelBox(this.Hair18, 42, 2, -3.9972f, -14.6289f, -2.1585f, 3, 9, 3, 0.0f));
        this.Hair19 = new ModelRenderer(this);
        this.Hair19.setRotationPoint(0.0f, -4.0f, 4.0f);
        this.setRotationAngle(this.Hair19, -2.9671f, 0.1745f, -0.0873f);
        this.Head.addChild(this.Hair19);
        this.Hair19.cubeList.add(new ModelBox(this.Hair19, 42, 2, 0.9972f, -13.6289f, -2.1585f, 3, 8, 3, 0.0f));
        this.Strand1 = new ModelRenderer(this);
        this.Strand1.setRotationPoint(-5.0f, -13.5f, -0.3f);
        this.setRotationAngle(this.Strand1, -0.2618f, 0.0f, 0.0f);
        this.Head.addChild(this.Strand1);
        this.Strand1.cubeList.add(new ModelBox(this.Strand1, 38, 2, 3.9972f, 3.029f, -2.2188f, 2, 5, 2, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.2f, 5.4f, -0.2f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -4.2f, -5.4f, -1.8f, 8, 12, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RShoulderArmor = new ModelRenderer(this);
        this.RShoulderArmor.setRotationPoint(-3.0f, -1.7f, 0.0f);
        this.setRotationAngle(this.RShoulderArmor, -1.5708f, 0.0f, 0.1047f);
        this.RArm.addChild(this.RShoulderArmor);
        this.RShoulderArmor.cubeList.add(new ModelBox(this.RShoulderArmor, 24, 0, -3.0f, -3.0f, -1.0f, 6, 6, 2, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.LArm.mirror = true;
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, 8.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LShoulderArmor = new ModelRenderer(this);
        this.LShoulderArmor.setRotationPoint(11.0f, -1.7f, 0.0f);
        this.LShoulderArmor.mirror = true;
        this.setRotationAngle(this.LShoulderArmor, -1.5708f, 0.0f, -0.1047f);
        this.LArm.addChild(this.LShoulderArmor);
        this.LShoulderArmor.cubeList.add(new ModelBox(this.LShoulderArmor, 24, 0, -3.0f, -3.0f, -1.0f, 6, 6, 2, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.LLeg.mirror = true;
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, 2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef((float)this.scale, (float)this.scale, (float)this.scale);
        GL11.glTranslatef((float)0.0f, (float)((float)((double)-1.04f + 5.5 / (1.0 + Math.pow(this.scale / 0.45f, 1.88f)))), (float)0.0f);
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

