package univyz.duck.ducks;

import univyz.duck.model.Duck;

/**
 * 橡皮鸭子不会呱呱叫,不会飞
 */
public class RubberDuck extends Duck {

    public void rubberDuck(){
        display();
    }



    /*
        @Override
        public void fly() {
            //todo
        }
        @Override
        public void quack() {
            System.out.println("吱吱叫");
        }
        */
    @Override
    public void display() {
        System.out.println("橡皮鸭子");
    }
}
