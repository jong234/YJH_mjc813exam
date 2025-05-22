package com.mjc813.studyjava.abstractj;

public class Main {
    public static void main(String[] args) {
        Driver TDriver = new Driver("홍길동", 30, new Truck("트럭", 2, 4));
        TDriver.drive();
        TDriver.breakk();

        Driver BDriver = new Driver("김명지", 40, new Bicycle("B모델", 2));
        BDriver.drive();
        BDriver.breakk();


    }
}
