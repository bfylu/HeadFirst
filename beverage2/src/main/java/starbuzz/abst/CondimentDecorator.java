package starbuzz.abst;


/**
 * CondimentDecorator是一个抽像类,继承Beverage,就能取代Beverage,
 * 所以将CondimentDecorator扩展自Beverage类
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.1
 */
public abstract class CondimentDecorator extends Beverage {
    //所有的调料装饰者都必须重新实现getDescription()方法,
    public abstract String getDescription();

}
