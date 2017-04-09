package lje.myapplication.observer.weather;

import java.util.ArrayList;

/**
 * Created by lijiane on 16/10/30.
 */

public class WeatherData implements Subject {

    private ArrayList <Observer> observers;
    private  float temp;
    private  float humidity;
    private  float pressure;

    public WeatherData() {
         observers =new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer object) {
        observers.add(object);
    }

    @Override
    public void removeObserver(Observer object) {
        int i = observers.indexOf(object);
        if (i>=0){
            observers.remove(object);
        }

    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
       o.update(temp,humidity,pressure);
        }
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMessurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
    private  void  messureChanged(){
        notifyObserver();
    }
}
