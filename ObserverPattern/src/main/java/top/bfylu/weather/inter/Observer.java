package top.bfylu.weather.inter;

/**
 * 观察者
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.30
 */
public interface Observer {
    /**
     * 当气象观测值改变时,主题会把这些状态值当作方法的参数,传送给观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}

