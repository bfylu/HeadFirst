package starbuzz.seasoning;

import starbuzz.abst.Beverage;
import starbuzz.abst.CondimentDecorator;

/**
 * 装饰者,所以让它扩展自CondimentDecorator.
 * <p>
 * 豆浆(调料)
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.31
 */
public class Soy extends CondimentDecorator {
    /**
     * 要让Mocha能够引用一个Beverage,做法如下:
     */
    //(1)用一个实例变量记录饮料,也就是被装饰者.
    Beverage beverage;

    //(2)想办法让被装饰者(饮料)被记录到实例变量中.
    //这里的做法是:把饮料记录在实例变量中.
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //首先利用委托的做法:得到一个叙述,然后在其后加上附加的叙述(例如:"Soybean Milk")
        return beverage.getDescription() + ", Soybean Milk";
    }

    @Override
    public double cost() {
        //要计算带Soy饮料的价钱,首先把调用委托给被装饰对象,
        //以计算价钱,然后再加上Soy的价钱,得到最后结果
        return 0.15 + beverage.cost();
    }
}
