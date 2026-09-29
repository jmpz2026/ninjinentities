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

public class ModelEbifurya
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Hair;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Hair4;
    private final ModelRenderer Hair5;
    private final ModelRenderer EarL;
    private final ModelRenderer EarR;
    private final ModelRenderer PonyTail;
    private final ModelRenderer PT1;
    private final ModelRenderer PT2;
    private final ModelRenderer PT3;
    private final ModelRenderer PT4;
    private final ModelRenderer PT5;
    private final ModelRenderer PT6;
    private final ModelRenderer PT7;
    private final ModelRenderer PT8;
    private final ModelRenderer Body;
    private final ModelRenderer Armor;
    private final ModelRenderer bodyChild_1;
    private final ModelRenderer bodyChild_3;
    private final ModelRenderer bodyChild_2;
    private final ModelRenderer bodyChild;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelEbifurya(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Hair = new ModelRenderer(this);
        this.Hair.setRotationPoint(0.0f, 1.0f, -3.0f);
        this.Head.addChild(this.Hair);
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 43, 16, -1.0f, -5.0152f, 7.8263f, 2, 2, 0, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 47, 47, -1.0f, -11.8264f, 6.9848f, 2, 7, 3, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 24, 22, -1.0f, -12.8264f, -1.0152f, 2, 4, 8, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 42, 13, -1.0f, -10.8264f, -1.0152f, 2, 2, 9, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 49, 20, -1.0f, -10.8264f, 5.9848f, 2, 6, 2, 0.0f));
        this.EarL = new ModelRenderer(this);
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarL, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.EarL);
        this.EarL.cubeList.add(new ModelBox(this.EarL, 0, 52, 4.0f, -7.0f, -1.0f, 0, 6, 6, 0.0f));
        this.EarR = new ModelRenderer(this);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarR, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.EarR);
        this.EarR.cubeList.add(new ModelBox(this.EarR, 0, 52, -4.0f, -7.0f, -1.0f, 0, 6, 6, 0.0f));
        this.PonyTail = new ModelRenderer(this);
        this.PonyTail.setRotationPoint(0.0f, 23.3125f, 0.4375f);
        this.Head.addChild(this.PonyTail);
        this.PT1 = new ModelRenderer(this);
        this.PT1.setRotationPoint(0.0f, -24.7582f, 4.5047f);
        this.setRotationAngle(this.PT1, 0.1745f, 0.0f, 0.0f);
        this.PonyTail.addChild(this.PT1);
        this.PT1.cubeList.add(new ModelBox(this.PT1, 43, 18, -1.0f, -0.5f, -0.5f, 2, 9, 1, 0.0f));
        this.PT2 = new ModelRenderer(this);
        this.PT2.setRotationPoint(0.125f, -24.7582f, 4.5047f);
        this.setRotationAngle(this.PT2, 0.1745f, 0.0f, -0.2618f);
        this.PonyTail.addChild(this.PT2);
        this.PT2.cubeList.add(new ModelBox(this.PT2, 43, 18, -1.0f, -0.5f, -0.5f, 2, 8, 1, 0.0f));
        this.PT3 = new ModelRenderer(this);
        this.PT3.setRotationPoint(-0.125f, -24.7582f, 4.5047f);
        this.setRotationAngle(this.PT3, 0.1745f, 0.0f, 0.2618f);
        this.PonyTail.addChild(this.PT3);
        this.PT3.cubeList.add(new ModelBox(this.PT3, 43, 18, -1.0f, -0.5f, -0.5f, 2, 6, 1, 0.0f));
        this.PT4 = new ModelRenderer(this);
        this.PT4.setRotationPoint(0.0f, -24.7582f, 4.5047f);
        this.setRotationAngle(this.PT4, 0.3491f, 0.0f, 0.0f);
        this.PonyTail.addChild(this.PT4);
        this.PT4.cubeList.add(new ModelBox(this.PT4, 43, 18, -1.0f, -0.5f, -0.5f, 2, 7, 1, 0.0f));
        this.PT5 = new ModelRenderer(this);
        this.PT5.setRotationPoint(0.0f, -24.7582f, 4.5047f);
        this.setRotationAngle(this.PT5, 0.0f, 0.0f, 0.1745f);
        this.PonyTail.addChild(this.PT5);
        this.PT5.cubeList.add(new ModelBox(this.PT5, 43, 18, -1.0f, -0.5f, -0.5f, 2, 8, 1, 0.0f));
        this.PT6 = new ModelRenderer(this);
        this.PT6.setRotationPoint(0.125f, -24.7582f, 4.5047f);
        this.setRotationAngle(this.PT6, 0.1745f, 0.0f, -0.5236f);
        this.PonyTail.addChild(this.PT6);
        this.PT6.cubeList.add(new ModelBox(this.PT6, 43, 18, -1.0f, -0.5f, -0.5f, 2, 6, 1, 0.0f));
        this.PT7 = new ModelRenderer(this);
        this.PT7.setRotationPoint(-0.125f, -24.7582f, 4.5047f);
        this.setRotationAngle(this.PT7, 0.1745f, 0.0f, 0.5236f);
        this.PonyTail.addChild(this.PT7);
        this.PT7.cubeList.add(new ModelBox(this.PT7, 43, 18, -1.0f, -0.5f, -0.5f, 2, 5, 1, 0.0f));
        this.PT8 = new ModelRenderer(this);
        this.PT8.setRotationPoint(0.0f, -24.7582f, 4.5047f);
        this.setRotationAngle(this.PT8, 0.5236f, 0.0f, 0.0f);
        this.PonyTail.addChild(this.PT8);
        this.PT8.cubeList.add(new ModelBox(this.PT8, 43, 18, -1.0f, -0.5f, -0.5f, 2, 4, 1, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 16, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.Armor = new ModelRenderer(this);
        this.Armor.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addChild(this.Armor);
        this.bodyChild_1 = new ModelRenderer(this);
        this.bodyChild_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Armor.addChild(this.bodyChild_1);
        this.bodyChild_3 = new ModelRenderer(this);
        this.bodyChild_3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild_3, 0.5236f, 0.0f, 0.0f);
        this.Armor.addChild(this.bodyChild_3);
        this.bodyChild_2 = new ModelRenderer(this);
        this.bodyChild_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild_2, -0.3491f, 0.0f, 0.0f);
        this.Armor.addChild(this.bodyChild_2);
        this.bodyChild = new ModelRenderer(this);
        this.bodyChild.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild, -0.1745f, 0.0f, 0.0f);
        this.Armor.addChild(this.bodyChild);
        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, 0.1745f);
        this.Armor.addChild(this.bone5);
        this.bone5.cubeList.add(new ModelBox(this.bone5, 24, 0, 4.0f, -3.0f, -2.0f, 1, 3, 1, 0.0f));
        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(0.0f, 0.0f, 4.0f);
        this.setRotationAngle(this.bone6, 0.0f, 0.0f, 0.1745f);
        this.Armor.addChild(this.bone6);
        this.bone6.cubeList.add(new ModelBox(this.bone6, 0, 16, 4.0f, -3.0f, -3.0f, 1, 3, 1, 0.0f));
        this.bone7 = new ModelRenderer(this);
        this.bone7.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bone7, 0.0f, 0.0f, -0.1745f);
        this.Armor.addChild(this.bone7);
        this.bone7.cubeList.add(new ModelBox(this.bone7, 3, 3, -5.0f, -3.0f, -2.0f, 1, 3, 1, 0.0f));
        this.bone7.cubeList.add(new ModelBox(this.bone7, 0, 0, -5.0f, -3.0f, 2.0f, 1, 3, 1, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 0, 37, -3.0031f, -2.079f, -2.0018f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 32, 0, -0.9938f, -2.158f, -1.9964f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 18, 34, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 34, 34, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

