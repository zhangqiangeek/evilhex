package headfirst.singleton;

/**
 * 静态内部类实现单例
 *
 * @author evilhex.
 * @date 2018/10/15 下午12:43.
 */
public class InnerClassSingleton {

    private static class SingletonHolder {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static final InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
