package lje.myapplication.starbuzz;

/**
 * Created by lijiane on 16/10/31.
 */

public  abstract  class Beverage {
     String describtion = "unkown beverage";

    public String getDescribtion() {
        return describtion;
    }
    public abstract double cost();
}
