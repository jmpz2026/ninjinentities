/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBergamoNinjin
extends EntityDBCNinjin {
    public EntityBergamoNinjin(World par1World) {
        super(par1World, 20, EntityDBCNinjin.MindState.NEUTRAL, false, true, new byte[]{1, 3, 6}, new byte[]{2, 2, 2});
        this.experienceValue = 80;
        this.setSize(0.66f, 1.98f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/bergamo.png";
    }
}

