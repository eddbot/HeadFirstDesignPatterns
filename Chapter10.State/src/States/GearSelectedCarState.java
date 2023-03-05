package States;

import ParkingSpace.Car;

public class GearSelectedCarState implements State {
    private final Car car;

    public GearSelectedCarState(Car car) {
        this.car = car;
    }

    @Override
    public void openDoor() {
        System.out.println("you are already in the car!");
    }

    @Override
    public void turnKey() {
        System.out.println("the engine is already running!");
    }

    @Override
    public void putInDrive() {
        System.out.println("the car is already in gear");
    }

    @Override
    public void drive() {
        System.out.println("you drive off into the sunset");
    }

    @Override
    public void error() {
    }
}
