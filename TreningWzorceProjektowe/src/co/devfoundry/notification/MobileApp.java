package co.devfoundry.notification;

import co.devfoundry.order.Order;

public class MobileApp {
    public void updateOrderStatus(Order order) {
        System.out.println("Aplikacja mobilna - zamowienie numer: " + order.getOrderNumber() + " zmienilo status na: " + order.getOrderStatus());
    }
}
