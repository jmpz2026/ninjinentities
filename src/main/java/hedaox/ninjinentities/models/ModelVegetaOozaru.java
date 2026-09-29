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

public class ModelVegetaOozaru
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Snout;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer RShoulderArmor;
    private final ModelRenderer LArm;
    private final ModelRenderer LShoulderArmor;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private final ModelRenderer Tail;
    private float scale = 1.0f;

    public ModelVegetaOozaru(float _scale) {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.scale = _scale;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(1.0f, -5.0f, -2.0f);
        this.Head.addChild(this.Snout);
        this.Snout.cubeList.add(new ModelBox(this.Snout, 50, 2, -3.0f, 2.0f, -5.0f, 4, 3, 3, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-3.8f, 5.4f, 3.8f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -0.2f, -5.4f, -5.8f, 8, 12, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-0.2f, -3.4f, -3.8f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RShoulderArmor = new ModelRenderer(this);
        this.RShoulderArmor.setRotationPoint(0.0f, -2.0f, 0.0f);
        this.setRotationAngle(this.RShoulderArmor, -1.5708f, 0.0f, 0.0873f);
        this.RArm.addChild(this.RShoulderArmor);
        this.RShoulderArmor.mirror = true;
        this.RShoulderArmor.cubeList.add(new ModelBox(this.RShoulderArmor, 26, 0, -6.0f, -3.0f, 0.0f, 6, 6, 2, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(7.8f, -3.4f, -3.8f);
        this.Body.addChild(this.LArm);
        this.LArm.mirror = true;
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, 0.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LShoulderArmor = new ModelRenderer(this);
        this.LShoulderArmor.setRotationPoint(0.0f, -2.0f, 0.0f);
        this.setRotationAngle(this.LShoulderArmor, -1.5708f, 0.0f, -0.0873f);
        this.LArm.addChild(this.LShoulderArmor);
        this.LShoulderArmor.cubeList.add(new ModelBox(this.LShoulderArmor, 26, 0, 0.0f, -3.0f, 0.0f, 6, 6, 2, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(1.8f, 6.6f, -3.8f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(5.8f, 6.6f, -3.8f);
        this.Body.addChild(this.LLeg);
        this.LLeg.mirror = true;
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(4.0f, 6.0f, -2.0f);
        this.setRotationAngle(this.Tail, -0.7854f, 0.0f, 0.0f);
        this.Body.addChild(this.Tail);
        this.Tail.cubeList.add(new ModelBox(this.Tail, 32, 0, -1.4f, -1.4f, -0.8f, 2, 2, 12, 0.0f));
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

