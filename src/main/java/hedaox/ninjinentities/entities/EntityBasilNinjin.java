/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBasilNinjin
extends EntityDBCNinjin {
    public EntityBasilNinjin(World par1World) {
        super(par1World, 20, EntityDBCNinjin.MindState.NEUTRAL, false, true, new byte[]{1, 3, 6}, new byte[]{4, 4, 4});
        this.experienceValue = 80;
        this.setSize(0.6f, 1.8f);
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
        return "ninjinentities:textures/entity/basil.png";
    }
}

