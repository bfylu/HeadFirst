package starbuzzWithSizes.seasoning;

import starbuzzWithSizes.abst.Beverage;
import starbuzzWithSizes.abst.CondimentDecorator;

/**
 * 装饰者,所以让它扩展自CondimentDecorator.
 * <p>
 * 牛奶(调料)
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.31
 */
public class Milk extends CondimentDecorator {
    /**
     * 要让Milk能够引用一个Beverage,做法如下:
     */
    //(1)用一个实例变量记录饮料,也就是被装饰者.
    Beverage beverage;

    //(2)想办法让被装饰者(饮料)被记录到实例变量中.
    //这里的做法是:把饮料记录在实例变量中.
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return super.getSize();
    }

    //首先利用委托的做法:得到一个叙述,然后在其后加上附加的叙述(例如:"Milk")
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    //要计算带Milk饮料的价钱,首先把调用委托给被装饰对象,
    //以计算价钱,然后再加上Milk的价钱,得到最后结果
    @Override
    public double cost() {
        /*
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.10;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.20;
        }*/
        return beverage.cost() + 0.10;
    }
}
