/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.EntityDBCNeut;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntityCusPar;
import JinRyuu.JRMCore.entity.EntityEnergyAtt;
import hedaox.ninjinentities.Main;
import hedaox.ninjinentities.network.MessageSendEntityToSpark;
import java.util.List;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public class EntityDBCNinjin
extends EntityDBCNeut {
    private EntityPlayer spwner = null;
    private int noSpwnr = DBCConfig.mdat;
    public int angerLevel = 0;
    protected int aggroCooldown = 0;
    public int prevAttackCounter = 0;
    public int attackCounter = 0;
    protected Entity targetedEntity = null;
    private byte data1 = 1;
    private byte data2 = 0;
    private byte data3 = 0;
    private byte data4 = 0;
    private byte[] attacksType = new byte[]{1};
    private byte[] attacksColor = new byte[]{0};
    private boolean blst = false;
    public int alignment = 83;
    public boolean isTrainer = false;
    public boolean hasAnAura = false;
    public float auraRed = 100.0f;
    public float auraGreen = 125.0f;
    public float auraBlue = 255.0f;
    public float auraRed2 = 100.0f;
    public float auraGreen2 = 125.0f;
    public float auraBlue2 = 255.0f;
    public MindState mindState = MindState.NEUTRAL;
    public boolean canTeleport = false;
    private int wait = 0;
    private int m = 1;
    private int rang = 0;
    public boolean auraLightning = false;
    private int lightningCount = 0;
    private static double random = Math.random();
    public boolean hasAGodAura = false;
    private boolean updtd = false;

    public EntityDBCNinjin(World par1World) {
        super(par1World);
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors) {
        super(par1World);
        this.alignment = _alignment;
        this.isTrainer = _isTrainer;
        this.mindState = _mindState;
        this.canTeleport = _canTeleport;
        this.attacksType = _attacksType;
        this.attacksColor = _attacksColors;
        if (this.mindState == MindState.AGGRESSIVE) {
            this.angerLevel = 400;
        }
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, boolean _hasAnAura) {
        super(par1World);
        this.alignment = _alignment;
        this.isTrainer = _isTrainer;
        this.mindState = _mindState;
        this.canTeleport = _canTeleport;
        this.attacksType = _attacksType;
        this.attacksColor = _attacksColors;
        if (this.mindState == MindState.AGGRESSIVE) {
            this.angerLevel = 400;
        }
        this.hasAnAura = _hasAnAura;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue) {
        super(par1World);
        this.alignment = _alignment;
        this.isTrainer = _isTrainer;
        this.mindState = _mindState;
        this.canTeleport = _canTeleport;
        this.attacksType = _attacksType;
        this.attacksColor = _attacksColors;
        if (this.mindState == MindState.AGGRESSIVE) {
            this.angerLevel = 400;
        }
        this.auraRed = _auraRed;
        this.auraGreen = _auraGreen;
        this.auraBlue = _auraBlue;
        this.hasAnAura = true;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning) {
        super(par1World);
        this.alignment = _alignment;
        this.isTrainer = _isTrainer;
        this.mindState = _mindState;
        this.canTeleport = _canTeleport;
        this.attacksType = _attacksType;
        this.attacksColor = _attacksColors;
        if (this.mindState == MindState.AGGRESSIVE) {
            this.angerLevel = 400;
        }
        this.auraRed = _auraRed;
        this.auraGreen = _auraGreen;
        this.auraBlue = _auraBlue;
        this.hasAnAura = true;
        this.auraLightning = _auraLightning;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning, boolean _auraGod) {
        super(par1World);
        this.alignment = _alignment;
        this.isTrainer = _isTrainer;
        this.mindState = _mindState;
        this.canTeleport = _canTeleport;
        this.attacksType = _attacksType;
        this.attacksColor = _attacksColors;
        if (this.mindState == MindState.AGGRESSIVE) {
            this.angerLevel = 400;
        }
        this.auraRed = _auraRed;
        this.auraGreen = _auraGreen;
        this.auraBlue = _auraBlue;
        this.hasAnAura = false;
        this.auraLightning = _auraLightning;
        this.hasAGodAura = _auraGod;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning, boolean _auraGod, float _auraRed2, float _auraGreen2, float _auraBlue2) {
        super(par1World);
        this.alignment = _alignment;
        this.isTrainer = _isTrainer;
        this.mindState = _mindState;
        this.canTeleport = _canTeleport;
        this.attacksType = _attacksType;
        this.attacksColor = _attacksColors;
        if (this.mindState == MindState.AGGRESSIVE) {
            this.angerLevel = 400;
        }
        this.auraRed = _auraRed;
        this.auraGreen = _auraGreen;
        this.auraBlue = _auraBlue;
        this.auraRed2 = _auraRed2;
        this.auraGreen2 = _auraGreen2;
        this.auraBlue2 = _auraBlue2;
        this.hasAnAura = false;
        this.auraLightning = _auraLightning;
        this.hasAGodAura = _auraGod;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning, boolean _auraGod, float _auraRed2, float _auraGreen2, float _auraBlue2, boolean _hasAnAura) {
        super(par1World);
        this.alignment = _alignment;
        this.isTrainer = _isTrainer;
        this.mindState = _mindState;
        this.canTeleport = _canTeleport;
        this.attacksType = _attacksType;
        this.attacksColor = _attacksColors;
        if (this.mindState == MindState.AGGRESSIVE) {
            this.angerLevel = 400;
        }
        this.auraRed = _auraRed;
        this.auraGreen = _auraGreen;
        this.auraBlue = _auraBlue;
        this.auraRed2 = _auraRed2;
        this.auraGreen2 = _auraGreen2;
        this.auraBlue2 = _auraBlue2;
        this.hasAnAura = _hasAnAura;
        this.auraLightning = _auraLightning;
        this.hasAGodAura = _auraGod;
    }

    @Override
    protected void updateEntityActionState() {
        if (this.mindState == MindState.PACIFIC) {
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
                    }
                    this.attackTime = 35;
                    this.worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC3.force", 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                }
            }
            double d4 = 64.0;
            if (this.targetedEntity != null && this.targetedEntity.getDistanceSqToEntity(this) < d4 * d4) {
                double d5 = this.targetedEntity.posX - this.posX;
                double d6 = this.targetedEntity.boundingBox.minY + (double)(this.targetedEntity.height / 2.0f) - (this.posY + (double)(this.height / 2.0f));
                double d7 = this.targetedEntity.posZ - this.posZ;
                this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0f / (float)Math.PI;
                if (this.canEntityBeSeen(this.targetedEntity)) {
                    ++this.attackCounter;
                    if (this.attackCounter == 80) {
                        this.worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC2.basicbeam_fire", 0.5f, 1.0f);
                        byte type = 4;
                        byte color = 5;
                        if (this.attacksType.length == 1) {
                            type = this.attacksType[0];
                            color = this.attacksColor[0];
                        } else {
                            int rand = (int)(Math.random() * (double)this.attacksType.length);
                            for (int i = 0; i < this.attacksType.length; ++i) {
                                if (rand != i) continue;
                                type = this.attacksType[i];
                                color = this.attacksColor[i];
                            }
                        }
                        this.data1 = type;
                        this.data2 = color;
                        byte speed = 1;
                        byte effect = 1;
                        byte density = 1;
                        byte sincantation = 0;
                        byte sfire = 0;
                        byte smove = 0;
                        byte[] sts = JRMCoreH.techDBCstatsDefault;
                        int dmg = (int)(50.0f / (this.data1 == 6 ? 5.0f : 1.0f));
                        int f = (int)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
                        int dmg1 = (int)((float)f * 1.2f / (this.data1 == 6 ? 5.0f : 1.0f));
                        int cst = dmg1 / 2;
                        EntityEnergyAtt entityball = this.data3 == 0 ? new EntityEnergyAtt(this, type, speed, dmg, effect, color, density, sincantation, sfire, smove, (byte)50, dmg1, cst, sts, (byte)0) : new EntityEnergyAtt(this, type, speed, dmg, effect, color, this.data4, density, sincantation, sfire, smove, (byte)50, dmg1, cst, sts, (byte)0);
                        double d8 = (double)this.width + 0.5;
                        Vec3 vec3 = this.getLook(1.0f);
                        entityball.posX = this.posX + vec3.xCoord * d8;
                        entityball.posY = this.posY + (double)(this.height / 2.0f) + 0.5;
                        entityball.posZ = this.posZ + vec3.zCoord * d8;
                        this.worldObj.spawnEntityInWorld(entityball);
                        if (this.data1 != 6 || (int)(Math.random() * 8.0) == 0) {
                            this.attackCounter = -40;
                            this.blst = true;
                        } else {
                            this.attackCounter = 70;
                            this.blst = false;
                        }
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

    @Override
    protected NBTTagCompound nbt(EntityPlayer p, String s) {
        NBTTagCompound nbt;
        if (s.contains("pres")) {
            if (!p.getEntityData().hasKey("PlayerPersisted")) {
                nbt = new NBTTagCompound();
                p.getEntityData().setTag("PlayerPersisted", nbt);
            } else {
                nbt = p.getEntityData().getCompoundTag("PlayerPersisted");
            }
        } else {
            nbt = p.getEntityData();
        }
        return nbt;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7f);
    }

    @Override
    public void onDeath(DamageSource par1DamageSource) {
        Entity entitySource = par1DamageSource.getEntity();
        if (entitySource instanceof EntityPlayer) {
            List listCloseEntities = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0, 32.0, 32.0));
            for (int i = 0; i < listCloseEntities.size(); ++i) {
                Entity entity = (Entity)listCloseEntities.get(i);
                if (!(entity instanceof EntityDBCNinjin)) continue;
                EntityDBCNinjin entityTrain = (EntityDBCNinjin)entity;
                entityTrain.becomeAngryAt(entitySource);
            }
            this.becomeAngryAt(entitySource);
        }
        if (entitySource instanceof EntityPlayer) {
            int e = 1;
            if (entitySource instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer)entitySource;
                JRMCoreH.expPls(player, e);
            }
        }
        if (ForgeHooks.onLivingDeath(this, par1DamageSource)) {
            return;
        }
        Entity entity = par1DamageSource.getEntity();
        EntityLivingBase entitylivingbase = this.func_94060_bK();
        if (this.scoreValue >= 0 && entitylivingbase != null) {
            entitylivingbase.addToPlayerScore(this, this.scoreValue);
        }
        if (entity != null) {
            entity.onKillEntity(this);
        }
        this.dead = true;
        this.getCombatTracker().func_94549_h();
        if (!this.worldObj.isRemote) {
            int i = 0;
            if (entity instanceof EntityPlayer) {
                i = EnchantmentHelper.getLootingModifier((EntityLivingBase)entity);
            }
            this.captureDrops = true;
            this.capturedDrops.clear();
            int j = 0;
            if (this.func_146066_aG() && this.worldObj.getGameRules().getGameRuleBooleanValue("doMobLoot")) {
                this.dropFewItems(this.recentlyHit > 0, i);
                this.dropEquipment(this.recentlyHit > 0, i);
                if (this.recentlyHit > 0 && (j = this.rand.nextInt(200) - i) < 5) {
                    this.dropRareDrop(j <= 0 ? 1 : 0);
                }
            }
            this.captureDrops = false;
            if (!ForgeHooks.onLivingDrops(this, par1DamageSource, this.capturedDrops, i, this.recentlyHit > 0, j)) {
                for (EntityItem item : this.capturedDrops) {
                    this.worldObj.spawnEntityInWorld(item);
                }
            }
        }
        this.worldObj.setEntityState(this, (byte)3);
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
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
        if (this.isEntityInvulnerable()) {
            return false;
        }
        Entity entitySource = par1DamageSource.getEntity();
        if (entitySource instanceof EntityPlayer) {
            List listCloseEntities = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0, 32.0, 32.0));
            for (int i = 0; i < listCloseEntities.size(); ++i) {
                Entity entity = (Entity)listCloseEntities.get(i);
                if (!(entity instanceof EntityDBCNinjin)) continue;
                EntityDBCNinjin entityTrain = (EntityDBCNinjin)entity;
                entityTrain.becomeAngryAt(entitySource);
            }
            this.becomeAngryAt(entitySource);
        }
        return super.attackEntityFrom(par1DamageSource, par2);
    }

    @Override
    public void onLivingUpdate() {
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8 && this.angerLevel >= 400 && (this.hasAnAura || this.auraLightning || this.hasAGodAura)) {
            for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                EntityDBCNinjin pl = this;
                float red = this.auraRed;
                float green = this.auraGreen;
                float blue = this.auraBlue;
                float red2 = this.auraRed2;
                float green2 = this.auraGreen2;
                float blue2 = this.auraBlue2;
                float life = 0.8f * pl.height;
                float extra_scale = 1.0f + (pl.height > 2.1f ? pl.height / 2.0f : 0.0f) / 5.0f;
                double x = (Math.random() * 1.0 - 0.5) * (double)(this.width * 1.2f);
                double y = Math.random() * (double)(this.height * 1.4f) - (double)(this.height / 2.0f) - (double)0.3f;
                double z = (Math.random() * 1.0 - 0.5) * (double)(this.width * 1.2f);
                double motx = Math.random() * (double)0.02f - (double)0.01f;
                double moty = (Math.random() * (double)0.9f + (double)0.9f) * ((double)(life * extra_scale) * 0.07);
                double motz = Math.random() * (double)0.02f - (double)0.01f;
                for (int i = 0; i < 5; ++i) {
                    x = (Math.random() * 1.0 - 0.5) * (double)(this.width * 1.2f);
                    y = Math.random() * (double)(this.height * 1.4f) - (double)(this.height / 2.0f) - (double)0.3f;
                    z = (Math.random() * 1.0 - 0.5) * (double)(this.width * 1.2f);
                    motx = Math.random() * (double)0.02f - (double)0.01f;
                    moty = (Math.random() * (double)0.9f + (double)0.9f) * ((double)(life * extra_scale) * 0.07);
                    motz = Math.random() * (double)0.02f - (double)0.01f;
                    if (!this.hasAnAura) continue;
                    EntityCusPar entity = new EntityCusPar("jinryuumodscore:bens_particles.png", pl.worldObj, 0.2f, 0.2f, pl.posX, pl.posY + (double)((Entity)pl instanceof EntityPlayerSP ? -1.6f : 0.0f), pl.posZ, x, y, z, motx, moty, motz, 0.0f, (int)(Math.random() * 3.0) + 32, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", (int)(30.0f * life * 0.5f), 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * extra_scale, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * extra_scale, 0.2f * life * extra_scale, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.08f, false, -1, true, pl);
                    pl.worldObj.spawnEntityInWorld(entity);
                    EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", pl.worldObj, 0.2f, 0.2f, pl.posX, pl.posY + (double)((Entity)pl instanceof EntityPlayerSP ? -1.6f : 0.0f), pl.posZ, x, y, z, motx, moty, motz, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", (int)(30.0f * life * 0.5f), 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * extra_scale, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * extra_scale, 0.1f * life * extra_scale, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.08f, false, -1, true, pl);
                    pl.worldObj.spawnEntityInWorld(entity2);
                }
                if (this.hasAGodAura) {
                    float out = 1.6f;
                    float in = 1.0f;
                    extra_scale = 0.5f;
                    int dea = 50;
                    for (int gh = 0; gh < 2; ++gh) {
                        x = Math.random() * (double)out - (double)(out / 2.0f);
                        y = Math.random() * (double)this.height - 0.5;
                        z = Math.random() * (double)out - (double)(out / 2.0f);
                        EntityCusPar entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red2, green2, blue2, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, pl);
                        x = Math.random() * (double)out - (double)(out / 2.0f);
                        y = Math.random() * (double)this.height - 0.5;
                        z = Math.random() * (double)out - (double)(out / 2.0f);
                        entity.worldObj.spawnEntityInWorld(entity);
                        EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red2, green2, blue2, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, pl);
                        entity.worldObj.spawnEntityInWorld(entity2);
                    }
                    x = Math.random() * (double)(out *= 1.4f) - (double)(out / 2.0f);
                    y = Math.random() * (double)this.height - 0.5;
                    z = Math.random() * (double)out - (double)(out / 2.0f);
                    EntityCusPar entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, pl);
                    x = Math.random() * (double)out - (double)(out / 2.0f);
                    y = Math.random() * (double)this.height - 0.5;
                    z = Math.random() * (double)out - (double)(out / 2.0f);
                    entity.worldObj.spawnEntityInWorld(entity);
                    EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, pl);
                    entity.worldObj.spawnEntityInWorld(entity2);
                    x = Math.random() * (double)in - (double)(in / 2.0f);
                    y = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                    z = Math.random() * (double)in - (double)(in / 2.0f);
                    entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 180.0f, 180.0f, 180.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, pl);
                    x = Math.random() * (double)in - (double)(in / 2.0f);
                    y = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                    z = Math.random() * (double)in - (double)(in / 2.0f);
                    entity.worldObj.spawnEntityInWorld(entity);
                    entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 180.0f, 180.0f, 180.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, pl);
                    entity.worldObj.spawnEntityInWorld(entity2);
                    x = Math.random() * (double)(in *= 1.2f) - (double)(in / 2.0f);
                    y = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                    z = Math.random() * (double)in - (double)(in / 2.0f);
                    entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red2, green2, blue2, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, pl);
                    x = Math.random() * (double)in - (double)(in / 2.0f);
                    y = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                    z = Math.random() * (double)in - (double)(in / 2.0f);
                    entity.worldObj.spawnEntityInWorld(entity);
                    entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red2, green2, blue2, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, pl);
                    entity.worldObj.spawnEntityInWorld(entity2);
                }
                if (this.auraLightning && this.lightningCount == 1) {
                    EntityCusPar entity3 = new EntityCusPar("ninjinentities:textures/effect/lightning.png", pl.worldObj, 0.2f, 0.2f, pl.posX, pl.posY + (double)((Entity)pl instanceof EntityPlayerSP ? -1.6f : 0.0f), pl.posZ, x, y, z, motx, moty, motz, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", (int)(30.0f * life * 0.5f), 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * extra_scale, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * extra_scale, 0.1f * life * extra_scale, 0, 255.0f, 255.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.08f, false, -1, true, pl);
                    pl.worldObj.spawnEntityInWorld(entity3);
                    if (pl.ticksExisted % 25 == (int)random * 25 || pl.ticksExisted % 70 == 1) {
                        Main.network.sendToServer(new MessageSendEntityToSpark(this.getEntityId()));
                        random = Math.random();
                    }
                    this.lightningCount = 0;
                    continue;
                }
                ++this.lightningCount;
            }
        }
        ++this.wait;
        List ListPlayers = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(16.0, 16.0, 16.0));
        if (!ListPlayers.isEmpty()) {
            for (int i = 0; i < ListPlayers.size(); ++i) {
                Entity player = (Entity)ListPlayers.get(i);
                this.becomeAngryAt(player);
                if (this.wait != 150 * this.m) continue;
                this.m = 1;
                this.wait = 0;
                if (this.worldObj.isRemote || !this.canTeleport) continue;
                this.setPositionAndUpdate(player.posX, player.posY + 1.0, player.posZ);
                this.worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC2.tp", 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
            }
        }
        super.onLivingUpdate();
    }

    @Override
    public void onUpdate() {
        AxisAlignedBB aabb;
        List list;
        int i;
        double r = DBCConfig.mdal;
        if (this.spwner == null && (i = 0) < (list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb = AxisAlignedBB.getBoundingBox(this.posX - r, this.posY - r, this.posZ - r, this.posX + r, this.posY + r, this.posZ + r))).size()) {
            this.spwner = (EntityPlayer)list.get(i);
        }
        if (this.spwner != null && r != 0.0) {
            aabb = AxisAlignedBB.getBoundingBox(this.posX - r, this.posY - r, this.posZ - r, this.posX + r, this.posY + r, this.posZ + r);
            list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
            boolean b = false;
            int j = 0;
            int sgid = JRMCoreH.getInt(this.spwner, "JRMCGID");
            for (int i2 = 0; i2 < list.size(); ++i2) {
                EntityPlayer entity2 = (EntityPlayer)list.get(i2);
                int ogid = JRMCoreH.getInt(entity2, "JRMCGID");
                if (this.spwner.getEntityId() != entity2.getEntityId() && (sgid == 0 || sgid != ogid)) continue;
                ++j;
            }
            if (this.getEntityId() == this.spwner.getEntityId()) {
                ++j;
            }
            if (j == 0) {
                --this.noSpwnr;
                if (this.noSpwnr <= 0) {
                    this.setDead();
                }
            } else if (this.noSpwnr != DBCConfig.mdat) {
                this.noSpwnr = DBCConfig.mdat;
            }
        }
        if (!this.worldObj.isRemote && this.spwner == null) {
            this.setDead();
        }
        if (this.worldObj.isRemote) {
            ++this.rang;
        }
        if (this.worldObj.isRemote && this.rang > 100) {
            this.rang = 0;
            int i3 = this.updateDataInt(23);
            Entity entity = this.targetedEntity = i3 > 0 ? this.worldObj.getEntityByID(i3) : null;
        }
        if (!this.worldObj.isRemote && !this.updtd) {
            this.updtd = true;
        }
        if (this.targetedEntity != null && this.canEntityBeSeen(this.targetedEntity)) {
            if (this.targetedEntity.posY - 4.0 > this.posY) {
                this.motionY += 0.1;
            } else if (this.targetedEntity.posY - 1.6 >= this.posY) {
                this.posY = this.targetedEntity.posY - 1.6;
                this.motionY = 0.0;
                this.fallDistance = 0.0f;
            }
        }
        super.onUpdate();
    }

    private void becomeAngryAt(Entity par1Entity) {
        this.entityToAttack = par1Entity;
        this.angerLevel = 400 + this.rand.nextInt(400);
    }

    public static enum MindState {
        NEUTRAL,
        AGGRESSIVE,
        PACIFIC;

    }
}

