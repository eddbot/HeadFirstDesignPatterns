package ParkingSpace;

import States.*;

public class Car {

    public OutsideCarState outsideCarState = new OutsideCarState(this);
    public InsideCarState insideCarState = new InsideCarState(this);
    public EngineOnCarState engineOnCarState = new EngineOnCarState(this);
    public GearSelectedCarState gearSelectedCarState = new GearSelectedCarState(this);

    private State state;

    public Car() {
        this.state = outsideCarState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void getInTheCar() {
        this.state.openDoor();
    }

    public void startEngine(){
        this.state.turnKey();
    }

    public void putIntoGear(){
        this.state.putInDrive();
    }

    public void driveOff(){
        this.state.drive();
    }
}
