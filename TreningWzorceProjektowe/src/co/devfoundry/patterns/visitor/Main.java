package co.devfoundry.patterns.visitor;

import co.devfoundry.patterns.visitor.activity.Squash;
import co.devfoundry.patterns.visitor.activity.Treadmill;
import co.devfoundry.patterns.visitor.activity.Weights;

public class Main {
    public static void main(String [] args) {

        Treadmill treadmill = new Treadmill (200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        treadmill.calculateCaloriesBurned();
        squash.calculateCaloriesBurned();
        weights.calculateCaloriesBurned();
    }
}
