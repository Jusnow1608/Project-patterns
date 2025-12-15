package co.devfoundry.patterns.observertask.weatherforecast;

import co.devfoundry.patterns.observertask.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    int temperature;
    int pressure;
    Set<Observer> registeredObservers = new HashSet<Observer>() ;

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }

    }

    public void updateForecast(int temperature, int pressure)
    {
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }
}
