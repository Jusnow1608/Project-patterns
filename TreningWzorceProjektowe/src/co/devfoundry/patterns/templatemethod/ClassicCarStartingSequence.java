package co.devfoundry.patterns.templatemethod;

public class ClassicCarStartingSequence extends CarStartingSequence {

    public ClassicCarStartingSequence() {
    }

    public void setTheGear() {
        System.out.println("Wybieramy bieg");
        
    }

    public void startTheIgnition() {
        System.out.println("Przekręcamy kluczyk");
    }

}
