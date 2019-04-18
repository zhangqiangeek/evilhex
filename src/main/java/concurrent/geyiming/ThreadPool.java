package concurrent.geyiming;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池的使用
 *
 * @Author: evilhex
 * @Date: 2019-04-11 19:25
 */
public class ThreadPool {

    public static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis() + "Thread id：" + Thread.currentThread().getId());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {


        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer>(1024, new myCompare<Integer>());

        ThreadFactory name = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();

        ExecutorService service = new ThreadPoolExecutor(
                5,
                5,
                0L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(1024),
                name,
                new ThreadPoolExecutor.AbortPolicy());

        MyTask task = new MyTask();
        for (int i = 0; i < 10; i++) {
            service.submit(task);
        }
    }

    private static class myCompare<T> implements Comparator<T> {
        @Override
        public int compare(T o1, T o2) {
            return o1 == o2 ? 0 : -1;
        }
    }
}
