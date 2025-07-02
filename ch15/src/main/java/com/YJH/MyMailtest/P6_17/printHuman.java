package com.YJH.MyMailtest.P6_17;

public class printHuman implements INumberProc {
    String str = "홍길동";
    Integer age = 25;

    printHuman(INumberProc inp) {
        inp.process(str, age);
    }

    @Override
    public void process(String str, Integer age) {
        this.str = str;
        this.age = age;
    }


}
