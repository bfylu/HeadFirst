package starbuzz.coffee;


import starbuzz.abst.Beverage;

/**
 * 低咖啡因
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.1
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
