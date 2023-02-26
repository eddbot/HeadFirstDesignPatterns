using System.Text.Json;
using Chapter2.Observer.Interfaces;
using Chapter2.Observer.Models;
using Microsoft.Extensions.Configuration;

namespace Chapter2.Observer.Services;

public class WeatherService : IWeatherService
{
    private readonly IConfiguration _configuration;

    public WeatherService(IConfiguration configuration)
    {
        _configuration = configuration;
    }

    public async Task<WeatherInformation> GetWeatherInformation()
    {
        var client = new HttpClient();
        var url = _configuration.GetValue<string>("WeatherUrl");
        var response = await client.GetAsync(url);
        var body = await response.Content.ReadAsStringAsync();
        var serializeOptions = new JsonSerializerOptions
        {
            PropertyNamingPolicy = JsonNamingPolicy.CamelCase,
        };
        var weather = JsonSerializer.Deserialize<WeatherInformation>(body, serializeOptions);

        if (weather is not null)
        {
            return weather;
        }

        throw new ArgumentNullException(nameof(weather));
    }
}