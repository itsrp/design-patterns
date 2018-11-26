package com.rp.designpatterns.singleton.model;

/*
    Cons:
    1. Fails in multi-threaded env.
 */
public final class LazyInitializationSingleton {

    private static LazyInitializationSingleton lazyInitializationSingleton;

    private LazyInitializationSingleton() {
    }

    public static LazyInitializationSingleton getInstance() {
        if (lazyInitializationSingleton == null) {
            lazyInitializationSingleton = new LazyInitializationSingleton();
        }
        return lazyInitializationSingleton;
    }
}
