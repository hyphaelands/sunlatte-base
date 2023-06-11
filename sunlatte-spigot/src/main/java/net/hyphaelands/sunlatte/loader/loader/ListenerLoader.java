/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package net.hyphaelands.sunlatte.loader.loader;

import com.google.inject.Inject;
import net.hyphaelands.sunlatte.loader.ILoader;
import net.hyphaelands.sunlatte.SunlatteSpigot;
import net.hyphaelands.sunlatte.listener.bukkit.PlayerJoinListener;
import net.hyphaelands.sunlatte.listener.latte.LattePlayerJoinListener;

import java.util.Arrays;

public class ListenerLoader implements ILoader {
    @Inject SunlatteSpigot sunlatteSpigot;

    @Inject LattePlayerJoinListener lattePlayerJoinListener;

    @Inject PlayerJoinListener playerJoinListener;

    @Override
    public void load() {
        Arrays.asList(playerJoinListener, lattePlayerJoinListener)
                .forEach(listener -> sunlatteSpigot.getServer().getPluginManager().registerEvents(listener, sunlatteSpigot));
    }
}