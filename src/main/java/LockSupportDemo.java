import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport是JDK中比较底层的类，用来创建锁和其他同步工具类的基本线程阻塞原语.
 * java锁和同步器框架的核心 AQS: AbstractQueuedSynchronizer，就是通过调用 LockSupport .park()和 LockSupport .unpark()实现线程的阻塞和唤醒 的
 *
 * @author evilhex.
 * @date 2018/10/17 上午11:48.
 */
public class LockSupportDemo {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        LockSupport.unpark(thread);
        LockSupport.park();
        System.out.println("blocked.");

        LocalDate today = LocalDate.now();
        System.out.println("Current Date=" + today);



        String start = "2019-01-01";
        LocalDate date = LocalDate.parse(start);
        System.out.println("测试" + date);

        System.out.println(today.isAfter(date));

        String cur = "2019-01-012019-02-01100053552";
        System.out.println(cur.substring(0, 10));
        System.out.println(cur.substring(10, 20));

        TimeZone zone=TimeZone.getDefault();
        System.out.println(zone);

        System.out.println(System.getProperty("user.timezone"));

        Calendar calendar = Calendar.getInstance();
        //2016-08-15 14:15:20
        calendar.set(2016, 07, 15, 14, 15, 20);
        System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.SHORT, Locale.CHINESE).format(calendar.getTime()));


    }
}
