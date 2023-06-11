/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

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