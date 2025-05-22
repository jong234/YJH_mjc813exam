package com.mjc813.studyjava;

public class Bird extends Animal {
    String wings = "날개";

    void flap(){
        System.out.println(this.name + wings + "날개짓한다." );
    }

    void fly(){
        System.out.println(this.name + wings + " 난다.");
    }

    @Override
    Animal reproduce(String Bird) {
        name = Bird;
        return Bird.this;
    }

}
