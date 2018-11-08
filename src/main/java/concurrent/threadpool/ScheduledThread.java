package concurrent.threadpool;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 定时线程池执行
 * JUNIT中执行，需要使用countdownlatch来控制线程的退出时机
 *
 * @author evilhex.
 * @date 2018/10/31 下午7:03.
 */
public class ScheduledThread {

    static int i = 1;

    public static void main(String[] args) {

        ScheduledThreadPoolExecutor service = new ScheduledThreadPoolExecutor(1);
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                System.out.println("定时执行" + i + "次");
                i++;
            }
        }, 1, 2, TimeUnit.SECONDS);
    }
}
