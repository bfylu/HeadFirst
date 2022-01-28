package pizzafm;

/**
 * 纽约风味 Veggie Pizza
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Red Pepper");
    }
}
