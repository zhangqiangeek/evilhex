package headfirst.singleton;

/**
 * 饿汉单例
 * 缺点：不是懒加载模式
 *
 * @author evilhex.
 * @date 2018/10/15 下午12:40.
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
