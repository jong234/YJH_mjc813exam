package com.YJH.MyMailtest;

public class Main {
    public static void main(String[] args) {
        MyCalculator<Integer> mc = new MyCalculator<>();
        Integer n1 = mc.add(30, 50);
        Integer n2 = mc.sub(63, 23);
        MyCalculator<Double> mc2 = new MyCalculator<>();
        Double d1 = mc.add(30.01, 51.62);
        Double d2 = mc.sub(63.73, 23.13);
    }
}