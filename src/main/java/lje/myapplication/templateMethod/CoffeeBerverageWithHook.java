package lje.myapplication.templateMethod;

/**
 * Created by lijiane on 16/11/7.
 */

public abstract class CoffeeBerverageWithHook {

    abstract void brew();

    abstract void pourCup();

    protected void addCondition() {
        System.out.print("addcondition");


    }

    protected void boiltWater() {
        System.out.print("boiltwater");
    }

    Boolean customerWantsConditions() {
        return true;
    }
}
