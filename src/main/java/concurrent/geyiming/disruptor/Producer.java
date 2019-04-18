package concurrent.geyiming.disruptor;

import com.lmax.disruptor.RingBuffer;

import java.nio.ByteBuffer;

/**
 * 生产者
 *
 * @Author: evilhex
 * @Date: 2019-04-14 14:14
 */
public class Producer {

    private final RingBuffer<PCData> ringBuffer;

    public Producer(RingBuffer<PCData> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    /**
     * 把生产者的数据推入缓冲区
     */
    public void pushData(ByteBuffer byteBuffer) {
        long sequence = ringBuffer.next();
        PCData event = ringBuffer.get(sequence);
        event.setValue(byteBuffer.getLong(0));
        ringBuffer.publish(sequence);
    }
}
