package co.devfoundry.patterns.chainofresponsibilitytask.child;

import co.devfoundry.patterns.chainofresponsibility.officer.OfficerRank;
import co.devfoundry.patterns.chainofresponsibilitytask.motherrequest.MotherRequest;

public class Tomek extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek zdjął słoik z półki!");
        } else {
            getTellerChild().processRequest(motherRequest);
        }

    }
}