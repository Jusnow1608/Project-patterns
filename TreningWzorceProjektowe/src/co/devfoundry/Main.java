package co.devfoundry;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import co.devfoundry.notification.Email;
import co.devfoundry.notification.MobileApp;
import co.devfoundry.notification.TextMessage;
import co.devfoundry.order.Order;
import co.devfoundry.order.OrderStatus;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

TextMessage textMessage = new TextMessage();
MobileApp mobileApp = new MobileApp();
Email email = new Email();

textMessage.updateOrderStatus(order);
mobileApp.updateOrderStatus(order);
email.updateOrderStatus(order);

        }
    }