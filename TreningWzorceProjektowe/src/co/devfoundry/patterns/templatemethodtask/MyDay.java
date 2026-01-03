package co.devfoundry.patterns.templatemethodtask;

public class MyDay extends WeekDay {

    @Override
    public void work() {
        System.out.println("Picie kawy i praca");
    }

    @Override
    public int goToWork(TransportType transportType) {
        switch(transportType) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 20;
            default:
                return 20;
        }
    }
}
