package it.figuccia;
@SuppressWarnings("deprecation")

public class Tester {
    public static void main(String[] args) {
        Car car = new Car("Panda 4x4", 102250);
        car.printCarDetails();
        car.getCarDetails();
    }
}
