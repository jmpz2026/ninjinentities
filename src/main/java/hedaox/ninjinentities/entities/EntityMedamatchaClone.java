/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityMedamatchaClone
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityMedamatchaClone(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.AGGRESSIVE, false, false, new byte[]{1}, new byte[]{7});
        this.experienceValue = 80;
        this.setSize(0.55f, 0.81f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(800.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(80.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/medamatchaClone.png";
    }
}

