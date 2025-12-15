package co.observertask.notification;

import co.observertask.weatherforecast.WeatherForecast;

public class InternetNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast)
    {
        System.out.println("Internet - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, cisnienie: "+ weatherForecast.getPressure());
    }
}
