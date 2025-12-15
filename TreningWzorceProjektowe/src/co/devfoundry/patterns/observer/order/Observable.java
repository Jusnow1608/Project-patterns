package co.devfoundry.patterns.observer.order;

import co.devfoundry.patterns.observer.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
