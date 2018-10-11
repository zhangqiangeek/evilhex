package spi;

import java.util.ServiceLoader;

/**
 * spic测试主类
 *
 * @author evilhex.
 * @date 2018/10/11 下午5:08.
 */
public class SpiMain {
    public static void main(String[] args) {
        ServiceLoader<SpiInterface> loaders = ServiceLoader.load(SpiInterface.class);
        for (SpiInterface spi : loaders) {
            spi.doSomething();
        }
    }
}
