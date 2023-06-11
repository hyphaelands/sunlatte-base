package net.hyphaelands.sunlatte;

import net.hyphaelands.sunlatte.listener.latte.LattePlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SunlatteSpigot extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new LattePlayerJoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
