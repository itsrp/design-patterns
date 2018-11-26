package com.rp.designpatterns.abstractfactorypattern.client;

import com.rp.designpatterns.abstractfactorypattern.factory.ComputerFactory;
import com.rp.designpatterns.abstractfactorypattern.factory.PCFactory;
import com.rp.designpatterns.abstractfactorypattern.factory.ServerFactory;
import com.rp.designpatterns.abstractfactorypattern.model.Computer;

public class Client {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.createComputer(new PCFactory(500, 16));
        System.out.println(computer);

        computer = ComputerFactory.createComputer(new ServerFactory(5000, 64));
        System.out.println(computer);
    }
}
