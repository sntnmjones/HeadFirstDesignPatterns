package chapt2;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Conditions conditions;
    private Subject weatherData;
    private float avgTemp;
    private float avgHum;
    private int timesCalled;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.avgTemp = 0;
        this.avgHum = 0;
        this.timesCalled = 0;
    }

    public void update(Conditions conditions) {
        this.conditions = conditions;
        calcStats();
        display();
    }

    private void calcStats() {
        if (timesCalled == 0) {
            avgTemp = conditions.getTemperature();
            avgHum = conditions.getHumidity();
        } else {
            avgTemp = (avgTemp + conditions.getTemperature()) / 2f;
            avgHum = (avgHum + conditions.getHumidity()) / 2f; 
        }
        timesCalled++;
    }

    public void display() {
        System.out.println("Statistics includes: " + avgTemp + "degrees, " + avgHum + "% humidity.");
    }
}