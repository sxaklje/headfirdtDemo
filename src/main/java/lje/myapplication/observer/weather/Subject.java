package lje.myapplication.observer.weather;

/**
 * Created by lijiane on 16/10/30.
 */

public interface Subject {
    public  void registerObserver(Observer object);
    public  void removeObserver(Observer object);
    public  void notifyObserver();
}