package starbuzz;

import org.junit.Test;
import starbuzz.coffee.HouseBlend;

public class StarbuzzTest {
    @Test
    public void starbuzz() {
        HouseBlend houseBlend = new HouseBlend();
        houseBlend.cost();
        houseBlend.getDescription();
    }
}
