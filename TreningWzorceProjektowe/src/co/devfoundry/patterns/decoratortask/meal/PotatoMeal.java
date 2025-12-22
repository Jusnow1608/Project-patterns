package co.devfoundry.patterns.decoratortask.meal;

public class PotatoMeal extends Meal {
    public PotatoMeal() {
    }

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ziemniaków.");
    }
}
