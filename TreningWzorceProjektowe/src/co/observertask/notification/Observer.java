package co.observertask.notification;

import co.observertask.weatherforecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
