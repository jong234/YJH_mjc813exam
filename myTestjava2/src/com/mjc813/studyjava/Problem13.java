package com.mjc813.studyjava;


public class Problem13 {
    String name, id, pw;
    int age = 0;


    public void Member(String name, String id, String pw, int age) {
            this.name = name;
            this.id = id;
            this.pw = pw;
            this.age = age;

            System.out.println("Member: " + name + " " + id + " " + pw + " " + age);
    }

    public void Member(String name, String id) {
        this.name = name;
        this.id = id;

        System.out.println("Member: " + name + " " + id);
    }

}
