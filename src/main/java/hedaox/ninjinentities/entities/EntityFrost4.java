/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.entity.EntityEnergyAtt;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import java.util.List;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityFrost4
extends EntityDBCNinjin {
    public EntityFrost4(World par1World) {
        super(par1World, 5, EntityDBCNinjin.MindState.NEUTRAL, false, false, new byte[]{3, 1, 5}, new byte[]{4, 4, 4});
        this.experienceValue = 80;
        this.angerLevel = 400;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/frost4.png";
    }

    @Override
    protected void updateEntityActionState() {
        if (this.mindState == EntityDBCNinjin.MindState.PACIFIC) {
            this.angerLevel = 0;
        }
        if (this.angerLevel > 0) {
            this.fallDistance = 0.0f;
            this.prevAttackCounter = this.attackCounter;
            if (this.targetedEntity != null && this.targetedEntity.isDead) {
                this.targetedEntity = null;
                this.dataWatcher.updateObject(23, 0);
                super.updateEntityActionState();
            }
            if (this.targetedEntity == null || this.aggroCooldown-- <= 0) {
                this.targetedEntity = this.worldObj.getClosestVulnerablePlayerToEntity(this, 100.0);
                super.updateEntityActionState();
                if (this.targetedEntity != null) {
                    this.dataWatcher.updateObject(23, this.targetedEntity.getEntityId());
                    this.aggroCooldown = 20;
                }
            }
            float r = this.width / 2.0f + 3.5f;
            if (this.entityToAttack != null && this.entityToAttack.isEntityAlive() && this.entityToAttack.getDistanceToEntity(this) < r) {
                AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox(this.posX - (double)r, this.posY - (double)r, this.posZ - (double)r, this.posX + (double)r, this.posY + (double)r, this.posZ + (double)r);
                List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                if (this.attackTime <= 0) {
                    for (int i = 0; i < list.size(); ++i) {
                        EntityPlayer player = (EntityPlayer)list.get(i);
                        this.attackEntityAsMob(player);
                        player.addPotionEffect(new PotionEffect(Potion.poison.id, 200, 20));
                    }
                    this.attackTime = 35;
                    this.worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC3.force", 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                }
            }
            double d4 = 64.0;
            if (this.targetedEntity != null && this.targetedEntity.getDistanceSqToEntity(this) < d4 * d4) {
                double d5 = this.targetedEntity.posX - this.posX;
                double d7 = this.targetedEntity.posZ - this.posZ;
                this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0f / (float)Math.PI;
                if (this.canEntityBeSeen(this.targetedEntity)) {
                    if (this.attackCounter == 10) {
                        // empty if block
                    }
                    ++this.attackCounter;
                    if (this.attackCounter == 80) {
                        this.worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC2.basicbeam_fire", 0.5f, 1.0f);
                        byte type = 1;
                        byte speed = 1;
                        byte effect = 1;
                        byte color = 3;
                        if (this.alignment < 33) {
                            color = 4;
                        } else if (this.alignment > 66) {
                            color = 2;
                        }
                        byte density = 1;
                        byte sincantation = 0;
                        byte sfire = 0;
                        byte smove = 0;
                        byte[] sts = JRMCoreH.techDBCstatsDefault;
                        int dmg = 50;
                        int f = (int)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
                        int dmg1 = (int)((float)f * 1.2f);
                        int cst = dmg1 / 2;
                        EntityEnergyAtt entityball = new EntityEnergyAtt(this, type, speed, dmg, effect, color, density, sincantation, sfire, smove, (byte)50, dmg1, cst, sts, (byte)0);
                        double d8 = (double)this.width + 0.5;
                        Vec3 vec3 = this.getLook(1.0f);
                        entityball.posX = this.posX + vec3.xCoord * d8;
                        entityball.posY = this.posY + (double)(this.height / 2.0f) + 0.5;
                        entityball.posZ = this.posZ + vec3.zCoord * d8;
                        this.worldObj.spawnEntityInWorld(entityball);
                        this.attackCounter = -40;
                    }
                } else if (this.attackCounter > 0) {
                    --this.attackCounter;
                }
            } else if (this.attackCounter > 0) {
                --this.attackCounter;
            }
        } else {
            super.updateEntityActionState();
        }
    }
}

