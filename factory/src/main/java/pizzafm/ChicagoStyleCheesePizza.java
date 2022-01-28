package pizzafm;

/**
 * 芝加哥风格深盘芝士披萨
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "芝加哥风格深盘芝士披萨";
        dough = "特厚的外壳面团";
        sauce = "李子西红柿酱";

        toppings.add("切丝马苏里拉奶酪");
    }

    void cut() {
        System.out.println("把披萨切成方片");
    }

}
