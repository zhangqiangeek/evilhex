package headfirst.observer.impl;

import headfirst.observer.DisplayElement;
import headfirst.observer.Observer;
import headfirst.observer.Subject;

/**
 * 布告板类
 *
 * @author evilhex.
 * @date 2018/3/22 下午7:36.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions :"+temperature+"F degress and "+humidity+"% humidity");
    }
}
