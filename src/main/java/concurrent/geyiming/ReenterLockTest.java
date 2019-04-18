package concurrent.geyiming;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: evilhex
 * @Date: 2019-04-11 17:25
 */
public class ReenterLockTest implements Runnable {

    public static ReentrantLock lock = new ReentrantLock();

    public static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            lock.lock();
            try {
                i++;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ReenterLockTest reenterLockTest = new ReenterLockTest();
        Thread t1 = new Thread(reenterLockTest);
        Thread t2 = new Thread(reenterLockTest);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
