package co.devfoundry.patterns.factorytask;


import co.devfoundry.patterns.factorytask.cars.*;

public class ContinentalFactory implements Factory{

    SteeringWheelPosition position = SteeringWheelPosition.LEFT;

    public Car buildBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case X5:
                return new BMW(1.4, "Gasoline", 2020, position);
            case E60:
                return new BMW(1.8, "Diesel", 2010, position);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    public Car buildFord(FordModel fordModel)
    {
        switch (fordModel) {
            case CMAX:
                return new Ford(1.25, "Petrol", 2019, position);
            case FOCUS:
                return new Ford(2.5, "Bensine", 2024, position);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
