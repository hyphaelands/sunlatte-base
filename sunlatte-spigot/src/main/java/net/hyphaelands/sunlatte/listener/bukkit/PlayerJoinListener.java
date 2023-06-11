/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package net.hyphaelands.sunlatte.listener.bukkit;

import com.google.inject.Inject;
import net.hyphaelands.sunlatte.SunlatteSpigot;
import net.hyphaelands.sunlatte.event.LattePlayerJoinEvent;
import net.hyphaelands.sunlatte.player.LatteBukkitPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @Inject private SunlatteSpigot sunlatteSpigot;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        sunlatteSpigot.getServer().getPluginManager().callEvent(new LattePlayerJoinEvent((LatteBukkitPlayer) event.getPlayer()));
    }
}
