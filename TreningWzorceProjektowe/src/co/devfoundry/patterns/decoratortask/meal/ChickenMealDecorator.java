package co.devfoundry.patterns.decoratortask.meal;

public class ChickenMealDecorator extends MealDecorator {

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }
    private void addChicken(){
       System.out.println("Do dania dodaje kurczaka.");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }
}
