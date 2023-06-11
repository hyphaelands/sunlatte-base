package net.hyphaelands.sunlatte.listener.bukkit;

import net.hyphaelands.sunlatte.SunlatteSpigot;
import net.hyphaelands.sunlatte.event.LattePlayerJoinEvent;
import net.hyphaelands.sunlatte.player.LatteBukkitPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        SunlatteSpigot.getInstance().getServer().getPluginManager().callEvent(new LattePlayerJoinEvent((LatteBukkitPlayer) event.getPlayer()));
    }
}
