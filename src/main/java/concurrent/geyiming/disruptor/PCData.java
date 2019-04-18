package concurrent.geyiming.disruptor;

/**
 * @Author: evilhex
 * @Date: 2019-04-14 14:07
 */
public class PCData {
    private long value;

    public void setValue(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}
