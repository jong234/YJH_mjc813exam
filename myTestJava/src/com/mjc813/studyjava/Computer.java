package com.mjc813.studyjava;

public class Computer {
    String name = "Computer";
    String CPU = null;
    String Ram = null;
    String Storage = null;
    String Graphic = null;

    void Computer(String ComName) {
        name = ComName;
        System.out.println("이름: " + this.nullCheck(name));
        System.out.println("CPU: " + this.nullCheck(CPU));
        System.out.println("Ram: " + this.nullCheck(Ram));
        System.out.println("Storage: " + this.nullCheck(Storage));
        System.out.println("Graphic: " + this.nullCheck(Graphic));
    }

    void Computer(String ComName, String CPU1) {
        name = ComName;
        CPU = CPU1;
        System.out.println("이름: " + this.nullCheck(name));
        System.out.println("CPU: " + this.nullCheck(CPU));
        System.out.println("Ram: " + this.nullCheck(Ram));
        System.out.println("Storage: " + this.nullCheck(Storage));
        System.out.println("Graphic: " + this.nullCheck(Graphic));
    }
    void Computer(String ComName, String CPU1, String Ram1) {
        name = ComName;
        CPU = CPU1;
        Ram = Ram1;
        System.out.println("이름: " + this.nullCheck(name));
        System.out.println("CPU: " + this.nullCheck(CPU));
        System.out.println("Ram: " + this.nullCheck(Ram));
        System.out.println("Storage: " + this.nullCheck(Storage));
        System.out.println("Graphic: " + this.nullCheck(Graphic));
    }

    void Computer(String ComName, String CPU1, String Ram1, String Storage1) {
        name = ComName;
        CPU = CPU1;
        Ram = Ram1;
        Storage = Storage1;
        System.out.println("이름: " + this.nullCheck(name));
        System.out.println("CPU: " + this.nullCheck(CPU));
        System.out.println("Ram: " + this.nullCheck(Ram));
        System.out.println("Storage: " + this.nullCheck(Storage));
        System.out.println("Graphic: " + this.nullCheck(Graphic));
    }

    void Computer(String ComName, String CPU1, String Ram1, String Storage1, String Graphic1) {
        name = ComName;
        CPU = CPU1;
        Ram = Ram1;
        Storage = Storage1;
        Graphic = Graphic1;
        System.out.println("이름: " + this.nullCheck(name));
        System.out.println("CPU: " + this.nullCheck(CPU));
        System.out.println("Ram: " + this.nullCheck(Ram));
        System.out.println("Storage: " + this.nullCheck(Storage));
        System.out.println("Graphic: " + this.nullCheck(Graphic));
    }


    void run(String input) {
        System.out.println(input + "가 부팅 했습니다.");
    }

    void end(String input) {
        System.out.println(input + "가 종료 되었습니다.\n");
    }
    public String nullCheck(String input) {
        if (input == null) {
           return "조립중입니다.";
        }else{
            return input;
        }

    }
    public static void main(String[] args) {
        Computer com1 = new Computer();
        com1.run("mjcComputer");
        com1.Computer("mjcComputer");
        com1.end("mjcComputer");

        Computer com2 = new Computer();
        com2.run("AComputer");
        com2.Computer("AComputer", "Gen9_i5");
        com2.end("AComputer");

        Computer com3 = new Computer();
        com3.run("BComputer");
        com3.Computer("BComputer", "Gen9_i7", "16GB");
        com3.end("BComputer");

        Computer com4 = new Computer();
        com4.run("CComputer");
        com4.Computer("CComputer", "Gen9_i9", "32GB", "HDD 500GB");
        com4.end("CComputer");

        Computer com5 = new Computer();
        com5.run("DComputer");
        com5.Computer("DComputer", "Gen9_i9", "32GB", "SSD 2000GB", "GTX_1660");
        com5.end("DComputer");

        Mouse mouse = new Mouse();
        mouse.leftClick(200, 400);
        mouse.rightClick(600, 800);
    }
}