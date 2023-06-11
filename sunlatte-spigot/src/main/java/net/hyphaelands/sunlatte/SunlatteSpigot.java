package net.hyphaelands.sunlatte;

import lombok.Data;
import net.hyphaelands.sunlatte.listener.latte.LattePlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

@Data
public final class SunlatteSpigot extends JavaPlugin {
    private static SunlatteSpigot instance;

    @Override
    public void onEnable() {
        instance = this;

        this.getServer().getPluginManager().registerEvents(new LattePlayerJoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
