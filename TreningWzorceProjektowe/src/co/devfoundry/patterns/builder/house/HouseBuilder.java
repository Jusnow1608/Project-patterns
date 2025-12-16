package co.devfoundry.patterns.builder.house;

public interface HouseBuilder {
    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildGarage();
    void buildWindows();
    void buildDoors();

    House getHouse();
}
