package concurrent.lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁
 * https://mp.weixin.qq.com/s/qWhcgKxrWz0ei_pKlSynpA
 * http://ifeve.com/java_lock_see4/
 *
 * @Author: evilhex
 * @Date: 2019-01-09 14:48
 */
public class SpinLock {

    private AtomicReference<Thread> owner = new AtomicReference<>();

    public void lock() {
        Thread current = Thread.currentThread();
        while (!owner.compareAndSet(null, current)) {
        }
    }

    public void unLock() {
        Thread current = Thread.currentThread();
        owner.compareAndSet(current, null);
    }

}

/**
 * 可重入自旋锁实现
 */

class ReenSpinLock {
    private AtomicReference<Thread> owner = new AtomicReference<>();

    private int count = 0;

    public void lock() {
        Thread current = Thread.currentThread();
        if (current == owner.get()) {
            count++;
            return;
        }
        while (!owner.compareAndSet(null, current)) {

        }
    }

    public void unLock() {
        Thread current = Thread.currentThread();
        if (current == owner.get()) {
            if (count != 0) {
                count--;
                return;
            }
            owner.compareAndSet(current, null);
        }
    }
}
