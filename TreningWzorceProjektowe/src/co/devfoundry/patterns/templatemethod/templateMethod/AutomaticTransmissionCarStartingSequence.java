package co.devfoundry.patterns.templatemethod.templateMethod;

public class AutomaticTransmissionCarStartingSequence {
    public void startTheCar(){
        fastenSeatBelts();
        startTheIgnition();
        setTheGear();
        go();

    }

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    private void setTheGear() {
        System.out.println("");

    }

    private void startTheIgnition() {
        System.out.println("Przekręcamy kluczyk");
    }

    private void fastenSeatBelts() {
        System.out.println("Zapinamy pasy");
    }
}
