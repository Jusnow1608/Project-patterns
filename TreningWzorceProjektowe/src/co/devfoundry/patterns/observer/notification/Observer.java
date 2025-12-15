package co.devfoundry.patterns.observer.notification;

import co.devfoundry.patterns.observer.order.Order;

public interface Observer {
    void update (Order order);
}
