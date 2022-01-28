package pizzas;

/**
 * @author bfy
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    //PizzaStore的构造器,需要一个工厂作为参数
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        //而orderPizza()方法通过简单传入订单类型来使用工厂创建比萨
        //*我们把new 操作符替换成工厂对象的创建方法.这里不再使用具体实例化!
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //这里是其他方法
}
