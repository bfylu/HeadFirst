package univyz.duck.impl;

import univyz.duck.inter.FlyBehavior;

/**
 * 不会飞
 * @author bfy
 * @version 1.0.0
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        //todo
        System.out.println("不会飞");
    }
}
