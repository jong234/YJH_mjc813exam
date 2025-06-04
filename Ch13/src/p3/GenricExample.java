package p3;

public class GenricExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnlight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();

    }
}
