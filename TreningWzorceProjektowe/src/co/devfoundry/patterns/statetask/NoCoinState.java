package co.devfoundry.patterns.statetask;

public class NoCoinState implements State {
    @Override
    public void insertTheCoin(SlotMachine slotMachine) {
        System.out.println("Wrzucono monetę.");
        slotMachine.state = new CoinInsertedState();
    }

    @Override
    public void pullTheArm(SlotMachine slotMachine) {
        System.out.println("Wrzuć monetę by zagrać.");
    }

    @Override
    public void takeTheWin(SlotMachine slotMachine) {
        System.out.println("Wrzuć monetę by dać sobie szansę na wygraną.");
    }

    @Override
    public void showCurrentState(SlotMachine slotMachine) {
        System.out.println("Aktualny stan - BRAK MONETY ");
    }
}
