namespace Chapter2.Observer.Models;

public record WeatherInformation(
    float Latitude,
    float Longitude,
    string? Timezone,
    Currently Currently
    );

public record Currently(
    float ApparentTemperature,
    float CloudCover,
    float DewPoint,
    float Humidity,
    float Pressure,
    string? Summary,
    float Temperature
    );
