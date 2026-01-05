package co.devfoundry.patterns.facade;

import co.devfoundry.patterns.facade.deliverybox.DeliveryBoxFacade;

public class Main {
    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();

    }
}
