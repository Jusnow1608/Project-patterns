package co.devfoundry.patterns.observer.notification;

import co.devfoundry.patterns.observer.order.Order;

public class TextMessage implements Observer{
    public void update(Order order)
    {
        System.out.println("SMS - zamowienie numer: "+ order.getOrderNumber()+ " zmienilo status na: "+ order.getOrderStatus());
    }
}
