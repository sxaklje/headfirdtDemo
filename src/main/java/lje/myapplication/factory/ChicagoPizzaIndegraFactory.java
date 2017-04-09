package lje.myapplication.factory;

/**
 * Created by lijiane on 16/11/3.
 */

public class ChicagoPizzaIndegraFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Clams createClams() {
        return new freshClams();
    }

    @Override
    public Veggies createVeggies() {
        return new Eggplant();
    }
    public  Veggies[] createdVeggies(){
        Veggies veggiles[]= {new Eggplant(),new Spinach()};
        return veggiles;
    }
}
