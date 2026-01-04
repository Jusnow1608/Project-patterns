package co.devfoundry.patterns.strategytask.pricing_strategy;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
