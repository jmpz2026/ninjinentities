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

public class EntityGokuArmorSsj
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityGokuArmorSsj(World par1World) {
        super(par1World, 100, EntityDBCNinjin.MindState.NEUTRAL, true, true, new byte[]{3, 3, 1, 6, 5, 2}, new byte[]{2, 2, 2, 2, 2, 7}, 255.0f, 217.0f, 25.0f);
        this.experienceValue = 80;
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
        return "ninjinentities:textures/entity/gokuArmorSsj.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.BattleArmorChest05, 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.BattleArmorLegs05, 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.BattleArmorBoots05, 1);
        }
    }
}

