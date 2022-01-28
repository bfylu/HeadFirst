package starbuzz;


import org.junit.Test;
import starbuzzWithSizes.abst.Beverage;
import starbuzzWithSizes.coffee.DarkRoast;
import starbuzzWithSizes.coffee.Espresso;
import starbuzzWithSizes.coffee.HouseBlend;
import starbuzzWithSizes.seasoning.Mocha;
import starbuzzWithSizes.seasoning.Soy;
import starbuzzWithSizes.seasoning.Whip;

public class StarbuzzWhitSizeCoffee {

    @Test
    public void StarbuzzCoffeeTest() {
        //订一杯Espresso,不需要调料,打印出它的描述与价钱.
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }

    @Test
    public void DarkRoastTest() {

        Beverage beverage2 = new DarkRoast(); //制造出一个DarkRoast对象.
        beverage2 = new Mocha(beverage2); //用Mocha装饰它,
        beverage2 = new Mocha(beverage2);   //用第二个Mocha装饰它,
        beverage2 = new Whip(beverage2);    //用Whip装饰它.
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }

    @Test
    public void HouseBlendTest() {

        //最后,再来一杯调料为豆浆,摩卡,奶泡的HouseBlend咖啡.\
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
