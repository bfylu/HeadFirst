package starbuzzWithSizes.coffee;


import starbuzzWithSizes.abst.Beverage;

/**
 * 深焙
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.31
 */
public class DarkRoast extends Beverage {


    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
