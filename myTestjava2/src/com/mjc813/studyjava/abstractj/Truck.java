package com.mjc813.studyjava.abstractj;

public class Truck extends Vehicle {
    static String name;
    int ton;

    Truck(String name, int ton, int wheelCount) {
        super(wheelCount);
        this.name = name;
        this.ton = ton;
    }
    @Override
    void move() {
        System.out.printf("트럭%s을 운전한다.\n", this.name);
    }

    @Override
    void stop() {
        System.out.printf("트럭%s을 정지한다.\n", this.name);
    }
}
