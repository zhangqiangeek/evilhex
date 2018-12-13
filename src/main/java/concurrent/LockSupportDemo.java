package concurrent;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupportDemo使用
 *
 * @Author: evilhex
 * @Date: 2018-12-12 16:25
 */
public class LockSupportDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            private int count = 0;

            @Override
            public void run() {
                long start = System.currentTimeMillis();
                long end = 0;
                while ((end - start) <= 1000) {
                    count++;
                    end = System.currentTimeMillis();
                }
                System.out.println("after 1 second.count=" + count);
                // 等待获取许可
                LockSupport.park();
                System.out.println("thread over." + Thread.currentThread().isInterrupted());
            }
        });
        t.start();
        t.interrupt();
        System.out.println("main thread over!");
    }
}
