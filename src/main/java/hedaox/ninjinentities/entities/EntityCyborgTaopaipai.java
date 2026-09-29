/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCyborgTaopaipai
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityCyborgTaopaipai(World par1World) {
        super(par1World, 2, EntityDBCNinjin.MindState.AGGRESSIVE, false, false, new byte[]{3}, new byte[]{7});
        this.experienceValue = 80;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(180.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(18.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/cyborgTaopaipai.png";
    }
}

