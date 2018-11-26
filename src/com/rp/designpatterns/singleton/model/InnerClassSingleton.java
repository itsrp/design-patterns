package com.rp.designpatterns.singleton.model;

/*
Pros:
1. Thread safe.
2. Instance will be created only when getInstance() is called.

 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    private static class SingletonHelper {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
