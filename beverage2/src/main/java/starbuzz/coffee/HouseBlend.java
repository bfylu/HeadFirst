package starbuzz.coffee;

import starbuzz.abst.Beverage;

/**
 * 综合(黑咖啡)
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.31
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }


    @Override
    public double cost() {
        return 0.89;
    }
}
