package concurrent.geyiming.disruptor;

import com.lmax.disruptor.WorkHandler;

/**
 * @Author: evilhex
 * @Date: 2019-04-14 14:08
 */
public class Consumer implements WorkHandler<PCData> {
    @Override
    public void onEvent(PCData pcData) throws Exception {
        System.out.println(Thread.currentThread().getId() + ":Event:--" + pcData.getValue() * pcData.getValue() + "--");


    }
}
