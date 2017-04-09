package lje.myapplication.factory;

/**
 * Created by lijiane on 16/11/3.
 */

public interface PizzaIngredientFactory  {
    public Dough createDough();
    public Clams  createClams();
    public Veggies createVeggies();
}
