package concurrent.geyiming;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport 对中断的支持
 *
 * @Author: evilhex
 * @Date: 2019-04-11 19:15
 */
public class LockSupportIntDemo {
    public static Object u = new Object();
    static ChangeObjectThread t1 = new ChangeObjectThread("t1");
    static ChangeObjectThread t2 = new ChangeObjectThread("t2");

    private static class ChangeObjectThread extends Thread {
        public ChangeObjectThread(String name) {
            super.setName(name);
        }

        @Override
        public void run() {
            synchronized (u) {
                System.out.println("in " + getName());
                LockSupport.park();
                if (Thread.interrupted()) {
                    System.out.println(getName() + "被中断了");
                }
            }
            System.out.println(getName() + "执行结束");
        }
    }

    public static void main(String[] args) throws Exception {
        t1.start();
        Thread.sleep(2000);
        t2.start();
        Thread.sleep(2000);
        t1.interrupt();
        LockSupport.unpark(t2);
    }
}
