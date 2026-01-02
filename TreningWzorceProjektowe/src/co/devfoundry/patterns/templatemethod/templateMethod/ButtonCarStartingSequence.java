package co.devfoundry.patterns.templatemethod.templateMethod;

public class ButtonCarStartingSequence {
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
        System.out.println("Wybieramy bieg");

    }

    private void startTheIgnition() {
        System.out.println("Wciskamy guzik");
    }

    private void fastenSeatBelts() {
        System.out.println("Zapinamy pasy");
    }
}
