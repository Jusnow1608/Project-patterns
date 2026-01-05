package co.devfoundry.patterns.statetask;

public class SlotMachine {

    State state;

    public SlotMachine (){
        this.state = new NoCoinState();
    }

    public void insertTheCoin(){
        state.insertTheCoin(this);
    }

    public void pullTheArm(){
        state.pullTheArm(this);
    }

    public void takeTheWin (){
        state.takeTheWin(this);
    }

    public void showCurrentState(){
        state.showCurrentState(this);
    }
}
