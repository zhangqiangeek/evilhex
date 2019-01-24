package headfirst.observer;


/**
 * 观察者设计模式：主题类
 *
 * @author evilhex.
 * @date 2018/3/22 下午6:47.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
