package headfirst.singleton;

/**
 * 饿汉单例
 * 缺点：不是懒加载模式
 *
 * @author evilhex.
 * @date 2018/10/15 下午12:40.
 */
public class HungrySingleton {
    private static int anInt = 1;

    private HungrySingleton() {
        System.out.println("instance is created!");
    }

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        // 饿汉模式缺点：在访问静态变量的时候，会造成单例的初始化
        System.out.println(HungrySingleton.anInt);
    }

}
