/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityPiccoloDaimaoOld
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityPiccoloDaimaoOld(World par1World) {
        super(par1World, 1, EntityDBCNinjin.MindState.NEUTRAL, false, false, new byte[]{1, 3, 5}, new byte[]{4, 4, 4});
        this.experienceValue = 80;
        this.angerLevel = 400;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(217.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(21.7);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/piccoloDaimaoOld.png";
    }
}

