package univyz.duck.impl;

import univyz.duck.inter.QuackBehavior;

/**
 * 会呱呱叫
 */
public class Quack implements QuackBehavior{


    public void quack() {
        //todo 实现鸭子呱呱叫
        System.out.println("呱呱叫");
    }
}
