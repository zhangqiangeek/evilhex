package concurrent;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * 独占锁的实现
 *
 * @author evilhex
 *         2018/3/6.
 */
public class MutesImpl implements Mutex {
    private Sync sync = new Sync();

    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void release() {
        sync.release(1);
    }

    /**
     * 独占式同步组件的实现
     */
    private static class Sync extends AbstractQueuedSynchronizer {
        @Override
        protected boolean tryAcquire(int arg) {

            return compareAndSetState(0, 1);
        }

        @Override
        protected boolean tryRelease(int arg) {

            return compareAndSetState(1, 0);
        }
    }
}
