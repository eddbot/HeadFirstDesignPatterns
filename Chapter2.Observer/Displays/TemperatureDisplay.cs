using Chapter2.Observer.Interfaces;

namespace Chapter2.Observer.Models;

public class TemperatureDisplay : IObserver, IDisplay
{
    private readonly WeatherStation _weatherStation;
    private double _temperature = 0.0;

    public TemperatureDisplay(WeatherStation weatherStation)
    {
        _weatherStation = weatherStation;
        _weatherStation.AddObserver(this);
    }
    public void Update()
    {
       _temperature = _weatherStation.WeatherInformation.Currently.Temperature;
       Display();

    }

    public void Display() => Console.WriteLine($"[Temperature] It's currently {_temperature}");
}