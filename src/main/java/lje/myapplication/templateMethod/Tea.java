package lje.myapplication.templateMethod;

/**
 * Created by lijiane on 16/11/7.
 */

public class Tea extends CaffeeBerverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("...........Adding Lemon");
    }
}
