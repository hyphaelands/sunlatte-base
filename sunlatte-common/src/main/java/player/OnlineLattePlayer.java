/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package player;

import com.google.inject.Inject;
import lombok.Data;
import translation.provider.LatteMessageProvider;

import java.util.UUID;

@Data
public class OnlineLattePlayer implements IOnlineLattePlayer {
    @Inject LatteMessageProvider latteMessageProvider;

    private final UUID uuid;

    public OnlineLattePlayer(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public void sendMessage(String key) {
        this.latteMessageProvider.provide().send(this, key);
    }

    @Override
    public void sendTranslatedMessage(String key) {
        this.latteMessageProvider.provide().send(this, key);
    }
}
