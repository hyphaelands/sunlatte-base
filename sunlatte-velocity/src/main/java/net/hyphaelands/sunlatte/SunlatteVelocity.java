package net.hyphaelands.sunlatte;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "sunlatte-velocity",
        name = "Sunlatte",
        version = "@version@",
        url = "https://hyphaelands.net",
        authors = {"Hyphaelands"}
)
public class SunlatteVelocity {

    @Inject private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }
}
