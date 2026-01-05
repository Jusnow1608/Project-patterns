package co.devfoundry.patterns.statetask;

import java.util.Random;

public class CoinInsertedState implements State{

    static final private Random random  = new Random();

    @Override
    public void insertTheCoin(SlotMachine slotMachine) {
        System.out.println("Moneta znajduję się już w automacie.");

    }

    @Override
    public void pullTheArm(SlotMachine slotMachine) {
        System.out.println("Trwa losowanie...");
        int result = random.nextInt(99);

        if(result<20) {
            System.out.println("Wygrana! Odbierz swoją nagrodę");
            slotMachine.state = new WinState();
        } else {
            System.out.println("Przegrana. Może następnym razem się uda?");
            slotMachine.state = new NoCoinState();
        }
    }

    @Override
    public void takeTheWin(SlotMachine slotMachine) {
        System.out.println("Pociągnij dźwignię, by sprawdzić swoje szczęście.");
    }

    @Override
    public void showCurrentState(SlotMachine slotMachine) {
        System.out.println("Aktualny stan - WRZUCONO MONETĘ");
    }
}
