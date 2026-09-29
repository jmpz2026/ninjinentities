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

public class EntityGoku2
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityGoku2(World par1World) {
        super(par1World, 100, EntityDBCNinjin.MindState.NEUTRAL, true, false, new byte[]{3, 3, 1, 6, 5}, new byte[]{2, 2, 2, 2, 2});
        this.experienceValue = 80;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(200.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/goku2.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.GiFighter1Torso, 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.GiFighter1Leg, 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.GiFighter1Boots, 1);
        }
    }
}

