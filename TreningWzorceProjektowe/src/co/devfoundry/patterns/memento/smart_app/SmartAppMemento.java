package co.devfoundry.patterns.memento.smart_app;

class SmartAppMemento {

    private double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    double getVersion() {
        return version;
    }
}
