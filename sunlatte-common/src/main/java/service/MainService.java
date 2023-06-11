package service;

import java.lang.reflect.InvocationTargetException;

public class MainService<T> implements IService {
    private final Class<T> clazz;

    public MainService(Class<T> clazz) {
        this.clazz = clazz;
    }

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
