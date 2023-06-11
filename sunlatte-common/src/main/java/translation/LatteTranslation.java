/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 12/06/2023
 */

package translation;

import lombok.Data;
import me.yushust.message.MessageHandler;

@Data
public abstract class LatteTranslation implements MessageHandler {
    private final Object object;
    private final String key;
    private final Object[] objects;

    public String get() {
        return get(this.object, this.key, this.objects);
    }
}
