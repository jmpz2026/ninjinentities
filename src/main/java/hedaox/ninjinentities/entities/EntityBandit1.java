/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Npcs.EntityDBCWildlife;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityBandit1
extends EntityDBCWildlife {
    public int randomSoundDelay = 0;

    public EntityBandit1(World par1World) {
        super(par1World);
        this.experienceValue = 80;
        this.angerLevel = 400;
        this.setSize(0.864f, 2.16f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(140.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(14.0);
    }

    @Override
    protected boolean canDespawn() {
        return true;
    }

    @Override
    public void onUpdate() {
        if (this.randomSoundDelay <= 0 || --this.randomSoundDelay == 0) {
            // empty if block
        }
        super.onUpdate();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/bandit1.png";
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("Anger", (short)this.angerLevel);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.angerLevel = par1NBTTagCompound.getShort("Anger");
    }

    @Override
    protected Entity findPlayerToAttack() {
        return this.angerLevel == 0 ? null : super.findPlayerToAttack();
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }

    @Override
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
        if (this.isEntityInvulnerable()) {
            return false;
        }
        Entity var3 = par1DamageSource.getEntity();
        if (var3 instanceof EntityPlayer) {
            List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0, 32.0, 32.0));
            for (int var5 = 0; var5 < var4.size(); ++var5) {
                Entity var6 = (Entity)var4.get(var5);
                if (!(var6 instanceof EntityBandit1)) continue;
                EntityBandit1 var7 = (EntityBandit1)var6;
                var7.becomeAngryAt(var3);
            }
            this.becomeAngryAt(var3);
        }
        return super.attackEntityFrom(par1DamageSource, par2);
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
        }
    }

    @Override
    public boolean interact(EntityPlayer par1EntityPlayer) {
        return false;
    }
}

