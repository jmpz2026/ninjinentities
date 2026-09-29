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
import org.lwjgl.opengl.GL11;

public class ModelBaba
extends ModelBase {
    private final ModelRenderer Tete;
    private final ModelRenderer Couronne_Chapeau;
    private final ModelRenderer Chapeau_1;
    private final ModelRenderer Chapeau_2;
    private final ModelRenderer Chapeau_3;
    private final ModelRenderer Corps;
    private final ModelRenderer Boule_Principale;
    private final ModelRenderer Boule_Cote_1;
    private final ModelRenderer Boule_Cote_2;
    private final ModelRenderer Boule_Cote_3;
    private final ModelRenderer Boucle_Cote_4;
    private final ModelRenderer Boule_Cote_5;
    private final ModelRenderer Gros_cul;
    private final ModelRenderer Main;
    private final ModelRenderer Bras_Gauche;
    private final ModelRenderer Bras_Droit;
    private final ModelRenderer Bras_Devant;
    private final ModelRenderer Epaule_Droite;
    private final ModelRenderer Epaule_Droite_2;
    private final ModelRenderer Epaule_Gauche;
    private final ModelRenderer Epaule_Gauche_2;
    private final ModelRenderer Dos;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelBaba(float _scaleX, float _scaleY, float _scaleZ) {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.Tete = new ModelRenderer(this);
        this.Tete.setRotationPoint(0.0f, 7.0f, 1.0f);
        this.Tete.cubeList.add(new ModelBox(this.Tete, 33, 33, -3.0f, -6.0f, -3.0f, 6, 6, 6, 0.0f));
        this.Couronne_Chapeau = new ModelRenderer(this);
        this.Couronne_Chapeau.setRotationPoint(11.0f, -7.0f, -1.0f);
        this.Tete.addChild(this.Couronne_Chapeau);
        this.Couronne_Chapeau.cubeList.add(new ModelBox(this.Couronne_Chapeau, 73, 1, -18.0f, 0.0f, -6.0f, 14, 1, 14, 0.0f));
        this.Chapeau_1 = new ModelRenderer(this);
        this.Chapeau_1.setRotationPoint(0.0f, -7.0f, -1.0f);
        this.Tete.addChild(this.Chapeau_1);
        this.Chapeau_1.cubeList.add(new ModelBox(this.Chapeau_1, 0, 22, -3.0f, -3.5f, -2.0f, 6, 4, 6, 0.0f));
        this.Chapeau_2 = new ModelRenderer(this);
        this.Chapeau_2.setRotationPoint(0.0f, -7.0f, -1.0f);
        this.Tete.addChild(this.Chapeau_2);
        this.Chapeau_2.cubeList.add(new ModelBox(this.Chapeau_2, 84, 24, -2.0f, -7.5f, -1.0f, 4, 4, 4, 0.0f));
        this.Chapeau_3 = new ModelRenderer(this);
        this.Chapeau_3.setRotationPoint(0.0f, -7.0f, -1.0f);
        this.Tete.addChild(this.Chapeau_3);
        this.Chapeau_3.cubeList.add(new ModelBox(this.Chapeau_3, 101, 28, -1.0f, -9.5f, 0.0f, 2, 2, 2, 0.0f));
        this.Corps = new ModelRenderer(this);
        this.Corps.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Boule_Principale = new ModelRenderer(this);
        this.Boule_Principale.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Boule_Principale);
        this.Boule_Principale.cubeList.add(new ModelBox(this.Boule_Principale, 0, 44, -5.0f, 11.0f, -4.0f, 10, 10, 10, 0.0f));
        this.Boule_Cote_1 = new ModelRenderer(this);
        this.Boule_Cote_1.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Boule_Cote_1);
        this.Boule_Cote_1.cubeList.add(new ModelBox(this.Boule_Cote_1, 98, 48, 4.5f, 12.0f, -3.0f, 1, 8, 8, 0.0f));
        this.Boule_Cote_2 = new ModelRenderer(this);
        this.Boule_Cote_2.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Boule_Cote_2);
        this.Boule_Cote_2.cubeList.add(new ModelBox(this.Boule_Cote_2, 59, 48, -5.5f, 12.0f, -3.0f, 1, 8, 8, 0.0f));
        this.Boule_Cote_3 = new ModelRenderer(this);
        this.Boule_Cote_3.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Boule_Cote_3);
        this.Boule_Cote_3.cubeList.add(new ModelBox(this.Boule_Cote_3, 41, 55, -4.0f, 12.0f, -4.5f, 8, 8, 1, 0.0f));
        this.Boucle_Cote_4 = new ModelRenderer(this);
        this.Boucle_Cote_4.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Boucle_Cote_4);
        this.Boucle_Cote_4.cubeList.add(new ModelBox(this.Boucle_Cote_4, 78, 55, -4.0f, 12.0f, 5.5f, 8, 8, 1, 0.0f));
        this.Boule_Cote_5 = new ModelRenderer(this);
        this.Boule_Cote_5.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Boule_Cote_5);
        this.Boule_Cote_5.cubeList.add(new ModelBox(this.Boule_Cote_5, 71, 46, -4.0f, 20.5f, -3.0f, 8, 1, 8, 0.0f));
        this.Gros_cul = new ModelRenderer(this);
        this.Gros_cul.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Gros_cul);
        this.Gros_cul.cubeList.add(new ModelBox(this.Gros_cul, 0, 33, -4.0f, 8.5f, -3.0f, 8, 3, 8, 0.0f));
        this.Main = new ModelRenderer(this);
        this.Main.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Main);
        this.Main.cubeList.add(new ModelBox(this.Main, 0, 18, -1.0f, 6.5f, -4.0f, 2, 2, 1, 0.0f));
        this.Bras_Gauche = new ModelRenderer(this);
        this.Bras_Gauche.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Bras_Gauche);
        this.Bras_Gauche.cubeList.add(new ModelBox(this.Bras_Gauche, 58, 25, 3.0f, 6.5f, -2.0f, 2, 2, 6, 0.0f));
        this.Bras_Droit = new ModelRenderer(this);
        this.Bras_Droit.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Bras_Droit);
        this.Bras_Droit.cubeList.add(new ModelBox(this.Bras_Droit, 58, 33, -5.0f, 6.5f, -2.0f, 2, 2, 6, 0.0f));
        this.Bras_Devant = new ModelRenderer(this);
        this.Bras_Devant.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Bras_Devant);
        this.Bras_Devant.cubeList.add(new ModelBox(this.Bras_Devant, 58, 42, -5.0f, 6.5f, -3.0f, 10, 2, 1, 0.0f));
        this.Epaule_Droite = new ModelRenderer(this);
        this.Epaule_Droite.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Epaule_Droite);
        this.Epaule_Droite.cubeList.add(new ModelBox(this.Epaule_Droite, 75, 34, -5.0f, 4.5f, 2.0f, 2, 2, 2, 0.0f));
        this.Epaule_Droite_2 = new ModelRenderer(this);
        this.Epaule_Droite_2.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Epaule_Droite_2);
        this.Epaule_Droite_2.cubeList.add(new ModelBox(this.Epaule_Droite_2, 75, 39, -5.0f, 5.5f, 1.0f, 2, 1, 1, 0.0f));
        this.Epaule_Gauche = new ModelRenderer(this);
        this.Epaule_Gauche.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Epaule_Gauche);
        this.Epaule_Gauche.cubeList.add(new ModelBox(this.Epaule_Gauche, 75, 26, 3.0f, 4.5f, 2.0f, 2, 2, 2, 0.0f));
        this.Epaule_Gauche_2 = new ModelRenderer(this);
        this.Epaule_Gauche_2.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Epaule_Gauche_2);
        this.Epaule_Gauche_2.cubeList.add(new ModelBox(this.Epaule_Gauche_2, 75, 31, 3.0f, 5.5f, 1.0f, 2, 1, 1, 0.0f));
        this.Dos = new ModelRenderer(this);
        this.Dos.setRotationPoint(0.0f, -24.0f, 0.0f);
        this.Corps.addChild(this.Dos);
        this.Dos.cubeList.add(new ModelBox(this.Dos, 27, 24, -3.0f, 6.5f, -2.0f, 6, 2, 6, 0.0f));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef((float)this.scaleX, (float)this.scaleY, (float)this.scaleZ);
        GL11.glTranslatef((float)0.0f, (float)((float)((double)-1.04f + 5.5 / (1.0 + Math.pow(this.scaleY / 0.45f, 1.88f)))), (float)0.0f);
        this.Tete.render(f5);
        this.Corps.render(f5);
        GL11.glPopMatrix();
        this.Tete.rotateAngleY = f3 / 57.295776f;
        this.Tete.rotateAngleX = f4 / 57.295776f;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

