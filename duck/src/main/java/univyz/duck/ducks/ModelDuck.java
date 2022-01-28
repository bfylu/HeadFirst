package univyz.duck.ducks;

import univyz.duck.impl.FlyNoWay;
import univyz.duck.impl.Quack;
import univyz.duck.model.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        //一开始,我们的模型鸭是不会飞的.
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public  void display(){
        System.out.println("我是一只模型鸭");
    }

}
