public class Computer {
    String[] ComName = {"MJCCOM", "ACOM", "BCOM", "CCOM", "DCOM"};
    String[] CPU = {"Gen9_i5","Gen9_i7","Gen9_i9"};
    String[] Ram = {"4GB","8GB","16GB","32GB"};
    String[] Storage = {"SSD", "HDD"};
    String[] StorgeCapacity = {"500GB","1000GB","2000GB"};
    String[] Graphic = {"GTX_1660","RTX_4080","Intel_A770"};


    public void run(int ComName1) {
            System.out.println(ComName[ComName1]+"가 켜졌습니다.");
    }

    public void show(int ComName1, int CpuName, int RamName, int StorageName, int StorgeCapacity1, int GraphicName) {
        System.out.println(ComName[ComName1] +"의 정보입니다.");
        System.out.println("CPU : " + CPU[CpuName]);
        System.out.println("Ram : " + Ram[RamName]);
        System.out.println("Storage : " + Storage[StorageName]);
        System.out.println("StorgeCapacity : " + StorgeCapacity[StorgeCapacity1]);
        System.out.println("Graphic : " + Graphic[GraphicName]);
    }

    public void end(int ComName1) {
            System.out.println(ComName[ComName1]+"가 꺼집니다.\n");
    }
    public static void main(String[] args) {
        Computer com = new Computer();
        com.run(0);
        com.show(0, 2, 3 ,1 , 2, 1);
        com.end(0);
        Computer com2 = new Computer();
        com2.run(1);
        com2.show(1, 1 , 3, 1, 1 ,1);
        com2.end(1);
        Computer com3 = new Computer();
        com3.run(2);
        com3.show(2, 0 , 1 ,1 ,1 ,1);
        com3.end(2);
        Computer com4 = new Computer();
        com4.run(3);
        com4.show(3 , 2 , 3 ,0 ,0 ,0);
        com4.end(3);
        Computer com5 =  new Computer();
        com5.run(4);
        com5.show(4, 2 , 2 , 0, 2 ,2);
        com5.end(4);
        System.out.println("부팅 종료");

    }
}