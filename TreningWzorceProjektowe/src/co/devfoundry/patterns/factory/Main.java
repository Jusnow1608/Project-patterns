package co.devfoundry.patterns.factory;

import co.devfoundry.patterns.factory.units.*;

public class Main {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);

        //Unit tank2 = new Tank(1,1,1);
        //dzięki temu, że przeniesiono klasy do jednej paczki units i zmieniono widoczność konstruktorów
        //w taki sposob, ze konstruktor UnitFactory stal sie chroniony, a konstruktory klas Tank i Rifleman
        //-domyslne, to z poziomu main uzytkownik nie ma mozliwosci tworzyc obiektow za pomoca konstrukorow

    }
}
