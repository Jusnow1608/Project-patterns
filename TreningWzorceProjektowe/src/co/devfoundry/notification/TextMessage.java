package co.devfoundry.notification;

import co.devfoundry.order.Order;

public class TextMessage {
    public void updateOrderStatus(Order order)
    {
        System.out.println("SMS - zamowienie numer: "+ order.getOrderNumber()+ " zmienilo status na: "+ order.getOrderStatus());
    }
}
