package concurrent.demo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock的可重入性验证：一个线程可以多次持有同一个锁
 *
 * @author evilhex.
 * @date 2018/10/19 上午10:59.
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        System.out.println(lock.getHoldCount());

        lock.lock();
        System.out.println(lock.getHoldCount());

        lock.lock();
        System.out.println(lock.getHoldCount());

        lock.unlock();
        System.out.println(lock.getHoldCount());

        lock.unlock();
        System.out.println(lock.getHoldCount());

    }
}
