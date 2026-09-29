/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityKoguSuper
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityKoguSuper(World par1World) {
        super(par1World, 10, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{1, 5}, new byte[]{4, 4});
        this.experienceValue = 80;
        this.setSize(0.66f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(12000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1200.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/koguSuper.png";
    }
}

