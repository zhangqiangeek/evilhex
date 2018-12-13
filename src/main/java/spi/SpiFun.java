package spi;

/**
 * @Author: evilhex
 * @Date: 2018-12-11 15:36
 */
public class SpiFun implements SpiInterface {
    @Override
    public void doSomething() {
        System.out.println("********Have fun with SPI*************");
    }
}
