/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package net.hyphaelands.sunlatte.module;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import net.hyphaelands.sunlatte.SunlatteSpigot;
import net.hyphaelands.sunlatte.loader.ILoader;
import net.hyphaelands.sunlatte.loader.MainLoader;
import net.hyphaelands.sunlatte.player.LatteBukkitPlayer;
import player.LattePlayerManager;
import translation.provider.ILatteMessageProvider;

public class SpigotAbstractModule extends AbstractModule {
    private final LattePlayerManager<LatteBukkitPlayer> lattePlayerManager = new LattePlayerManager<>(LatteBukkitPlayer.class);

    private final SunlatteSpigot sunlatteSpigot;

    @Inject private ILatteMessageProvider latteMessageProvider;
    @Inject private MainLoader mainLoader;

    public SpigotAbstractModule(SunlatteSpigot sunlatteSpigot) {
        this.sunlatteSpigot = sunlatteSpigot;
    }

    @Override
    protected void configure() {
        bind(SunlatteSpigot.class).toInstance(sunlatteSpigot);

        bind(LattePlayerManager.class).toInstance(lattePlayerManager);
        bind(ILatteMessageProvider.class).toInstance(latteMessageProvider);

        bind(ILoader.class).toInstance(mainLoader);
    }
}
