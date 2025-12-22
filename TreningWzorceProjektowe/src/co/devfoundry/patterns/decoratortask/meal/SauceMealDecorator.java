package co.devfoundry.patterns.decoratortask.meal;

public class SauceMealDecorator extends MealDecorator {
    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    private void addSauce(){
        System.out.println("Do dania dodaje sos.");
    }
    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }
}
