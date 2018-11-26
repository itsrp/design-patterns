package com.rp.designpatterns.factorypattern.model;

public class PC implements Computer {

    private int hdd;

    private int ram;

    private ComputerType type = ComputerType.PC;

    public PC(int hdd, int ram) {
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
        return "PC{" +
                "hdd=" + hdd +
                ", ram=" + ram +
                ", type=" + type +
                '}';
    }
}
