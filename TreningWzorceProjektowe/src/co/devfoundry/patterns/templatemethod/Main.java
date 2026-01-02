package co.devfoundry.patterns.templatemethod;

import co.devfoundry.patterns.templatemethod.templateMethod.AutomaticTransmissionCarStartingSequence;
import co.devfoundry.patterns.templatemethod.templateMethod.ButtonCarStartingSequence;
import co.devfoundry.patterns.templatemethod.templateMethod.ClassicCarStartingSequence;

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
