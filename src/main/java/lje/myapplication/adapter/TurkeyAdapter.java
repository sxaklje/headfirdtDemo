package lje.myapplication.adapter;

/**
 * Created by lijiane on 16/11/4.
 */

public class TurkeyAdapter implements Duck {
    Terky terky;
// 适配器模式，要转化成为那个对象，就要让适配器实现哪个对象的接口，同时在适配器初始化的时候，将要转化的对像传递进来
    public TurkeyAdapter(Terky terky) {
        this.terky = terky;
    }

    @Override
    public void quack() {
        terky.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            terky.fly();
        }
    }

}
