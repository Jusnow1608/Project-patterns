package co.devfoundry.patterns.statetask;

public class Main {
    public static void main (String [] args)
    {
    SlotMachine slotMachine = new SlotMachine();

    slotMachine.insertTheCoin();
    slotMachine.showCurrentState();

    slotMachine.pullTheArm();
    slotMachine.showCurrentState();

    slotMachine.takeTheWin();
    slotMachine.showCurrentState();
    }
}
