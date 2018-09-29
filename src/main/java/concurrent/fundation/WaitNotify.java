package concurrent.fundation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * java 等待通知机制：
 * 1、首先， wait线程首先获取到锁，调用wait方法后，交出锁并被移到等待队列中；
 * 2、随后，notify线程获取到锁，调用notify方法后，把wait线程从等待队列移动到阻塞队列中；
 * 3、notify线程释放锁，wait线程获取锁，继续执行。
 *
 * @author evilhex.
 * @date 2018/5/15 上午10:53.
 */
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread waitThread = new Thread(new Wait(), "WaitThread");
        waitThread.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread notifyThread = new Thread(new Notify(), "NotifyThread");
        notifyThread.start();
    }

    /**
     * wait线程
     */
    static class Wait implements Runnable {
        @Override
        public void run() {
            //加锁拥有lock的monitor
            synchronized (lock) {
                while (flag) {
                    System.out.println(Thread.currentThread() + " flag is true. wait@ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //条件满足，完成工作
                System.out.println(Thread.currentThread() + " flag is false. wait@ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }
    }

    /**
     * notify线程
     */
    static class Notify implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread() + " hold lock. notify@ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag = false;
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (lock) {
                System.out.println(Thread.currentThread() + " hold lock. again@ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
