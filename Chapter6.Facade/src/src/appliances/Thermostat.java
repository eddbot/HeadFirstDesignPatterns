package src.appliances;

public class Thermostat {

    private int temperature;
    private boolean isOn = false;

    public Thermostat() {
        int roomTemperature = 18;
        this.temperature = roomTemperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public void on() {
        this.isOn = true;

    }
    public void off() {
        this.isOn = false;
    }
}
