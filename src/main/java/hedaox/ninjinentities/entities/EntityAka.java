/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAka
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityAka(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{5, 1, 5}, new byte[]{6, 6, 4});
        this.experienceValue = 80;
        this.setSize(0.81f, 2.16f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(18000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1800.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/aka.png";
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }
}

