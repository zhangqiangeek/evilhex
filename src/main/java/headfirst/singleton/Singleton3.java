package headfirst.singleton;

/**
 * 双重检测锁定单例模式：这个做法可以大大减少getInstance的时间耗费
 * 1、详见java并发编程的艺术69页，详细的介绍双重检查锁定
 * 2、双重检查锁定的两种解决方案：基于volatile的方案和基于类初始化的解决方案；
 * 3、创建一个对象可以分为三个步骤：非配对象的内存空间；初始化对象；设置instance指向刚刚分配的内存地址
 *
 * @author evilhex.
 * @date 2018/4/12 上午10:28.
 */
public class Singleton3 {

    /**
     * 声明为volatile是保证了可见性，禁止指令重排序，防止出现线程不安全的场景
     */
    private volatile static Singleton3 singleton;

    public static Singleton3 getInstance() {
        //第一次检查
        if (singleton == null) {
            synchronized (Singleton3.class) {
                //第二次检查
                if (singleton == null) {
                    return new Singleton3();
                }
            }
        }
        return singleton;
    }
}
