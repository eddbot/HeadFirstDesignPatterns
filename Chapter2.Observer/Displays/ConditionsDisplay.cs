using Chapter2.Observer.Interfaces;

namespace Chapter2.Observer.Models;

public class ConditionsDisplay : IObserver, IDisplay
{
    private readonly WeatherStation _weatherStation;
    private string? _conditions;

    public ConditionsDisplay(WeatherStation weatherStation)
    {
        _weatherStation = weatherStation;
        _weatherStation.AddObserver(this);
    }
    public void Update()
    {
        _conditions = _weatherStation.WeatherInformation.Currently.Summary;
        Display();

    }

    public void Display() => Console.WriteLine($"[Conditions] It's currently {_conditions}");
}