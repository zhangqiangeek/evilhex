import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author evilhex.
 * @date 2018/10/31 上午11:48.
 */
public class MoreTest {

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
