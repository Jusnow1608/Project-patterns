package co.observertask.weatherforecast;

import co.observertask.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
