package lje.myapplication.adapter;

import java.util.Random;

/**
 * Created by lijiane on 16/11/4.
 */

public class DuckAdapter implements Terky {
    Duck duck;
    Random random;
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if  (random.nextInt(5)==0){
            duck.fly();
        }

    }
}
