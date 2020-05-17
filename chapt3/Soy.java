package chapt3;

/**
 * Decorator
 */
public class Soy extends CondimentDecorator {
    // The beverage we are wrapping.
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + .15;
    }
}