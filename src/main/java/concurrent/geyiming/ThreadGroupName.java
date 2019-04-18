package concurrent.geyiming;

/**
 * 线程组
 *
 * @Author: evilhex
 * @Date: 2019-04-11 15:38
 */
public class ThreadGroupName implements Runnable {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("PrintGroup");
        Thread t1 = new Thread(threadGroup, new ThreadGroupName(), "T1");
        Thread t2 = new Thread(threadGroup, new ThreadGroupName(), "T2");
        t1.start();
        t2.start();

        System.out.println(threadGroup.activeCount());
        threadGroup.list();
    }

    @Override
    public void run() {
        String groupAndName = Thread.currentThread().getThreadGroup().getName() + "_" + Thread.currentThread().getName();

        System.out.println("I am " + groupAndName);

    }

}
