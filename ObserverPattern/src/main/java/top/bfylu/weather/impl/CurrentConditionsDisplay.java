package top.bfylu.weather.impl;

import top.bfylu.weather.inter.DisplayElement;
import top.bfylu.weather.inter.Observer;
import top.bfylu.weather.inter.Subject;

/**
 * 布告
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.30
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    //构造器需要weatherData对象(也就是主题)作为注册之用
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    //当update()被调用时,我们把温度和湿度保存起来,然后调用display().
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    //display()方法就只是把最近的温度和湿度显示出来
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }


}
