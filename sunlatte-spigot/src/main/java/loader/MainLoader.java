package loader;

import com.google.inject.Inject;
import loader.loader.ListenerLoader;

public class MainLoader implements ILoader {
    @Inject ListenerLoader listenerLoader;

    @Override
    public void load() {
        listenerLoader.load();
    }
}
