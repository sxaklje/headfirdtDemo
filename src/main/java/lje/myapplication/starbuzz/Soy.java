package lje.myapplication.starbuzz;

/**
 * Created by lijiane on 16/10/31.
 */

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescribtion() {
        return beverage.getDescribtion()+", soy";
    }

    @Override
    public double cost() {
        return 0.99+ beverage.cost();
    }
}
