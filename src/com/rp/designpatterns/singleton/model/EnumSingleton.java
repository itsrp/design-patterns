package com.rp.designpatterns.singleton.model;

public class EnumSingleton {

    private EnumSingleton() {
    }

    public enum Enum {
        INSTANCE;

        private EnumSingleton singleton = new EnumSingleton();

        public EnumSingleton getSingleton() {
            return singleton;
        }

    }


}


