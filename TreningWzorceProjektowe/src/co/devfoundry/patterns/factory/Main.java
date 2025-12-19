package co.devfoundry.patterns.factory;

import co.devfoundry.patterns.factory.units.*;

public class Main {
    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redtank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redinfantryman = redFactory.createInfantryUnit(UnitType.RIFLEMAN);

        MechanizedUnit bluetank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueinfantryman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);

        AirUnit redhelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);
        AirUnit bluehelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);


    }
}
