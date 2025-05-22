package com.mjc813.studyjava.abstractj;

public abstract class Vehicle {
    int wheelCount;

    Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }

   abstract void move();

    abstract void stop();
}
