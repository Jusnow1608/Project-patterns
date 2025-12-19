package co.devfoundry.patterns.factory.units;

abstract public class Factory {

    abstract public InfantryUnit createInfantryUnit(UnitType type);
    abstract public MechanizedUnit createMechanizedUnit(UnitType type);
    abstract public AirUnit createAirUnit(UnitType type);
}
