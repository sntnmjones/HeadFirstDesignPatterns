package chapt2;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private Conditions conditions = new Conditions();

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        conditions.setConditions(temperature, humidity, pressure);
        measurementChanged();
    }

    public void measurementChanged() {
        notifyObservers();
    }

    // v v v v Subject methods v v v v 
    public void registerObserver(Observer observer) {
        observers.add(observer);
    };

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    };

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(conditions);
        }
    };
}