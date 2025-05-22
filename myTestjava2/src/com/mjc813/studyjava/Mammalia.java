package com.mjc813.studyjava;

public class Mammalia extends Animal {

    void feedingMilk(){
        System.out.println(name+" 젖을 먹인다.");
    }

    @Override
    void eat(Object feed) {
        if(feed instanceof String){
            System.out.println(name + "은 " + feed + "를 먹는다.");
        }
    }

    @Override
    Animal reproduce(String Mammalia) {
        return super.reproduce(Mammalia);
    }
}
