package pizzafm;

/**
 * 芝加哥深盘素食比萨饼
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "芝加哥深盘素食比萨饼";
        dough = "特厚的外壳面团";
        sauce = "李子西红柿酱";

        toppings.add("切丝马苏里拉奶酪");
        toppings.add("黑橄榄");
        toppings.add("菠菜");
        toppings.add("茄子");
    }

    void cut() {
        System.out.println("把披萨切成方片");
    }
}
