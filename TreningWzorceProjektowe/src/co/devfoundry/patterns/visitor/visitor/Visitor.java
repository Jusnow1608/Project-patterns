package co.devfoundry.patterns.visitor.visitor;

import co.devfoundry.patterns.visitor.activity.Squash;
import co.devfoundry.patterns.visitor.activity.Treadmill;
import co.devfoundry.patterns.visitor.activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit (Squash squash);
    void visit (Weights weights);


}
