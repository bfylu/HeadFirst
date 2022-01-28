package univyz.duck.ducks;



import univyz.duck.impl.FlyWithWings;
import univyz.duck.impl.Quack;
import univyz.duck.model.Duck;

/**
 * 绿头鸭子
 * @author bfy
 * @version 1.0.0
 */
public  class MallardDuck extends Duck {

    public MallardDuck(){
         quackBehavior = new Quack();
         flyBehavior = new FlyWithWings();
    }
    
    public void display() {
       System.out.println("green head");
    }
}
