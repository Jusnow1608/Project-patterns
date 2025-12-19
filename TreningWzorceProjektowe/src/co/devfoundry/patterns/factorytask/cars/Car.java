package co.devfoundry.patterns.factorytask.cars;

abstract public class Car {

    private double engineCapacity;
    private String fuelType;
    private int productionYear;
    private SteeringWheelPosition steeringWheelPosition;

    public Car(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
