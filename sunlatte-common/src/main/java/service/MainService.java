/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package service;

import com.google.inject.Inject;

import javax.inject.Named;
import java.lang.reflect.InvocationTargetException;

public class MainService<T> implements IService {
    @Inject @Named("loader") private Class<T> clazz;

    @Override
    public void start() {
        try {
            clazz.getMethod("load").invoke(clazz.newInstance());
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void stop() {
    }
}
