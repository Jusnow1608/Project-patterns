package co.devfoundry.patterns.chainofresponsibilitytask.child;

import co.devfoundry.patterns.chainofresponsibilitytask.motherrequest.MotherRequest;

public abstract class Child {
  private Child tellerChild;

  public abstract void processRequest(MotherRequest motherRequest);

  public Child getTellerChild() {
        return tellerChild;
    }

    public void setTellerChild(Child tellerChild) {
        this.tellerChild = tellerChild;
    }
}
