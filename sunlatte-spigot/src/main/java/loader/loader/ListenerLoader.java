package loader.loader;

import com.google.inject.Inject;
import loader.ILoader;
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