package lje.myapplication.singletonmodel;

/**
 * Created by lijiane on 16/11/3.
 */

public class Person {
    public static volatile  Person person;
    // volatile 关键词 确保
    private Person(){}
    /*
    *  懒汉模式 不考虑线程安全
    * */
    public static Person  getPersonInstance(){
        if (person==null){
            person=new Person();
        }
        return person;
    }

    /*
    * 双层检查加锁模式 在getinstance 中减少同步，提高效率
    * */
    public static  Person getPersonInstance3(){

        if (person==null){//先判断对象是否为空然后在进入同步块
            synchronized (Person.class){
                if (person==null){
                    person=new Person();
                }
            }

        }

        return null;
    }

    /*
    * 饿汉模式
    * */
    public static Person getPersonInstance2()
    {
      person=new Person();
        return person;
    }
}
