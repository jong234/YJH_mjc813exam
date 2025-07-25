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
        return this.wheelCount + "개의 바퀴의 트럭" + this.name + "을 운전한다.\n";
    }

    @Override
    public String breakk() {
        return "트럭" + this.name + "을 정지한다.\n";
    }
}
