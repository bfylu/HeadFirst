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
public class StatisticsDisplay implements Observer,DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private float temperature;
    private int numReadings;
    //Observable observable;

    public StatisticsDisplay(Observable observable){
        //this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = new WeatherData();
            this.temperature = weatherData.getTemperature();
            tempSum += temperature;
            numReadings++;

            if (temperature > maxTemp) {
                maxTemp = temperature;
            }

            if (temperature < minTemp) {
                minTemp = temperature;
            }

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) +"/"+ maxTemp + "/" + minTemp);
    }
}
