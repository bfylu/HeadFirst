package starbuzzWithSizes.abst;

/**
 * Beverage是一个抽解类
 * 有两个方法:getDescription(),cost();
 *
 * @author bfy
 * @version 1.0.0
 * @data 2018.2.1
 */
public abstract class Beverage {

    public Size size = Size.TALL;
    public String description = "Unknown Beverage";

    //getDescription()已经在此实现了,但是cost()必须在子类中实现
    public String getDescription() {
        System.out.println("description: " + description);
        return description;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

    public enum Size {TALL, GRANDE, VENTI}

}
