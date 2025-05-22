package com.mjc813.studyjava.abstractj;

public class Driver {
    String name;
    int age;
    Vehicle vehicle;

    Driver(String name, int age, Vehicle vehicle) {
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }

    void drive() {
        if(vehicle instanceof Truck) {
            System.out.printf("운전수%s은 %d개의 바퀴의 ", this.name, vehicle.wheelCount);
            vehicle.move();
        } else if (vehicle instanceof Bicycle) {
            System.out.printf("운전수%s은 %d개의 바퀴의 ", this.name, vehicle.wheelCount);
            vehicle.move();
        }
    }

    void breakk(){
        if(vehicle instanceof Truck){
            System.out.printf("운전수%s ",this.name);
            vehicle.stop();

        }
        else if (vehicle instanceof Bicycle) {
            System.out.printf("운전수%s ",this.name);
            vehicle.stop();
        }
    }
}
