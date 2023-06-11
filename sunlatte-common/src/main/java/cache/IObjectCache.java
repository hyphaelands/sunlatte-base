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

public interface IObjectCache<T> {
    Optional<T> get(String id);
    void put(String id, T object);
}
