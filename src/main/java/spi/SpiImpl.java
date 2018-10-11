package spi;

/**
 * spi实现
 *
 * @author evilhex.
 * @date 2018/10/11 下午4:46.
 */
public class SpiImpl implements SpiInterface {
    @Override
    public void doSomething() {
        System.out.println("******spi.SpiInterface working!******");
    }
}
