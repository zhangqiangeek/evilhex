package concurrent.demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 多线程计算
 *
 * @Author: evilhex
 * @Date: 2018-12-12 15:31
 */
public class ThreadCompetitionDemo {
    static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5000000; i++) {
                    count.getAndAdd(1);
                }
                System.out.println("自定义线程:计算完成...，耗时" + (System.currentTimeMillis() - start));
            }
        }.start();
        for (int i = 0; i < 5000000; i++) {
            count.getAndAdd(1);
        }
        System.out.println("主线程:计算完成....，耗时" + (System.currentTimeMillis() - start));
        Thread.sleep(10000);
        System.out.println("count:" + count);
    }
}
