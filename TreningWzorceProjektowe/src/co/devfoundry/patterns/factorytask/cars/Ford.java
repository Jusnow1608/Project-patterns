package co.devfoundry.patterns.factorytask.cars;

public class Ford extends Car {
    public Ford(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition steeringWheelPosition) {
        super(engineCapacity, fuelType, productionYear, steeringWheelPosition);
    }
}
