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

public class EntityBrolyZLSsj
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityBrolyZLSsj(World par1World) {
        super(par1World, 15, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{1, 3, 5, 6}, new byte[]{6, 6, 6, 6}, 50.0f, 255.0f, 50.0f);
        this.experienceValue = 80;
        this.setSize(0.75f, 2.25f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1500.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/brolyZLSsj.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit1[18], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit2[18], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit3[18], 1);
        }
    }
}

