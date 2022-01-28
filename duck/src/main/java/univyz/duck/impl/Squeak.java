package univyz.duck.impl;

import univyz.duck.inter.QuackBehavior;

/**
 * 假鸭子,吱吱叫
 *
 * @author bfy
 * @version 1.0.0
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        //todo 橡皮鸭子吱吱叫
        System.out.println("吱吱叫");
    }
}
