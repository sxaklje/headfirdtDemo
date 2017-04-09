package lje.myapplication.observer.weather;

/**
 * Created by lijiane on 16/10/30.
 */

public class CurrentConditionDisplay implements Subject ,Observer {
    private  WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humity, float pressure) {

    }

    @Override
    public void registerObserver(Observer object) {

    }

    @Override
    public void removeObserver(Observer object) {

    }

    @Override
    public void notifyObserver() {

    }
}
