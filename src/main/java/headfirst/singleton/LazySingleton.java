package headfirst.singleton;

/**
 * 懒汉式，线程安全
 *
 * @author evilhex.
 * @date 2018/10/15 上午11:28.
 */
public class LazySingleton {
    private static LazySingleton instance;

    public static synchronized LazySingleton getInstance() {
        instance = new LazySingleton();
        return instance;
    }
}
