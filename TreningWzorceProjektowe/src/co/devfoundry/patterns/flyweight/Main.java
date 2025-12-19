package co.devfoundry.patterns.flyweight;

import co.devfoundry.patterns.flyweight.units.Destroyer;
import co.devfoundry.patterns.flyweight.units.Rifleman;
import co.devfoundry.patterns.flyweight.units.TeslTank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<Object> activeUnits = new ArrayList<>();

    for (int i = 0; i<10000000; i++)
    {
    activeUnits.add(new TeslTank("TeslaTank", 200,100,50,25,0,0, 200, 500));
    activeUnits.add(new Rifleman("Rifleman", 25,100,50,25,0,0, 25,500));
    activeUnits.add(new Destroyer("Destroyer", 200,100,50,25,0,0,200,300));
    }
    }
}
