package co.devfoundry.patterns.visitortask.visitor;

import co.devfoundry.patterns.visitortask.transport_category.Animal;
import co.devfoundry.patterns.visitortask.transport_category.Person;
import co.devfoundry.patterns.visitortask.transport_category.Shipment;

public interface TransportVisitor {

    void visit (Animal animal);
    void visit (Person person);
    void visit (Shipment shipment);
}
