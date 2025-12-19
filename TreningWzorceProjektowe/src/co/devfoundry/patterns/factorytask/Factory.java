package co.devfoundry.patterns.factorytask;

import co.devfoundry.patterns.factorytask.cars.BMWModel;
import co.devfoundry.patterns.factorytask.cars.Car;
import co.devfoundry.patterns.factorytask.cars.FordModel;

public interface Factory {

   Car buildBMW(BMWModel bmwModel);
   Car buildFord(FordModel fordModel);

}
