package co.devfoundry.patterns.flyweight.units;

public class Rifleman {
    private String name;
    private int hp;
    private int armour;
    private int damageDealt;
    private int speed;
    private int x;
    private int y;
    private int hpLeft;
    private int resourceCost;

    public Rifleman(String name, int hp, int armour, int damageDealt, int speed,  int y, int x,  int hpLeft, int resourceCost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.speed = speed;
        this.y = y;
        this.x = x;
        this.hpLeft = hp;
        this.resourceCost = resourceCost;
    }
}
