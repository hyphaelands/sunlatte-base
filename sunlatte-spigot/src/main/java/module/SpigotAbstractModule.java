/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package module;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.name.Names;
import loader.MainLoader;
import net.hyphaelands.sunlatte.SunlatteSpigot;
import net.hyphaelands.sunlatte.player.LatteBukkitPlayer;
import player.LattePlayerManager;
import translation.LatteMessageProvider;

public class SpigotAbstractModule extends AbstractModule {
    private final LattePlayerManager<LatteBukkitPlayer> lattePlayerManager = new LattePlayerManager<>(LatteBukkitPlayer.class);

    private final SunlatteSpigot sunlatteSpigot;

    @Inject private LatteMessageProvider latteMessageProvider;
    @Inject private MainLoader mainLoader;

    public SpigotAbstractModule(SunlatteSpigot sunlatteSpigot) {
        this.sunlatteSpigot = sunlatteSpigot;
    }

    @Override
    protected void configure() {
        bind(SunlatteSpigot.class).toInstance(sunlatteSpigot);

        bind(LattePlayerManager.class).toInstance(lattePlayerManager);
        bind(LatteMessageProvider.class).toInstance(latteMessageProvider);

        bind(MainLoader.class).annotatedWith(Names.named("loader")).toInstance(mainLoader);
    }
}
