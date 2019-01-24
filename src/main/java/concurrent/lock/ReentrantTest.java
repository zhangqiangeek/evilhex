package concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁测试
 *
 * @Author: evilhex
 * @Date: 2019-01-09 14:47
 */
public class ReentrantTest implements Runnable {
    ReentrantLock lock = new ReentrantLock();


    public void get() {
        lock.lock();
        System.out.println(Thread.currentThread().getId());
        set();
        lock.unlock();
    }

    public void set() {
        lock.lock();
        System.out.println(Thread.currentThread().getId());
        lock.unlock();
    }

    @Override
    public void run() {
        get();
    }

    public static void main(String[] args) throws Exception {
        ReentrantTest moreTest = new ReentrantTest();
        new Thread(moreTest).start();
        new Thread(moreTest).start();
        new Thread(moreTest).start();

    }
}
