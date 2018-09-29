package headfirst.singleton;

/**
 * 饿汉单例模式:依赖JVM在加载这个类的时候回唯一创建这个类的单件实例
 *
 * @author evilhex.
 * @date 2018/4/12 上午10:23.
 */
public class Singleton2 {

    /**
     * 这段代码保证了线程安全
     */
    private static Singleton2 singleton = new Singleton2();

    public static Singleton2 getInstance() {
        return singleton;
    }
}
