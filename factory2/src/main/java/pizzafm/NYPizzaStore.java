package pizzafm;

/**
 * 纽约风味批萨店
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }

}
