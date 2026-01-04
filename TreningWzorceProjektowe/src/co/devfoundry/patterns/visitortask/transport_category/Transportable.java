package co.devfoundry.patterns.visitortask.transport_category;

import co.devfoundry.patterns.visitortask.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
