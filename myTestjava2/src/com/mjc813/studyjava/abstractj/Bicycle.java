package com.mjc813.studyjava.abstractj;

public class Bicycle extends Vehicle {
    static String name;

    Bicycle(String name, int wheelCount) {
        super(wheelCount);
        this.name = name;
    }

    @Override
    void move() {
        System.out.printf("자전거%s을 이동한다.\n", this.name);
    }

    @Override
    void stop() {
        System.out.printf("자전거%s을 정지한다\n", this.name);
    }
}
