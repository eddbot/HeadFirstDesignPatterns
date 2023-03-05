package States;

import ParkingSpace.Car;

public class OutsideCarState implements State {

    private final Car car;

    public OutsideCarState(Car car) {
        this.car = car;
    }

    @Override
    public void openDoor() {
        System.out.println("you open the door to the car");
        car.setState(car.getState(Car.states.INSIDE_CAR));
    }

    @Override
    public void turnKey() {
        error();
    }

    @Override
    public void putInDrive() {
        error();
    }

    @Override
    public void drive() {
        error();
    }

    @Override
    public void error() {
        System.out.println("you need to get in the car!");
    }
}
