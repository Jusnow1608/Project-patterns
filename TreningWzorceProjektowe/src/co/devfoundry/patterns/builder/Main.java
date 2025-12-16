package co.devfoundry.patterns.builder;

import co.devfoundry.patterns.builder.house.BigHouseBuilder;
import co.devfoundry.patterns.builder.house.House;
import co.devfoundry.patterns.builder.house.HouseDirector;
import co.devfoundry.patterns.builder.house.SmallHouseBuilder;

public class Main {
    public static void main(String[] args) {
//House house1 = new House("walls", "floors", "rooms", "roof", "windows", "doors", "garage");
//House house2 = new House("walls", "floors", "roof");

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}
