package player;

import java.util.HashMap;
import java.util.UUID;

public class LattePlayerManager<T> {
    private final HashMap<UUID, T> playerMap = new HashMap<>();
    private final Class<T> clazz;

    public LattePlayerManager(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T get(UUID uuid) {
        return this.playerMap.computeIfAbsent(uuid, target -> {
            try {
                return clazz.getConstructor(UUID.class).newInstance(target);
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        });
    }

    public T remove(UUID uuid) {
        return this.playerMap.remove(uuid);
    }
}