/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package translation.provider;

import com.google.inject.Inject;
import me.yushust.message.MessageHandler;
import me.yushust.message.MessageProvider;
import player.OnlineLattePlayer;
import translation.LatteMessageSender;
import translation.LatteMessageSource;
import translation.LattePlayerLinguist;

public class LatteMessageProvider implements ILatteMessageProvider {
    @Inject private LatteMessageSource latteMessageSource;
    @Inject private LattePlayerLinguist lattePlayerLinguist;
    @Inject private LatteMessageSender latteMessageSender;

    public MessageHandler provide() {
        MessageProvider messageProvider = MessageProvider.create(
                latteMessageSource,
                settings -> settings
                        .specify(OnlineLattePlayer.class)
                        .setLinguist(lattePlayerLinguist)
                        .setMessageSender(latteMessageSender)
        );

        return MessageHandler.of(messageProvider);
    }
}
