package starbuzzWithSizes.coffee;

import starbuzzWithSizes.abst.Beverage;

/**
 * 浓缩
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.31
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {

        return 1.99;
    }

}
