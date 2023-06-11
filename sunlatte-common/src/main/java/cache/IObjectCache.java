/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 12/06/2023
 */

package cache;

import java.util.Optional;
import java.util.function.Consumer;

public interface IObjectCache<T> {
    Optional<T> get(String id);

    boolean isPresent(String id);

    void ifPresent(String id, Consumer<T> consumer);

    void put(T object);

    void invalidate(String id);

    void invalidateAll();

    void list();

    long estimatedSize();
}
