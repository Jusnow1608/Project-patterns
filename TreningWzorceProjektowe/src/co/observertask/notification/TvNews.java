package co.observertask.notification;

import co.observertask.weatherforecast.WeatherForecast;

public class TvNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast)
    {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, cisnienie: "+ weatherForecast.getPressure());
    }
}
