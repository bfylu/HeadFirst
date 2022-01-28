package pizzas;

/**
 * SimplePizzaFactory是我们的新类,它只做一件事情,帮它的客户创建比萨.
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public class SimplePizzaFactory {
    //首先,在这个工厂内定义一个createPizza()方法.所有客户用这个方法来实例化新对象.

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
