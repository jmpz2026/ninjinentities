/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.command;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class CommandSummonNinjin
implements ICommand {
    private final List aliases;
    private List<String> listOfAllEntitiesNames = new ArrayList<String>();
    protected String fullEntityName;
    protected Entity summonedEntity;

    public CommandSummonNinjin() {
        this.aliases = new ArrayList();
        this.aliases.add("summonninjin");
        this.aliases.add("sumnj");
        for (Object entityName : EntityList.stringToClassMapping.keySet()) {
            if (!(entityName instanceof String) || !((String)entityName).contains("ninjinentities")) continue;
            this.listOfAllEntitiesNames.add((String)entityName);
        }
    }

    @Override
    public String getCommandName() {
        return "summonninjin";
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_) {
        return "summonninjin <text>";
    }

    @Override
    public List getCommandAliases() {
        return this.aliases;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] argString) {
        World world = sender.getEntityWorld();
        if (argString.length == 0) {
            sender.addChatMessage(new ChatComponentText("Invalid argument"));
            return;
        }
        sender.addChatMessage(new ChatComponentText("Summoning: " + argString[0]));
        this.fullEntityName = argString[0];
        if (EntityList.stringToClassMapping.containsKey(this.fullEntityName)) {
            this.summonedEntity = EntityList.createEntityByName(this.fullEntityName, world);
            this.summonedEntity.setPosition(sender.getCommandSenderPosition().posX, sender.getCommandSenderPosition().posY, sender.getCommandSenderPosition().posZ);
            world.spawnEntityInWorld(this.summonedEntity);
        } else {
            sender.addChatMessage(new ChatComponentText("Entity not found"));
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        if (sender instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)sender;
            return player.canCommandSenderUseCommand(3, "");
        }
        return true;
    }

    @Override
    public List<?> addTabCompletionOptions(ICommandSender sender, String[] strArray) {
        ArrayList<String> strListComp = new ArrayList<String>();
        List<String> currentCom = this.listOfAllEntitiesNames;
        if (strArray.length == 1) {
            for (String strCom : currentCom) {
                if (strCom.length() <= strArray[0].length() || !strArray[0].startsWith(strCom.substring(0, strArray[0].length()))) continue;
                strListComp.add(strCom);
            }
        }
        return strListComp;
    }

    @Override
    public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
        return false;
    }

    public int compareTo(Object o) {
        return 0;
    }
}

