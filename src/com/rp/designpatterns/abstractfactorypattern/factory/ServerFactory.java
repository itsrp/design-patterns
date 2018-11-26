package com.rp.designpatterns.abstractfactorypattern.factory;

import com.rp.designpatterns.abstractfactorypattern.model.Computer;
import com.rp.designpatterns.abstractfactorypattern.model.Server;

public class ServerFactory implements AbstractComputerFactory{

    private int hdd;

    private int ram;

    public ServerFactory(int hdd, int ram) {
        this.hdd = hdd;
        this.ram = ram;
    }

    public Computer createComputer() {
        return new Server(hdd, ram);
    }
}
