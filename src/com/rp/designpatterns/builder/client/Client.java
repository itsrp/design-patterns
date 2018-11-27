package com.rp.designpatterns.builder.client;

import com.rp.designpatterns.builder.model.Computer;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setHdd(1024)
                .setRam(32)
                .setGraphicsCardEnabled(true)
                .setWiFiEnabled(true)
                .setBluetoothEnabled(false)
                .build();

        System.out.println(computer);
    }
}
