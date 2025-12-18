package co.devfoundry.patterns.factory;

public class Main {
    public static void main(String[] args) {

        Unit tank = new Tank(200,0,20);
        Unit infantryman = new Rifleman(100,0,10);

    }
}
