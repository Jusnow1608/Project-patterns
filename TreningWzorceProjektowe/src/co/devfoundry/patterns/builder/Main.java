package co.devfoundry.patterns.builder;

import co.devfoundry.patterns.builder.house.House;

public class Main {
    public static void main(String[] args)
    {
//House house1 = new House("walls", "floors", "rooms", "roof", "windows", "doors", "garage");
//House house2 = new House("walls", "floors", "roof");

        House house = new House.HouseBuilder()
            .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildRooms("rooms")
                .build();

        System.out.println(house);
        }
    }
