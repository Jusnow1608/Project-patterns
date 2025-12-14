package co.devfoundry.notification;

import co.devfoundry.order.Order;

public class Email {
        public void updateOrderStatus(Order order) {
            System.out.println("E-mail - zamowienie numer: " + order.getOrderNumber() + " zmienilo status na: " + order.getOrderStatus());
        }
    }
