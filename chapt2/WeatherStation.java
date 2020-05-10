package chapt2;

public class WeatherStation {
    WeatherData weatherData;
    
    public WeatherStation() {
        this.weatherData = new WeatherData();
    }

    public void run() throws Exception {
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        Thread.sleep(1000);
        weatherData.setMeasurements(83, 67, 30.2f);
        Thread.sleep(1000);
        weatherData.setMeasurements(91, 60, 29.9f);
    }
}