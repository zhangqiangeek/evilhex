package headfirst.singleton;

/**
 * 静态内部类的单例模式:利用JVM本身机制保证了线程安全
 *
 * @author evilhex.
 * @date 2018/4/12 上午10:56.
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();

    }
    private Singleton() {
    }


    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}