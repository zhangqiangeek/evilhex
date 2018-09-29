package headfirst.observer.impl;

import headfirst.observer.Observer;
import headfirst.observer.Subject;

import java.util.ArrayList;

/**
 * subject类，负责通知的发放
 *
 * @author evilhex.
 * @date 2018/3/22 下午6:56.
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 设置变量值，并且通知观察者
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 注册观察者
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(observer);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
}
