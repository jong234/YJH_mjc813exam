package com.mjc813.studyjava.interfacej;

public class Driver {
    String name;
    int age;
    IVehicle ivehicle;

    Driver(String name, int age, IVehicle ivehicle) {
        this.name = name;
        this.age = age;
        this.ivehicle = ivehicle;
    }

    void drive() {
        if (ivehicle instanceof Truck) {
            System.out.printf("운전수%s은 ", name);
            ivehicle.dive();
        }
    }

    void
}
