package pizzafm;

/**
 * 纽约风味Cheese Pizza
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
