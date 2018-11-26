package com.rp.designpatterns.singleton.model;

/*
    Cons:
    1. Even though client has not required instance this approach will create it.
    2. No exception handling while instantiating object.

 */
public final class EagerInitializationSingleton {

    private static final EagerInitializationSingleton eagerInitializationSingleton = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {
    }

    public static EagerInitializationSingleton getInstance() {
        return eagerInitializationSingleton;
    }
}
