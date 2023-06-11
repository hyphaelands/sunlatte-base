/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package cache.caffeine;

import cache.IObjectCache;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class CaffeineObjectCache<T> implements IObjectCache<T> {
    private final Cache<String, T> cache;

    public CaffeineObjectCache() {
        this.cache = Caffeine.newBuilder()
                .maximumSize(1000)
                .expireAfterAccess(Duration.of(120, ChronoUnit.SECONDS))
                .softValues()
                .build();
    }

    @Override
    public Optional<T> get(String id) {
        return Optional.ofNullable(this.cache.getIfPresent(id));
    }

    @Override
    public void put(String id, T object) {
        this.cache.put(id, object);
    }
}
