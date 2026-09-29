/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.event;

import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import java.util.Arrays;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class EventAttackManager {
    private int slowClient = 0;

    @SubscribeEvent
    public void checkHurtEvent(LivingHurtEvent event) {
        try {
            if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer) {
                EntityPlayer loadedPlayer = (EntityPlayer)event.entity;
                EntityLivingBase entityKiller = event.entityLiving.func_94060_bK();
                if (entityKiller instanceof EntityDBCNinjin && JRMCoreH.getInt(loadedPlayer, "jrmcBdy") < 10 && ((EntityDBCNinjin)entityKiller).isTrainer) {
                    JRMCoreH.setInt(10, loadedPlayer, "jrmcBdy");
                    NBTTagCompound nbt = JRMCoreH.nbt(loadedPlayer, "pres");
                    byte st = nbt.getByte("jrmcState");
                    byte st2 = nbt.getByte("jrmcState2");
                    byte rc = nbt.getByte("jrmcRace");
                    byte rls = JRMCoreH.getByte(loadedPlayer, "jrmcRelease");
                    int curStam = JRMCoreH.getInt(loadedPlayer, "jrmcStamina");
                    String StE = nbt.getString("jrmcStatusEff");
                    nbt.setInteger("jrmcHar4va", 5);
                    JRMCoreH.setByte(rc == 4 ? (byte)4 : (st < 4 ? (byte)st : (byte)0), loadedPlayer, "jrmcState");
                    JRMCoreH.setByte(0, loadedPlayer, "jrmcState2");
                    JRMCoreH.setByte(0, loadedPlayer, "jrmcRelease");
                    JRMCoreH.setInt(0, loadedPlayer, "jrmcStamina");
                    StE = JRMCoreH.StusEfcts(19, StE, nbt, false);
                    StE = JRMCoreH.StusEfcts(13, StE, nbt, false);
                    for (Object entity : entityKiller.worldObj.getEntitiesWithinAABB(EntityDBCNinjin.class, AxisAlignedBB.getBoundingBox(entityKiller.posX - 100.0, entityKiller.posY - 100.0, entityKiller.posZ - 100.0, entityKiller.posX + 100.0, entityKiller.posY + 100.0, entityKiller.posZ + 100.0))) {
                        ((EntityDBCNinjin)entity).setDead();
                    }
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("exception occured : " + e + " at " + Arrays.toString(e.getStackTrace()));
        }
    }
}

