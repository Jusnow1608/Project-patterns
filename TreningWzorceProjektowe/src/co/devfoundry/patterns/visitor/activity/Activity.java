package co.devfoundry.patterns.visitor.activity;

import co.devfoundry.patterns.visitor.visitor.Visitor;

public interface Activity {

    void accept (Visitor visitor);
}
