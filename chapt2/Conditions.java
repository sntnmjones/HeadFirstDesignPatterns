package chapt2;

public class Conditions {
    private float temperature;
    private float humidity;
    private float pressure;

    public Conditions() {
        this.temperature = 0;
        this.humidity = 0;
        this.pressure = 0;
    }

    public void setConditions(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}