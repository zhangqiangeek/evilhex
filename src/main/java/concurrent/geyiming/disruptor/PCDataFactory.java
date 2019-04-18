package concurrent.geyiming.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * 在disruptor系统初始化的过程，构造所有缓冲区中的对象实例。
 *
 * @Author: evilhex
 * @Date: 2019-04-14 14:12
 */
public class PCDataFactory implements EventFactory<PCData> {
    @Override
    public PCData newInstance() {
        return new PCData();
    }
}
