package player;

import java.util.HashMap;
import java.util.UUID;

public class LattePlayerManager<T> {
    private final HashMap<UUID, T> playerMap;
    private final Class<T> clazz;

    public LattePlayerManager(Class<T> clazz) {
        this.playerMap = new HashMap<>();
        this.clazz = clazz;
    }

    public T get(UUID uuid) {
        return this.playerMap.computeIfAbsent(uuid, targetUUID -> {
            try {
                return clazz.getConstructor(UUID.class).newInstance(targetUUID);
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        });
    }

    public T remove(UUID uuid) {
        return this.playerMap.remove(uuid);
    }
}