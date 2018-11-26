package com.rp.designpatterns.factorypattern.client;

import com.rp.designpatterns.factorypattern.factory.ComputerFactory;
import com.rp.designpatterns.factorypattern.model.Computer;
import com.rp.designpatterns.factorypattern.model.ComputerType;

public class Client {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.createComputer(ComputerType.PC, 500, 16);
        System.out.println(computer);

        computer = ComputerFactory.createComputer(ComputerType.SERVER, 1024, 32);
        System.out.println(computer);
    }
}
