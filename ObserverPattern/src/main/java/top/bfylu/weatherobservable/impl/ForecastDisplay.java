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
public class ForecastDisplay implements Observer,DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }
    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = new WeatherData();
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println(" Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
