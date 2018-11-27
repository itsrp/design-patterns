package com.rp.designpatterns.singleton.model;

public enum EnumSingleton {

    INSTANCE;

    private int name;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}


