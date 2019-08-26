package top.bfylu.weatherobservable.impl;


import top.bfylu.weatherobservable.inter.DisplayElement;
import top.bfylu.weatherobservable.model.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者,布告
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.31
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    //Observable observable;
    private float temperature;
    private float humidity;

    //现在构造器需要Observable当参数,并将Current--nsDisplay对象登记成为观察者.
    public CurrentConditionsDisplay(Observable observable){
        //this.observable = observable;
        observable.addObserver(this);

    }

    //改变update()方法,增加Observable和数据对象作为参数
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            //在update()中,先确定可观察者属于WeatherData类型,
            WeatherData weatherData =(WeatherData)obs;
            //然后利用getter方法获取温度,湿度测量值,最后调用display();
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }


}
