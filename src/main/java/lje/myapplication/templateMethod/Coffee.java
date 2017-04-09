package lje.myapplication.templateMethod;

/**
 * Created by lijiane on 16/11/7.
 */

public class Coffee extends CaffeeBerverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
