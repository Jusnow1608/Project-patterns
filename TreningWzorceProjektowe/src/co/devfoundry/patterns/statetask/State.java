package co.devfoundry.patterns.statetask;

public interface State {

    public void insertTheCoin (SlotMachine slotMachine);

    public void pullTheArm (SlotMachine slotMachine);

    public void takeTheWin (SlotMachine slotMachine);

    public void showCurrentState (SlotMachine slotMachine);
}
