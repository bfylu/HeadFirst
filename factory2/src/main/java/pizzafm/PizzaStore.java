package pizzafm;

/**
 * 下订单超类
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public abstract class PizzaStore {

    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
        return pizza;
    }
}
