package chapt3;

/**
 * Decorator
 */
public class Whip extends CondimentDecorator {
    // The beverage we are wrapping.
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}