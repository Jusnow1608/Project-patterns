package co.devfoundry.patterns.templatemethodtask;

public abstract class WorkingDaySequence {

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
        System.out.println("Wracam do domu"); 
    }

    public abstract void work() ;

    public abstract void goToWork(TransportType transportType);

    private void brashTeeth() {
        System.out.println("Myję zęby");
        
    }

    private void eatBreakfast() {
        System.out.println("Jem śniadanie");
    }

    private void dressUp() {
        System.out.println("Ubieram się");
    }

    private void wakeUp() {
        System.out.println("Pobudka");
    }


}
