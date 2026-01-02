package co.devfoundry.patterns.chainofresponsibilitytask.child;

import co.devfoundry.patterns.chainofresponsibilitytask.motherrequest.MotherRequest;

public class Ania extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania zdjęła słoik z półki!");
        } else {
            getTellerChild().processRequest(motherRequest);
        }

    }
}
