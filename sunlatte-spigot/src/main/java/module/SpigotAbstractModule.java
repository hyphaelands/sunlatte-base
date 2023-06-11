package module;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.name.Names;
import loader.MainLoader;
import net.hyphaelands.sunlatte.SunlatteSpigot;

public class SpigotAbstractModule extends AbstractModule {
    private final SunlatteSpigot sunlatteSpigot;

    @Inject private MainLoader mainLoader;

    public SpigotAbstractModule(SunlatteSpigot sunlatteSpigot) {
        this.sunlatteSpigot = sunlatteSpigot;
    }

    @Override
    protected void configure() {
        bind(SunlatteSpigot.class).toInstance(sunlatteSpigot);
        bind(MainLoader.class).annotatedWith(Names.named("loader")).toInstance(mainLoader);
    }
}
