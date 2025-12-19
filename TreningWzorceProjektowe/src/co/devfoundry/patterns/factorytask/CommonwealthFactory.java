package co.devfoundry.patterns.factorytask;

import co.devfoundry.patterns.factorytask.cars.*;

public class CommonwealthFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;

    public Car buildBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case X5:
                return new BMW(1.25, "LPG", 2020, position);
            case E60:
                return new BMW(1.5, "Bensine", 2010, position);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
   public  Car buildFord(FordModel fordModel)
    {
        switch (fordModel) {
            case CMAX:
                return new Ford(1.25, "Petrol", 2019, position);
            case FOCUS:
                return new Ford(2.0, "Bensine", 2024, position);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

}
