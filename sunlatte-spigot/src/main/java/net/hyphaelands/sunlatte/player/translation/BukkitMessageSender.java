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

import me.yushust.message.send.MessageSender;
import net.hyphaelands.sunlatte.player.LatteBukkitPlayer;

public class BukkitMessageSender implements MessageSender<LatteBukkitPlayer> {

    @Override
    public void send(LatteBukkitPlayer latteBukkitPlayer, String mode, String message) {
        latteBukkitPlayer.sendMessage(message);
    }
}
