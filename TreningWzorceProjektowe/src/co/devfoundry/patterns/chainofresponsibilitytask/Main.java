package co.devfoundry.patterns.chainofresponsibilitytask;

import co.devfoundry.patterns.chainofresponsibilitytask.child.*;
import co.devfoundry.patterns.chainofresponsibilitytask.motherrequest.MotherRequest;

public class Main {
    public static void main(String [] args)
    {
//      MotherRequest motherRequest= new MotherRequest (Shelf.LOW);
//      MotherRequest motherRequest= new MotherRequest (Shelf.MEDIUM);
        MotherRequest motherRequest= new MotherRequest (Shelf.HIGH);

        Child ania = new Ania();
        Child antek = new Antek();
        Child tomek = new Tomek();

        ania.setTellerChild(antek);
        tomek.setTellerChild(ania);

        tomek.processRequest(motherRequest);
    }
    }
