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

public class EntityTrunksArmorSsjG2
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityTrunksArmorSsjG2(World par1World) {
        super(par1World, 100, EntityDBCNinjin.MindState.NEUTRAL, true, true, new byte[]{3, 5, 6}, new byte[]{7, 7, 7}, 255.0f, 217.0f, 25.0f);
        this.experienceValue = 80;
        this.setSize(0.66f, 1.98f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(13500.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1350.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/trunksFuturArmorSsj.png";
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

