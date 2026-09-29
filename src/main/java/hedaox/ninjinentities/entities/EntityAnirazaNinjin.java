/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAnirazaNinjin
extends EntityDBCNinjin {
    public EntityAnirazaNinjin(World par1World) {
        super(par1World, 85, EntityDBCNinjin.MindState.NEUTRAL, false, true, new byte[]{3, 5}, new byte[]{4, 4});
        this.experienceValue = 80;
        this.setSize(1.08f, 3.24f);
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
        return "ninjinentities:textures/entity/aniraza.png";
    }
}

