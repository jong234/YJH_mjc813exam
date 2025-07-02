package com.YJH.MyMailtest.P6_17;

public class Main {
    public static void main(String[] args) {
        printHuman p1 = new printHuman((str, age) ->  System.out.println(str + "님의 나이는 "+ age + " 입니다."));
        PrintCar printCar = new PrintCar();
        printCar.print((x, y) -> {
            System.out.println("자동차 " + x +"의 년식은 " + y + " 입니다.");
        });
    }
}
