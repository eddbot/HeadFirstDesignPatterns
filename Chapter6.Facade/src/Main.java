import src.appliances.Light;
import src.appliances.Stereo;
import src.appliances.Thermostat;
import src.facades.HomeAutomation;

public class Main {
    public static void main(String[] args) {

        // Manually doing the 'home automation' steps
        Light light = new Light();
        Stereo stereo = new Stereo();
        Thermostat thermostat = new Thermostat();

        light.on();
        stereo.on();
        stereo.tuneToStation("radio 1");
        stereo.setVolume(11);
        thermostat.on();
        thermostat.setTemperature(22);


        // Now let's use a facade to do everything with a press of one button
        HomeAutomation homeAutomation = new HomeAutomation(light, stereo, thermostat);

        homeAutomation.relaxingMood(); // Chill out with classical music
        homeAutomation.off();

        homeAutomation.partyMood(); // Techno time!
        homeAutomation.off();

    }
}