package States;

import ParkingSpace.Car;

public class InsideCarState implements State {

    private final Car car;

    public InsideCarState(Car car) {
        this.car = car;
    }

    @Override
    public void openDoor() {
        System.out.println("you are already in the car!");

    }

    @Override
    public void turnKey() {
        System.out.println("you turn on the engine");
        car.setState(car.getState(Car.states.ENGINE_ON));
    }

    @Override
    public void putInDrive() {
        System.out.println("you need to turn on the engine!");
    }

    @Override
    public void drive() {
        System.out.println("you need to turn on the engine!");
    }

    @Override
    public void error() {
    }
}
