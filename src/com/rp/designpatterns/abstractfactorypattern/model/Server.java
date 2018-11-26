package com.rp.designpatterns.abstractfactorypattern.model;

public class Server implements Computer {

    private int hdd;

    private int ram;

    private ComputerType type = ComputerType.SERVER;

    public Server(int hdd, int ram) {
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public int getHdd() {
        return hdd;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public ComputerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Server{" +
                "hdd=" + hdd +
                ", ram=" + ram +
                ", type=" + type +
                '}';
    }
}
