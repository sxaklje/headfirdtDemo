package lje.myapplication.templateMethod;

/**
 * Created by lijiane on 16/11/7.
 */

public  abstract  class CaffeeBerverage  {

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.print("boilwater");
    }

    void pourinCup() {

        System.out.print(".........pourincup");
    }

    public   final  void prpareRecipe(){
        boilWater();
        addCondiments();
        brew();
        pourinCup();
    }
}
