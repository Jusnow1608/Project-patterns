package co.devfoundry.patterns.observertask.weatherforecast;

import co.devfoundry.patterns.observertask.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
