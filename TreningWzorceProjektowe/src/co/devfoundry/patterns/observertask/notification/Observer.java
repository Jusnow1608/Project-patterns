package co.devfoundry.patterns.observertask.notification;

import co.devfoundry.patterns.observertask.weatherforecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
