/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegetoSsjb
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityVegetoSsjb(World par1World) {
        super(par1World, 85, EntityDBCNinjin.MindState.NEUTRAL, true, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{7, 7, 2, 2, 7, 2}, 50.0f, 255.0f, 255.0f, false, true, 50.0f, 200.0f, 255.0f);
        this.experienceValue = 80;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/vegetoSsjb.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.GiFighter2Torso, 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.GiFighter2Leg, 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.GiFighter2Boots, 1);
        }
    }
}

