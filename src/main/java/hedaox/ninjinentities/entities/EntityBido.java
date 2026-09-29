/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBido
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityBido(World par1World) {
        super(par1World, 10, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{3, 6, 1}, new byte[]{4, 4, 4});
        this.experienceValue = 80;
        this.setSize(0.63f, 1.89f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(9000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(900.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/bido.png";
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }
}

