package module;

import com.google.inject.AbstractModule;
import net.hyphaelands.sunlatte.SunlatteSpigot;

public class SpigotAbstractModule extends AbstractModule {
    private final SunlatteSpigot sunlatteSpigot;

    public SpigotAbstractModule(SunlatteSpigot sunlatteSpigot) {
        this.sunlatteSpigot = sunlatteSpigot;
    }

    @Override
    protected void configure() {
        bind(SunlatteSpigot.class).toInstance(sunlatteSpigot);
    }
}
