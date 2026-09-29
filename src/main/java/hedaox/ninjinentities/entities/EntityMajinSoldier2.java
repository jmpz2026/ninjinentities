/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityMajinSoldier2
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityMajinSoldier2(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.NEUTRAL, false, false, new byte[]{1}, new byte[]{4});
        this.experienceValue = 80;
        this.setSize(0.69f, 1.98f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(500.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/majinSoldier2.png";
    }
}

