package pizzafm;

/**
 * 纽约风味Clam Pizza
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
