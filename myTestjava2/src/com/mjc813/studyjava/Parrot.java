package com.mjc813.studyjava;

public class Parrot extends Bird {
    @Override
    void fly() {
        System.out.println(name + wings + "조금만 난다.");
        super.fly();
    }

    @Override
    void eat(Object feed) {
        System.out.println(name+ "은" + feed + "를 먹는다.");
        super.eat(feed);
    }

    @Override
    Animal reproduce(String Parrot) {
        return super.reproduce(Parrot);
    }


}
