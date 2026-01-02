package co.devfoundry.patterns.templatemethod.templateMethod;

public class ButtonCarStartingSequence extends CarStartingSequence{

    public void setTheGear() {
        System.out.println("Wybieramy bieg");

    }

    public void startTheIgnition() {
        System.out.println("Wciskamy guzik");
    }

}
