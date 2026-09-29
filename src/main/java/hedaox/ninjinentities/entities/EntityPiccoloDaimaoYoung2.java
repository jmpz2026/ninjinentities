/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityPiccoloDaimaoYoung2
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityPiccoloDaimaoYoung2(World par1World) {
        super(par1World, 1, EntityDBCNinjin.MindState.AGGRESSIVE, false, false, new byte[]{1, 3, 5}, new byte[]{4, 4, 4});
        this.experienceValue = 80;
        this.angerLevel = 400;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(230.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(23.5);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/piccoloDaimaoYoung.png";
    }
}

