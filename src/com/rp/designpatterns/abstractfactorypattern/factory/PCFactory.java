package com.rp.designpatterns.abstractfactorypattern.factory;

import com.rp.designpatterns.abstractfactorypattern.model.Computer;
import com.rp.designpatterns.abstractfactorypattern.model.PC;

public class PCFactory implements AbstractComputerFactory{

    private int hdd;

    private int ram;

    public PCFactory(int hdd, int ram) {
        this.hdd = hdd;
        this.ram = ram;
    }


    public Computer createComputer() {
        return new PC(hdd, ram);
    }
}
