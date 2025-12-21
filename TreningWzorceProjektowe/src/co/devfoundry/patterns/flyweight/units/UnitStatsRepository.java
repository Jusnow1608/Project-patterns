package co.devfoundry.patterns.flyweight.units;

public class UnitStatsRepository {
        private static UnitStats destroyerUnitStats = new UnitStats("Destroyer", 200,100,50,25,200);
        private static UnitStats teslaTankUnitStats = new UnitStats("TeslaTank", 200,100,50,25, 200);
        private static UnitStats riflemanUnitStats = new UnitStats ("Rifleman", 25,100,50,25, 500);

        private UnitStatsRepository()   {  }

    public static UnitStats getDestroyerStats ()
        {
            return destroyerUnitStats;
        }

    public static UnitStats getTeslaTankStats ()
    {

        return teslaTankUnitStats;
    }

    public static UnitStats getRiflemanStats ()
    {

        return riflemanUnitStats;
    }
}

