package concurrent;

/**
 * @author evilhex
 * Created by evilhex on 2018/3/7.
 */
public class SafeThreadTest {
    static private volatile int value = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public void run() {
                    value++;
                    System.out.println("当前value值是：" + value);
                }
            }).start();
        }
    }
}
