/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package hedaox.ninjinentities.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;

public class MessageSendEntityToSpark
implements IMessage {
    private int toSend;

    public MessageSendEntityToSpark() {
    }

    public MessageSendEntityToSpark(int text) {
        this.toSend = text;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.toSend = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.toSend);
    }

    public static class Handler
    implements IMessageHandler<MessageSendEntityToSpark, IMessage> {
        @Override
        public IMessage onMessage(MessageSendEntityToSpark message, MessageContext ctx) {
            for (Object entityObject : ctx.getServerHandler().playerEntity.worldObj.loadedEntityList) {
                Entity entity = (Entity)entityObject;
                if (entity.getEntityId() != message.toSend) continue;
                entity.worldObj.playSoundAtEntity(entity, "jinryuudragonbc:1610.spark", 0.4f, 1.0f);
            }
            return null;
        }
    }
}

