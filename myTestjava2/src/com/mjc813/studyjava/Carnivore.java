package com.mjc813.studyjava;

public class Carnivore extends Mammalia {
    @Override
    void eat(Object herbivore) {
        if(herbivore instanceof Herbivore){
            System.out.println(name + "는 " + herbivore + "를 먹는다");
        }else{
            System.out.println("출력 안됨");
        }
    }

    @Override
    Animal reproduce(String Carnivore) {
        return super.reproduce(Carnivore);
    }
}
