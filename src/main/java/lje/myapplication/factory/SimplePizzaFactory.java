package lje.myapplication.factory;

/**
 * Created by lijiane on 16/11/3.
 */

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
