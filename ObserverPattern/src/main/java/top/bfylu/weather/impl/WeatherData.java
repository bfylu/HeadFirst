package top.bfylu.weather.impl;

import top.bfylu.weather.inter.Observer;
import top.bfylu.weather.inter.Subject;

import java.util.ArrayList;

/**
 * 气象主题
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.30
 */
public class WeatherData implements Subject {

    private ArrayList observers; //我们加上一个ArrayList来纪录观察者,
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        //此ArrayList是在构造器中建立的.
        observers = new ArrayList();
    }

    //当注册观察者时,我们只要把它加到ArrayList的后面即可.
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //同样地,当观察者想取消注册,我们把它从ArrayList中删除即可.
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    //在这里,我们把状态告诉每一个观察者,因为观察者都实现了update(),所以我们知道如何通知它们.
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    //当从气象站得到更新观测值时,我们通知观察者
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //WeatherData的其他方法
}
