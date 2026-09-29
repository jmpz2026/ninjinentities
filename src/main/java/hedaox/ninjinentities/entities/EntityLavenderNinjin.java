/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityLavenderNinjin
extends EntityDBCNinjin {
    public EntityLavenderNinjin(World par1World) {
        super(par1World, 20, EntityDBCNinjin.MindState.NEUTRAL, false, true, new byte[]{3, 3}, new byte[]{7, 3});
        this.experienceValue = 80;
        this.setSize(0.48f, 1.44f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2500.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/lavender.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
        }
    }
}

