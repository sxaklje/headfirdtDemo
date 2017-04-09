package lje.myapplication.observer.weather;

/**
 * Created by lijiane on 16/10/30.
 */

public class statisticDisplay implements  Observer ,DisplayElement {
    private  WeatherData weatherData;

    public statisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(statisticDisplay.this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humity, float pressure) {
        display();
    }
}
