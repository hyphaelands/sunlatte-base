/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package net.hyphaelands.sunlatte;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lombok.Data;
import module.SpigotAbstractModule;
import org.bukkit.plugin.java.JavaPlugin;
import service.IService;

@Data
public final class SunlatteSpigot extends JavaPlugin {
    @Override
    public void onEnable() {
        Injector injector = Guice.createInjector(new SpigotAbstractModule(this));
        injector.injectMembers(this);

        injector.getInstance(IService.class).start();
    }

    @Override
    public void onDisable() {
    }
}
