/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBojackSuper
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityBojackSuper(World par1World) {
        super(par1World, 10, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{3, 5, 1}, new byte[]{6, 6, 6});
        this.experienceValue = 80;
        this.setSize(0.72f, 2.07f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(17000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1700.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/bojackSuper.png";
    }
}

