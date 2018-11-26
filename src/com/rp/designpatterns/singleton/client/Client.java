package com.rp.designpatterns.singleton.client;

import com.rp.designpatterns.singleton.model.EagerInitializationSingleton;
import com.rp.designpatterns.singleton.model.EnumSingleton;
import com.rp.designpatterns.singleton.model.InnerClassSingleton;
import com.rp.designpatterns.singleton.model.LazyInitializationSingleton;
import com.rp.designpatterns.singleton.model.ThreadSafeSingleton;

public class Client {
    public static void main(String[] args) {
        EagerInitializationSingleton eagerInitializationSingleton1 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton eagerInitializationSingleton2 = EagerInitializationSingleton.getInstance();
        System.out.println(eagerInitializationSingleton1.equals(eagerInitializationSingleton2));

        LazyInitializationSingleton lazyInitializationSingleton1 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazyInitializationSingleton2 = LazyInitializationSingleton.getInstance();
        System.out.println(lazyInitializationSingleton1.equals(lazyInitializationSingleton2));

        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton1.equals(threadSafeSingleton2));

        ThreadSafeSingleton instanceUsingDoubleLocking1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        ThreadSafeSingleton instanceUsingDoubleLocking2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        System.out.println(instanceUsingDoubleLocking1.equals(instanceUsingDoubleLocking2));

        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton2 = InnerClassSingleton.getInstance();
        System.out.println(innerClassSingleton1.equals(innerClassSingleton2));

        EnumSingleton instance1 = EnumSingleton.Enum.INSTANCE.getSingleton();
        EnumSingleton instance2 = EnumSingleton.Enum.INSTANCE.getSingleton();
        System.out.println(instance1.equals(instance2));
    }
}
