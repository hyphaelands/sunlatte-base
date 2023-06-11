package loader;

import com.google.inject.Inject;
import loader.loader.ListenerLoader;

import java.util.Collections;

public class MainLoader implements ILoader {
    @Inject ListenerLoader listenerLoader;

    @Override
    public void load() {
        Collections.singletonList(listenerLoader)
                .forEach(listener -> listenerLoader.load());
    }
}