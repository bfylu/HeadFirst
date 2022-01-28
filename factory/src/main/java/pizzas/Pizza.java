package pizzas;

import java.util.ArrayList;

/**
 * 简单工厂
 *
 * @author bfy
 */
abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    //准备
    public void prepare() {
        System.out.println("Preparing " + name);
    }

    //烘焙
    public void bake() {
        System.out.println("Baking " + name);
    }

    //切
    public void cut() {
        System.out.println("Cutting " + name);
    }

    //装盒子
    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        //显示比萨名称和配料的代码
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + "----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
