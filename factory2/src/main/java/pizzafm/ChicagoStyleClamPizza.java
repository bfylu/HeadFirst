package pizzafm;

/**
 * 芝加哥风格蛤蜊比萨
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.2
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "芝加哥风格蛤蜊比萨";
        dough = "特厚的外壳面团";
        sauce = "李子西红柿酱";

        toppings.add("切丝马苏里拉奶酪");
        toppings.add("切萨皮克湾的冻蛤蜊");
    }

    void cut() {
        System.out.println("把披萨切成方片");
    }
}
