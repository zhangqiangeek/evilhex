import java.util.concurrent.ConcurrentHashMap;

/**
 * @author evilhex.
 * @date 2018/10/31 上午11:48.
 */
public class MoreTest {

    static int i = 1;
    private static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(16);

    public static void main(String[] args) {

        /*ScheduledThreadPoolExecutor service = new ScheduledThreadPoolExecutor(1);
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                System.out.println("定时执行" + i + "次");
                i++;
            }
        }, 1, 2, TimeUnit.SECONDS);*/


        /*ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println(threadInfo.getThreadId() + "-" + threadInfo.getThreadName());
        }*/
        System.out.println(get());;
    }
    public static int get(){
        int temp=100;
        try {
            throw  new Exception();
        }catch (Exception e){
            return ++temp;
        }finally {
            temp=999;
        }
    }

}
