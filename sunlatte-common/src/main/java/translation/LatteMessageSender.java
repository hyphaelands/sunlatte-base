/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package translation;

import me.yushust.message.send.MessageSender;
import player.OnlineLattePlayer;

public class LatteMessageSender implements MessageSender<OnlineLattePlayer> {

    @Override
    public void send(OnlineLattePlayer onlineLattePlayer, String mode, String message) {
        onlineLattePlayer.sendMessage(message);
    }
}
