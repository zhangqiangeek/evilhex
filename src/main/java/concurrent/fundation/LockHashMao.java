package concurrent.fundation;

import java.util.HashMap;
import java.util.UUID;

/**
 * 多线程环境下对HashMap执行put操作会发生死锁
 *
 * @author evilhex.
 * @date 2018/10/19 上午10:06.
 */
public class LockHashMao {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>(2);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            map.put(UUID.randomUUID().toString(), "");
                        }
                    }, "ftf" + i);
                }
            }
        }, "ftf");

        t.start();
        t.join();
    }
}
