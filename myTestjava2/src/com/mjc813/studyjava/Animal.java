package com.mjc813.studyjava;

public class Animal {
    String name;
    int age;

    void eat(Object feed){
        System.out.println(name + "은 " + feed + "를 먹는다");
    }

    void sleep(){
        System.out.println(name + "은 잔다");
    }

    void move(){
        System.out.println(name + " 이동한다.");
    }

    Animal reproduce(String newName){
        name = newName;
        return this;
    }

}
