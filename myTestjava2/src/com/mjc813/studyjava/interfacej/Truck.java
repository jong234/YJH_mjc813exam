package com.mjc813.studyjava.interfacej;

public class Truck implements IVehicle {
    String name;
    int wheelCount;

    Truck(String name, int wheelCount) {
        this.name = name;
        this.wheelCount = wheelCount;
    }

    @Override
    public String dive() {
        return "";
    }

    @Override
    public String breakk() {
        return "";
    }
}
