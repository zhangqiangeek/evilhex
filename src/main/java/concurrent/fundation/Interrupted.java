package concurrent.fundation;

import java.util.concurrent.TimeUnit;

/**
 * 线程中断：表示一个运行中的线程是否被其他线程执行了中断操作
 *
 * @author evilhex.
 * @date 2018/10/16 上午11:24.
 */
public class Interrupted {

    public static void main(String[] args) throws Exception {
        Thread sleepThread = new Thread(new SleepRunner(), "SleepThread");
        sleepThread.setDaemon(true);

        Thread busyThread=new Thread(new BusyRunner(),"BusyThread");
        busyThread.setDaemon(true);

        sleepThread.start();
        busyThread.start();

        TimeUnit.SECONDS.sleep(5);

        sleepThread.interrupt();
        busyThread.interrupt();

        System.out.println("SleepThread interrupted: "+sleepThread.isInterrupted());
        System.out.println("BusyThread interrupted：  "+busyThread.isInterrupted());

        Thread.sleep(2);

    }

    static class SleepRunner implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class BusyRunner implements Runnable {
        @Override
        public void run() {
            while (true) {

            }
        }
    }
}
