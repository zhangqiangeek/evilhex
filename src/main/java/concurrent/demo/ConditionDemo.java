package concurrent.demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition的作用是替代Object的监视器方法监视器方法（wait、notify 和 notifyAll），其主要是与Lock配合使用。
 *
 * @author evilhex.
 * @date 2018/10/19 上午11:07.
 */
public class ConditionDemo {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        lock.lock();
        condition.await();
        condition.signal();
        condition.signalAll();
        lock.unlock();
    }

}
