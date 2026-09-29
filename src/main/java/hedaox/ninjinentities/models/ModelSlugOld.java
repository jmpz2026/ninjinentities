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

public class ModelSlugOld
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Helmet;
    private final ModelRenderer Body;
    private final ModelRenderer Ba;
    private final ModelRenderer bodyChild_6;
    private final ModelRenderer RArm;
    private final ModelRenderer rightarmshoulder;
    private final ModelRenderer LArm;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelSlugOld(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 20, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Helmet = new ModelRenderer(this);
        this.Helmet.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.Helmet);
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 24, 12, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.5f));
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 32, 28, -1.0f, -9.0f, -5.0f, 2, 2, 1, 0.0f));
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 16, 56, 4.0f, -5.0f, -3.0f, 1, 3, 4, 0.0f));
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 48, 12, -5.0f, -5.0f, -3.0f, 1, 3, 4, 0.0f));
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 26, 56, 4.0f, -2.0f, -4.0f, 1, 1, 4, 0.0f));
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 55, 40, -5.0f, -2.0f, -4.0f, 1, 1, 4, 0.0f));
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 28, 3, 4.0f, -1.0f, -5.0f, 1, 1, 2, 0.0f));
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 28, 0, -5.0f, -1.0f, -5.0f, 1, 1, 2, 0.0f));
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 0, 23, 4.0f, -6.0f, -2.0f, 1, 1, 2, 0.0f));
        this.Helmet.cubeList.add(new ModelBox(this.Helmet, 0, 20, -5.0f, -6.0f, -2.0f, 1, 1, 2, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 36, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.Ba = new ModelRenderer(this);
        this.Ba.setRotationPoint(3.5f, 18.4f, -3.2f);
        this.Body.addChild(this.Ba);
        this.Ba.cubeList.add(new ModelBox(this.Ba, 27, 31, -8.0f, -7.0f, 0.8f, 9, 10, 5, 0.0f));
        this.bodyChild_6 = new ModelRenderer(this);
        this.bodyChild_6.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild_6, 0.1571f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild_6);
        this.bodyChild_6.cubeList.add(new ModelBox(this.bodyChild_6, 0, 0, -7.0f, 1.0f, 2.0f, 14, 20, 0, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 55, 24, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.rightarmshoulder = new ModelRenderer(this);
        this.rightarmshoulder.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.rightarmshoulder, 0.0f, 0.0f, 0.1f);
        this.RArm.addChild(this.rightarmshoulder);
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 28, 0, -6.0f, -3.0f, -3.0f, 7, 4, 6, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 0, 52, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.leftarmshoulder, 0.0f, 0.0f, -0.1f);
        this.LArm.addChild(this.leftarmshoulder);
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 18, 46, -1.0f, -3.0f, -3.0f, 7, 4, 6, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 44, 46, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 54, 0, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

