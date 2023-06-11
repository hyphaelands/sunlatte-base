package packet.packet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import packet.IPacket;
import packet.PacketChannel;

import java.util.UUID;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class MessagePacket implements IPacket {
    @Setter private UUID author;
    @Setter private UUID target;
    @Setter private String message;

    @Override
    public PacketChannel getChannel() {
        return PacketChannel.PRIVATE_MESSAGE;
    }
}