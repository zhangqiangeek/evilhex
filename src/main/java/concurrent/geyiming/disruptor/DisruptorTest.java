package concurrent.geyiming.disruptor;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 生产者 消费者演示
 * 1、Disruptor的性能要比BlockingQueue至少高一个数量级；
 *
 * @Author: evilhex
 * @Date: 2019-04-14 14:20
 */
public class DisruptorTest {
    public static void main(String[] args) throws Exception {
        Executor executor = Executors.newCachedThreadPool();
        PCDataFactory dataFactory = new PCDataFactory();
        int bufferSize = 1024;
        Disruptor<PCData> disruptor = new Disruptor<PCData>(
                dataFactory,
                // 设置缓冲区的大小
                bufferSize,
                executor,
                ProducerType.MULTI,
                // 新数据产生时，消费者感知新数据产生的策略
                // BlockingWaitStrategy: 默认的策略，使用锁和condition进行数据的监控和线程的唤醒
                // SleepingWairStrategy: 循环中不断等待数据，先进行自旋，如果不成功，使用Thread.yield让出CPU。
                new BlockingWaitStrategy());

        disruptor.handleEventsWithWorkerPool(
                new Consumer(),
                new Consumer(),
                new Consumer(),
                new Consumer()
        );

        disruptor.start();

        RingBuffer<PCData> ringBuffer = disruptor.getRingBuffer();
        Producer producer = new Producer(ringBuffer);
        ByteBuffer bb = ByteBuffer.allocate(8);
        for (long l = 0; true; l++) {
            bb.putLong(0, l);
            producer.pushData(bb);
            Thread.sleep(100);
            System.out.println("add data " + l);
        }
    }
}
