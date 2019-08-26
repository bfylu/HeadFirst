package top.bfylu.weatherobservable.model;

import java.util.Observable;

/**
 * 可观察者
 * @author bfy
 * @version 1.0.0
 * @data 2018.1.31
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        //在调用notifyObservers()前,要先调用setChanged()来指示状态已经改变.
        notifyObservers();//我们没有调用notifyObservers()传递数据对象,这表示我们采用的做法是"拉"
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //这些并不是新方法,只是应为我们要使用"拉"的做法,所以才提醒你有这些方法,观察者会利用这些方法取得WeatherData对象的状态
    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

}
