package chapt2;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Conditions conditions;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(Conditions conditions) {
        this.conditions = conditions;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + conditions.getTemperature() + "degrees, " + conditions.getHumidity() + "% humidity.");
    }
}