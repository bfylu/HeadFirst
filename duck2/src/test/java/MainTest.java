import org.junit.Test;
import univyz.duck.ducks.MallardDuck;
import univyz.duck.ducks.ModelDuck;
import univyz.duck.impl.FlyRocketPowered;
import univyz.duck.model.Duck;

public class MainTest {

    @Test
    public  void mallardDuck(){
        Duck mallardDuck = new MallardDuck();
        //这会调用MallardDuck继承来的performFly()方法,
        //进而委托给该对象的QuackBehavior对象处理(也就是继承来的quackBehavior引用对象的quack())
        mallardDuck.performFly();

        mallardDuck.performQuack();
    }

    @Test
    public void ModelDuck(){
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
