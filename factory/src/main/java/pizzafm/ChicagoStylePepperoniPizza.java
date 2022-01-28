package pizzafm;

/**
 * 芝加哥样式辣香肠比萨
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "芝加哥样式辣香肠比萨";
        dough = "特厚的外壳面团";
        sauce = "李子西红柿酱";

        toppings.add("切丝马苏里拉奶酪");
        toppings.add("黑橄榄");
        toppings.add("菠菜");
        toppings.add("茄子");
        toppings.add("切好的意大利辣香肠");
    }

    void cut() {
        System.out.println("把披萨切成方片");
    }
}
