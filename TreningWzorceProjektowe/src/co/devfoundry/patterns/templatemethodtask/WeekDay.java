package co.devfoundry.patterns.templatemethodtask;

public abstract class WeekDay {

   public final void dayAtWork(TransportType transportType){
        wakeUp();
        dressUp();
        eatBreakfast();
        brashTeeth();
        int time = goToWork(transportType);
        summary(time);
        work();
        goHome();
    }

    private void summary(int time) {
        System.out.println("Trasa do pracy zajęła: " + time + " minut");
    }

    public void goHome(){
        System.out.println("Powrót do domu");
    }

    public abstract void work() ;

    public abstract int goToWork(TransportType transportType);

    private void brashTeeth() {
        System.out.println("Mycie zębów");
        
    }

    private void eatBreakfast() {

        System.out.println("Zjedzenie śniadania");
    }

    private void dressUp() {

        System.out.println("Ubieranie się");
    }

    private void wakeUp() {

        System.out.println("Pobudka");
    }
}
