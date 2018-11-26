package com.rp.designpatterns.factorypattern.factory;

import com.rp.designpatterns.factorypattern.model.Computer;
import com.rp.designpatterns.factorypattern.model.ComputerType;
import com.rp.designpatterns.factorypattern.model.PC;
import com.rp.designpatterns.factorypattern.model.Server;

public class ComputerFactory {

    public static Computer createComputer(ComputerType type, int hdd, int ram) {
        switch (type) {
            case PC: return new PC(hdd, ram);
            case SERVER:return new Server(hdd, ram);
            default: throw new IllegalArgumentException();
        }
    }
}
