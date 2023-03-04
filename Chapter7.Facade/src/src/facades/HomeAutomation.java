package src.facades;

import src.appliances.Light;
import src.appliances.Stereo;
import src.appliances.Thermostat;

import java.util.stream.IntStream;

public class HomeAutomation {

    private final Light light;
    private final Stereo stereo;
    private final Thermostat thermostat;

    public HomeAutomation(Light light, Stereo stereo, Thermostat thermostat) {
        this.light = light;
        this.stereo = stereo;
        this.thermostat = thermostat;
    }

    public void relaxingMood() {
        light.on();
        stereo.on();
        stereo.setVolume(5);
        stereo.tuneToStation("classic fm");
        thermostat.on();
        thermostat.setTemperature(21);
    }

    public void partyMood() {
        light.on();
        light.off();
        stereo.on();
        stereo.setVolume(11);
        stereo.tuneToStation("techno fm");
        thermostat.on();
        thermostat.setTemperature(17);

        // Strobe light lol
        IntStream.range(0, 100).forEach(i -> {
            if (i % 2 == 0) {
                light.on();
            } else {
                light.off();
            }
        });
    }

    public void off() {
        light.off();
        stereo.off();
        thermostat.off();
    }
}
