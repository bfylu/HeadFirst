package univyz.duck.model;

import univyz.duck.inter.FlyBehavior;
import univyz.duck.inter.QuackBehavior;

/**
 * 鸭子的超类
 * @author bfy
 * @version 1.0.1
 */
public  class Duck {

    //在Duck类中"加入两个实例变量",
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;


    public void swim(){
        System.out.println("游泳");
    }

    //鸭子的外观
    public  void display(){
    }

    public void performQuack(){
        quackBehavior.quack();

    }

    public void performFly(){
        flyBehavior.fly();
    }

    //动态设定行为
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
