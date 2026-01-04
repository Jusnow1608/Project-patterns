package co.devfoundry.patterns.visitortask;

import co.devfoundry.patterns.visitortask.transport_category.Animal;
import co.devfoundry.patterns.visitortask.transport_category.Person;
import co.devfoundry.patterns.visitortask.transport_category.Shipment;
import co.devfoundry.patterns.visitortask.transport_category.Transportable;
import co.devfoundry.patterns.visitortask.visitor.NameTransportVisitor;
import co.devfoundry.patterns.visitortask.visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String [] args){

        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);

        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(activity -> activity.accept(priceTransportVisitor));
        System.out.println("-------------------------------------");
        transportableList.forEach(activity -> activity.accept(nameTransportVisitor));
    }
}
