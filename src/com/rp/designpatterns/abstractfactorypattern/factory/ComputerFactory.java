package com.rp.designpatterns.abstractfactorypattern.factory;

import com.rp.designpatterns.abstractfactorypattern.model.Computer;

public class ComputerFactory {

    public static Computer createComputer(AbstractComputerFactory factory) {
        return factory.createComputer();
    }
}
