package univyz.duck.impl;

import univyz.duck.inter.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
