package headfirst.observer.impl;

/**
 * @author evilhex.
 * @date 2018/3/23 下午2:03.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        //向weatherData注册，接受通知
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
