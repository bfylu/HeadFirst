package pizzafm;

import java.util.ArrayList;

/**
 * 批萨(超类)
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    //准备
    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }

    }

    //烘焙
    void bake() {
        System.out.println("Bake for 25 minutes at 35 350");
    }

    //切
    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    //装盒子
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        //显示比萨名称和配料的代码
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
