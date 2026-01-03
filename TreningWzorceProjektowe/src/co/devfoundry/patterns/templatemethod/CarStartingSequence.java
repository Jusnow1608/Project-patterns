package co.devfoundry.patterns.templatemethod;

public abstract class CarStartingSequence {
    public final void startTheCar(){
        fastenSeatBelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    public abstract void setTheGear();
    public abstract void startTheIgnition();

    private void fastenSeatBelts() {
        System.out.println("Zapinamy pasy");
    }

}
