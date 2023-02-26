using Chapter2.Observer.Models;

namespace Chapter2.Observer.Interfaces;

public interface IWeatherService
{
    public Task<WeatherInformation> GetWeatherInformation();
}