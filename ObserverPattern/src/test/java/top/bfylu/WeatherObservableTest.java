package top.bfylu;

import org.junit.Test;
import top.bfylu.weatherobservable.impl.CurrentConditionsDisplay;
import top.bfylu.weatherobservable.impl.ForecastDisplay;
import top.bfylu.weatherobservable.impl.HeatIndexDisplay;
import top.bfylu.weatherobservable.impl.StatisticsDisplay;
import top.bfylu.weatherobservable.model.WeatherData;

public class WeatherObservableTest {

    @Test
    public void WeatherTest(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        //模拟新的气象测量
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
