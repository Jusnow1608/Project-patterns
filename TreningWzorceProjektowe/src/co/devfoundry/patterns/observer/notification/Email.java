package co.devfoundry.patterns.observer.notification;

import co.devfoundry.patterns.observer.order.Order;

public class Email implements Observer{
        public void update(Order order) {
            System.out.println("E-mail - zamowienie numer: " + order.getOrderNumber() + " zmienilo status na: " + order.getOrderStatus());
        }
    }
