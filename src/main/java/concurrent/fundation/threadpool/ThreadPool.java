package concurrent.fundation.threadpool;

/**
 * 线程池接口类
 *
 * @author evilhex.
 * @date 2018/5/14 下午5:27.
 */
public interface ThreadPool<Job extends Runnable> {
    void execute(Job job);

    void shutdown();

    void addWorkers(int num);

    void removeWorkers(int num);

    int getJobSize();
}
