package co.devfoundry.patterns.observer;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import co.devfoundry.patterns.observer.notification.Email;
import co.devfoundry.patterns.observer.notification.MobileApp;
import co.devfoundry.patterns.observer.notification.TextMessage;
import co.devfoundry.patterns.observer.order.Order;
import co.devfoundry.patterns.observer.order.OrderStatus;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

TextMessage textMessage = new TextMessage();
MobileApp mobileApp = new MobileApp();
Email email = new Email();

order.registerObserver(textMessage);
order.registerObserver(mobileApp);
order.registerObserver(email);

order.notifyObservers();

System.out.println("---------------------------------------------");
order.changeOrderStatus(OrderStatus.WYSLANE);

order.unregisterObserver(email);
System.out.println("---------------------------------------------");
order.changeOrderStatus(OrderStatus.ODEBRANE);
        }
    }