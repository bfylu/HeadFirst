package pizzafm;

/**
 * 芝加哥风格批萨店
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */

//ChicagoPizzaStore扩展PizzaStore,所以拥有orderPizza()方法(以及其他方法).
public class ChicagoPizzaStore extends PizzaStore {

    //createPizza()返回一个Pizza对象由子类全权负责实例化哪一个具体Pizza
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
