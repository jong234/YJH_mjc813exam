public class Computer {
    String[] ComName = {"MJCCOM", "ACOM", "BCOM", "CCOM", "DCOM"};
    String[] CPU = {"Gen9_i5","Gen9_i7","Gen9_i9"};
    String[] Ram = {"4GB","8GB","16GB","32GB"};
    String[] Storage = {"SSD", "HDD"};
    String[] StorgeCapacity = {"500GB","1000GB","2000GB"};
    String[] Graphic = {"GTX_1660","RTX_4080","Intel_A770"};

    Computer(String[] ComName, String[] CPU, String[] Ram, String[] Storage, String[] storgeCapacity , String[] Graphic) {
        this.ComName = ComName;
        this.CPU = CPU;
        this.Ram = Ram;
        this.Storage = Storage;
        this.StorgeCapacity = storgeCapacity;
        this.Graphic = Graphic;
    }


    public void run() {
            System.out.println(ComName+"가 켜졌습니다.");
    }

    public void show() {
        System.out.println(ComName +"의 정보입니다.");
        System.out.println("CPU : " + CPU);
        System.out.println("Ram : " + Ram);
        System.out.println("Storage : " + Storage);
        System.out.println("StorgeCapacity : " + StorgeCapacity);
        System.out.println("Graphic : " + Graphic);
    }

    public void end() {
            System.out.println(ComName+"가 꺼집니다.");
    }
    public static void main(String[] args) {
        Computer com = new Computer(new String[1], new String[2], new String[2], new String[1], new String[2], new String[2]);
        com.run();
        com.show();
        com.end();
        Computer com2 = new Computer(new String[2], new String[3], new String[4], new String[1], new String[1], new String[2]);
        com2.run();
        com2.show();
        com2.end();
        Computer com3 = new Computer(new String[3], new String[1], new String[4], new String[1], new String[2], new String[2]);
        com3.run();
        com3.show();
        com3.end();
        Computer com4 = new Computer(new String[4], new String[2], new String[1], new String[2], new String[2], new String[2]);
        com4.run();
        com4.show();
        com4.end();
        Computer com5 =  new Computer(new String[5], new String[3], new String[4], new String[1], new String[3], new String[1]);
        com5.run();
        com5.show();
        com5.end();
        System.out.println("부팅 종료");

    }
}