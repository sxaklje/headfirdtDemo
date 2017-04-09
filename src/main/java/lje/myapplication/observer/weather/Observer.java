package lje.myapplication.observer.weather;

/**
 * Created by lijiane on 16/10/30.
 */

public interface Observer {
    public void update(float temp,float humity,float pressure);
}
