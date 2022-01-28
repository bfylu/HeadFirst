package univyz.duck.ducks;

import univyz.duck.model.Duck;

/**
 * 诱饵鸭(木头假鸭,不会飞也不会叫)
 */
public class DecoyDuck extends Duck{

    public void decoyDuck(){
        display();
    }

    /*
    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
    */

    public void display() {
        System.out.println("诱饵鸭");
    }

}
