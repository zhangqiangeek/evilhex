package headfirst.observer;

/**
 * 观察者设计模式
 *
 * @author evilhex.
 * @date 2018/3/22 下午6:49.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
