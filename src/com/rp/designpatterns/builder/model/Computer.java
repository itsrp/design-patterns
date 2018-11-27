package com.rp.designpatterns.builder.model;

public class Computer {
    private int hdd;
    private int ram;
    private boolean isGraphicsCardEnabled;
    private boolean isWiFiEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.hdd = computerBuilder.hdd;
        this.ram = computerBuilder.ram;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        this.isWiFiEnabled = computerBuilder.isWiFiEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        private int hdd;
        private int ram;
        private boolean isGraphicsCardEnabled;
        private boolean isWiFiEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder setHdd(int hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setWiFiEnabled(boolean wiFiEnabled) {
            isWiFiEnabled = wiFiEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd=" + hdd +
                ", ram=" + ram +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isWiFiEnabled=" + isWiFiEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
