/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package net.hyphaelands.sunlatte.player.translation;

import com.google.inject.Inject;
import me.yushust.message.MessageHandler;
import me.yushust.message.MessageProvider;
import net.hyphaelands.sunlatte.player.LatteBukkitPlayer;
import translation.LatteMessageProvider;
import translation.LatteMessageSource;

public class BukkitMessageProvider implements LatteMessageProvider {
    @Inject private LatteMessageSource latteMessageSource;
    @Inject private BukkitPlayerLinguist bukkitPlayerLinguist;
    @Inject private BukkitMessageSender bukkitMessageSender;

    public MessageHandler provide() {
        MessageProvider messageProvider = MessageProvider.create(
                latteMessageSource,
                settings -> settings
                        .specify(LatteBukkitPlayer.class)
                        .setLinguist(bukkitPlayerLinguist)
                        .setMessageSender(bukkitMessageSender)
        );

        return MessageHandler.of(messageProvider);
    }
}
