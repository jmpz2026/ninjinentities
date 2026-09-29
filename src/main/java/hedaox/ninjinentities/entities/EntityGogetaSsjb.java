/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGogetaSsjb
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityGogetaSsjb(World par1World) {
        super(par1World, 85, EntityDBCNinjin.MindState.AGGRESSIVE, true, true, new byte[]{1, 3, 4, 5, 6}, new byte[]{2, 2, 2, 2, 2}, 50.0f, 255.0f, 255.0f, false, true, 50.0f, 200.0f, 255.0f);
        this.experienceValue = 80;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/gogetaSsjb.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit1[17], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit2[17], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit3[17], 1);
        }
    }
}

