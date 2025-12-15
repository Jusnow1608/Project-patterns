package co.devfoundry.patterns.observer.notification;

import co.devfoundry.patterns.observer.order.Order;

public class MobileApp implements Observer{
    public void update(Order order) {
        System.out.println("Aplikacja mobilna - zamowienie numer: " + order.getOrderNumber() + " zmienilo status na: " + order.getOrderStatus());
    }
}
