package co.devfoundry.patterns.visitor;

import co.devfoundry.patterns.visitor.activity.Activity;
import co.devfoundry.patterns.visitor.activity.Squash;
import co.devfoundry.patterns.visitor.activity.Treadmill;
import co.devfoundry.patterns.visitor.activity.Weights;
import co.devfoundry.patterns.visitor.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String [] args) {

        Treadmill treadmill = new Treadmill (400);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        VisitorImpl visitor = new VisitorImpl();
        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("------------------------");
        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);

        activityList.forEach(activity -> activity.accept(visitor));
    }
}
