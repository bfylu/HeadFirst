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
public class StatisticsDisplay implements Observer,DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private Subject weatherData;

    //构造器需要weatherData对象(也就是主题)作为注册之用
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) +"/"+ maxTemp + "/" + minTemp);
    }
}
