package ParkingSpace;

import States.*;

public class Car {

    public enum states {
        OUTSIDE_CAR,
        INSIDE_CAR,
        ENGINE_ON,
        IN_GEAR
    }

    private final OutsideCarState outsideCarState = new OutsideCarState(this);
    private final InsideCarState insideCarState = new InsideCarState(this);
    private final EngineOnCarState engineOnCarState = new EngineOnCarState(this);
    private final GearSelectedCarState gearSelectedCarState = new GearSelectedCarState(this);

    private State state;

    public Car() {
        this.state = outsideCarState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState(states state) {
        return switch (state) {
            case OUTSIDE_CAR -> this.outsideCarState;
            case INSIDE_CAR -> this.insideCarState;
            case ENGINE_ON -> this.engineOnCarState;
            case IN_GEAR -> this.gearSelectedCarState;
        };
    }

    public void getInTheCar() {
        this.state.openDoor();
    }

    public void startEngine() {
        this.state.turnKey();
    }

    public void putIntoGear() {
        this.state.putInDrive();
    }

    public void driveOff() {
        this.state.drive();
    }
}
