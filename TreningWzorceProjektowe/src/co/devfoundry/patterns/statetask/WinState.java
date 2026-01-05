package co.devfoundry.patterns.statetask;

public class WinState implements State{
    @Override
    public void insertTheCoin(SlotMachine slotMachine) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void pullTheArm(SlotMachine slotMachine) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void takeTheWin(SlotMachine slotMachine) {
        System.out.println("Zabrano monety. Gratulacje.");
        slotMachine.state = new NoCoinState();
    }

    @Override
    public void showCurrentState(SlotMachine slotMachine) {
        System.out.println("Aktualny stan - WYGRANA");
    }
}
