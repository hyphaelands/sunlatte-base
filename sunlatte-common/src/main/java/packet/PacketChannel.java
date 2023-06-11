/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package packet;

import lombok.Data;

@Data
public enum PacketChannel {
    PRIVATE_MESSAGE("private_message", MessagePacket.class);

    private final String channel;
    private final Class<? extends IPacket> clazz;

    PacketChannel(String channel, Class<? extends IPacket> clazz) {
        this.channel = channel;
        this.clazz = clazz;
    }

    public static PacketChannel getChannelByName(String channel) {
        for (PacketChannel packetChannel : PacketChannel.values())
            if (packetChannel.channel.equals(channel)) {
                return packetChannel;
            }
        throw new UnknownChannelException(channel);
    }
}