package player;

import lombok.Data;

import java.util.UUID;

@Data
public class LattePlayer implements IOnlineLattePlayer {
    private final UUID uuid;

    public LattePlayer(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public void sendTranslatedMessage(String key) {

    }
}
