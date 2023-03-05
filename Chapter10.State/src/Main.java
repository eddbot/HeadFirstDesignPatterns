import ParkingSpace.Car;

public class Main {
    public static void main(String[] args) {
        // This works as all the steps are in order
        Car car = new Car();
        car.getInTheCar(); // you open the door to the car
        car.startEngine(); // you turn on the engine
        car.putIntoGear(); // you put the car in drive
        car.driveOff(); // you drive off into the sunset

        // This does not work, as the steps are wonky
        car = new Car();
        car.putIntoGear(); // you need to get in the car!
        car.startEngine(); // you need to get in the car!
        car.getInTheCar(); // you open the door to the car
        car.driveOff(); // you need to turn on the engine!
    }
}