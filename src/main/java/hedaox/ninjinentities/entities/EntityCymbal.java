/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCymbal
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityCymbal(World par1World) {
        super(par1World, 1, EntityDBCNinjin.MindState.AGGRESSIVE, false, false, new byte[]{1}, new byte[]{4});
        this.experienceValue = 80;
        this.angerLevel = 400;
        this.setSize(0.87f, 1.98f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(202.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.2);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/cymbal.png";
    }
}

