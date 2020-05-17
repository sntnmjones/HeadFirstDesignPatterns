package chapt3;

/**
 * Decorator
 */
public class Milk extends CondimentDecorator {
    // The beverage we are wrapping.
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}