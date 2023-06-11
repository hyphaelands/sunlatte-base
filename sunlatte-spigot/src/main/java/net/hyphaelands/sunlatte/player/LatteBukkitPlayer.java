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

import org.bukkit.entity.Player;
import player.OnlineLattePlayer;

import java.util.UUID;

public abstract class LatteBukkitPlayer extends OnlineLattePlayer implements Player {
    public LatteBukkitPlayer(UUID uuid) {
        super(uuid);
    }
}
