package com.mjc813.studyjava.interfacej;

public class Bicycle implements IBicycle {
    String name;
    int wheelCount;

    Bicycle(String name, int wheelCount) {
        this.name = name;
        this.wheelCount = wheelCount;
    }

    @Override
    public String dive() {
        return this.wheelCount + "개의 바퀴의 자전거" + this.name + "을 이동한다.";
    }

    @Override
    public String breakk() {
        return "자전거" + this.name + "을 정지한다.";
    }
}
