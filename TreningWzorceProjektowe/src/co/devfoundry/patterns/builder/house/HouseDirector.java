package co.devfoundry.patterns.builder.house;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse()
    {
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildRooms();
        houseBuilder.buildWindows();
        houseBuilder.buildGarage();
        houseBuilder.buildDoors();
        houseBuilder.buildFloors();
    }
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
