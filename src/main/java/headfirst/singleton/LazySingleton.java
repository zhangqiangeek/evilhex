package headfirst.singleton;

/**
 * 懒汉式，线程安全
 *
 * @author evilhex.
 * @date 2018/10/15 上午11:28.
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            return new LazySingleton();
        }
        return instance;
    }
}
