package net.hyphaelands.sunlatte;

import com.google.inject.Guice;
import lombok.Data;
import module.SpigotAbstractModule;
import net.hyphaelands.sunlatte.listener.bukkit.PlayerJoinListener;
import net.hyphaelands.sunlatte.listener.latte.LattePlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

@Data
public final class SunlatteSpigot extends JavaPlugin {
    @Override
    public void onEnable() {
        Guice.createInjector(new SpigotAbstractModule(this)).injectMembers(this);

        this.getServer().getPluginManager().registerEvents(new LattePlayerJoinListener(), this);

        this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
