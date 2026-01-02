package co.devfoundry.patterns.chainofresponsibilitytask.motherrequest;

import co.devfoundry.patterns.chainofresponsibilitytask.child.Shelf;

public class MotherRequest {

    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
