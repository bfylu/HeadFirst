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
public class HeatIndexDisplay implements Observer,DisplayElement {

    private float heatIndex = 0.0f;
    private float temperature;
    private float humidity;
    public HeatIndexDisplay(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = new WeatherData();
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            computeHeatIndex(temperature, humidity);
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
