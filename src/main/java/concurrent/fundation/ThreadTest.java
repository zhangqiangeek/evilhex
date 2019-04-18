package concurrent.fundation;

/**
 * @Author: evilhex
 * @Date: 2019-04-10 19:26
 */
public class ThreadTest {
    private static boolean flag = true;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (flag) {
                System.out.println(Thread.currentThread().getName() + "is running! biu biu biu");
            }
        });
        thread.start();

        flag = false;
    }
}
