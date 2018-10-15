package headfirst.singleton;

/**
 * 双重加锁验证
 * 问题：为什么需要加锁两次？为什么要声明成为volatile变量？
 *
 * @author evilhex.
 * @date 2018/10/15 上午11:33.
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    return new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
