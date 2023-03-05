package States;

import ParkingSpace.Car;

public class EngineOnCarState implements State {
    private final Car car;

    public EngineOnCarState(Car car) {
        this.car = car;
    }

    @Override
    public void openDoor() {
        System.out.println("you are already in the car!");
    }

    @Override
    public void turnKey() {
        System.out.println("the engine is already on!");
    }

    @Override
    public void putInDrive() {
        System.out.println("you put the car in drive");
        car.setState(car.getState(Car.states.IN_GEAR));
    }

    @Override
    public void drive() {
        System.out.println("you need to put the car in gear!");
    }

    @Override
    public void error() {
    }
}
