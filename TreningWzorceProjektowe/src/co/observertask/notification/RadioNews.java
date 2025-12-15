package co.observertask.notification;

import co.observertask.weatherforecast.WeatherForecast;

public class RadioNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast)
    {
        System.out.println("Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, cisnienie: "+ weatherForecast.getPressure());
    }
}
