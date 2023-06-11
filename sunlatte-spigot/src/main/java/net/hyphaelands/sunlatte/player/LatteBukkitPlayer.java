/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package net.hyphaelands.sunlatte.player;

import com.google.inject.Inject;
import org.bukkit.entity.Player;
import player.LattePlayer;
import translation.LatteMessageProvider;

import java.util.UUID;

public abstract class LatteBukkitPlayer extends LattePlayer implements Player {
    @Inject LatteMessageProvider latteMessageProvider;

    public LatteBukkitPlayer(UUID uuid) {
        super(uuid);
    }

    @Override
    public void sendTranslatedMessage(String key) {
        this.latteMessageProvider.provide().send(this, key);
    }
}
