using System.Text.Json;
using System.Text.Json.Serialization;
using Chapter2.Observer.Interfaces;
using Microsoft.Extensions.Configuration;

namespace Chapter2.Observer.Models;

public class WeatherStation : ISubject
{
    private readonly IWeatherService _weatherService;
    public WeatherInformation WeatherInformation { get; private set; }

    public WeatherStation(IWeatherService weatherService)
    {
        _weatherService = weatherService;
    }
    private readonly List<IObserver> _observers = new List<IObserver>();
    
    public void AddObserver(IObserver observer)
    {
        _observers.Add(observer);
    }

    public void RemoveObserver(IObserver observer)
    {
        _observers.RemoveAll(o => o.GetHashCode() == observer.GetHashCode());
    }

    public void NotifyObservers()
    {
        _observers.ForEach(o => o.Update());
    }


    public async Task GetWeather()
    {
        WeatherInformation = await _weatherService.GetWeatherInformation();
        NotifyObservers();
    }
}