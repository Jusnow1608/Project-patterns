package co.devfoundry.patterns.templatemethod;

public class Main {
    public static void main(String[] args) {

       // ClassicCarStartingSequence classic = new ClassicCarStartingSequence();
       // classic.startTheCar();

        ButtonCarStartingSequence button = new ButtonCarStartingSequence();
        button.startTheCar();

        //AutomaticTransmissionCarStartingSequence automatic = new AutomaticTransmissionCarStartingSequence();
        //automatic.startTheCar();

    }
}
