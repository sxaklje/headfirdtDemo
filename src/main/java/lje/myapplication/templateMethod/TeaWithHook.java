package lje.myapplication.templateMethod;

/**
 * Created by lijiane on 16/11/7.
 */

public class TeaWithHook extends CoffeeBerverageWithHook {
    @Override
    void brew() {
        System.out.println("Steeping the tea");

    }

    @Override
    void pourCup() {

    }

    @Override
    protected void addCondition() {
        super.addCondition();
        System.out.println("Adding Lemon");

    }

    @Override
    Boolean customerWantsConditions() {
        String s = "lllll";
        if (s.contains("1")) {
            return true;
        } else {
            return false;
        }
    }
}
