package headfirst.singleton;

/**
 * 静态内部类实现单例
 * 注意：构造函数和静态内部了都是私有声明的
 *
 * @author evilhex.
 * @date 2018/10/15 下午12:43.
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
        System.out.println("instance is created");
    }

    private static class SingletonHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
