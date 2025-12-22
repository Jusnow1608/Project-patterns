package co.devfoundry.patterns.adapter;

public class UKToContinentalAdapter implements ContinentalDevice {

    private UKDevice device;

    public UKToContinentalAdapter(UKDevice device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.powerOn();

    }
}
