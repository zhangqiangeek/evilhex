package headfirst.singleton;

/**
 * 同步getInstance方法单例模式
 * 缺点：效率低下，
 *
 * @author evilhex.
 * @date 2018/4/12 上午10:14.
 */
public class Singleton1 {

    private static Singleton1 singleton;

    public static synchronized Singleton1 getInstance() {
        if (singleton == null) {
            return new Singleton1();
        } else {
            return singleton;
        }
    }
}
