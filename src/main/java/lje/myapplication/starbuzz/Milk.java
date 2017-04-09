package lje.myapplication.starbuzz;

/**
 * Created by lijiane on 16/10/31.
 */

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescribtion() {
        return beverage.getDescribtion()+", milk";
    }

    @Override
    public double cost() {
        return .10+beverage.cost();
    }
}
