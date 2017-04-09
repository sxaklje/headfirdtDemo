package lje.myapplication.factory;

/**
 * Created by lijiane on 16/11/3.
 */

public class PizzaStore  {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza createPizza(String type){
        final Pizza pizza = factory.createPizza(type);

        return pizza;
    }
}
