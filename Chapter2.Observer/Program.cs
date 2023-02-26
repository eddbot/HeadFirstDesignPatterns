using Chapter2.Observer.Models;
using Chapter2.Observer.Services;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Hosting;

using IHost host = Host.CreateDefaultBuilder(args).Build();
var config = new ConfigurationBuilder()
    .AddUserSecrets<Program>()
    .Build();


    var weatherService = new WeatherService(config);
    var weatherStation = new WeatherStation(weatherService);

    var temperatureDisplay = new TemperatureDisplay(weatherStation);
    var conditionsDisplay = new ConditionsDisplay(weatherStation);

for (var i = 0; i < 10; i++)
{
    Thread.Sleep(1000);
    await weatherStation.GetWeather();
    if (i == 4)
    {
        weatherStation.RemoveObserver(temperatureDisplay);
    }

    if (i == 7)
    {
        weatherStation.RemoveObserver(conditionsDisplay);
        weatherStation.AddObserver(temperatureDisplay);
    }
}