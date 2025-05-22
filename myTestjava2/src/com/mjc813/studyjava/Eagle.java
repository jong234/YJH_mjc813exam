package com.mjc813.studyjava;

public class Eagle extends Bird {

    @Override
    void fly() {
        System.out.println(name + wings +" 높이 난다.");
        super.fly();
    }

    @Override
    void eat(Object animal) {
        if( animal instanceof Animal){
            System.out.println(name + "은 " +  animal + "를 먹는다.");
        }
    }

    @Override
    Animal reproduce(String Eagle) {
        return super.reproduce(Eagle);
    }
}
