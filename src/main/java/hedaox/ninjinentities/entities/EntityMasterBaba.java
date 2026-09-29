/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Npcs.EntityDBCKami;
import JinRyuu.DragonBC.common.mod_DragonBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityMasterBaba
extends EntityDBCKami {
    public final int HePo = 5;

    public EntityMasterBaba(World par1World) {
        super(par1World);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0);
    }

    @Override
    public boolean interact(EntityPlayer par1EntityPlayer) {
        boolean var3;
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
        boolean bl = var3 = var2 != null;
        if (this.isEntityAlive()) {
            par1EntityPlayer.openGui(mod_DragonBC.instance, 17, par1EntityPlayer.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ);
            return true;
        }
        return super.interact(par1EntityPlayer);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/baba.png";
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
    }
}

