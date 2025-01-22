package ObjectOrientedProgramming.interfacesDemo;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        car.stop();

        Media carMedia = new Car();
        carMedia.stop();

        NiceCar newCar = new NiceCar();
        newCar.start();
        newCar.mediaStart();
    }
}
