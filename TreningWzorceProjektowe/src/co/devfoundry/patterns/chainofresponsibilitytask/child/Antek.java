package co.devfoundry.patterns.chainofresponsibilitytask.child;

import co.devfoundry.patterns.chainofresponsibility.officer.OfficerRank;
import co.devfoundry.patterns.chainofresponsibilitytask.motherrequest.MotherRequest;

public class Antek extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjął słoik z półki!");
        } else {
            getTellerChild().processRequest(motherRequest);
        }

    }
}