package netty.nio;

import java.nio.IntBuffer;
import java.util.Random;

/**
 * NIO 测试类
 *
 * @Author: evilhex
 * @Date: 2019-04-18 18:26
 */
public class NioTest {
    public static void main(String[] args) {
        // 分配大小为10的缓冲区
        IntBuffer intBuffer = IntBuffer.allocate(10);
        for (int i = 0; i < intBuffer.capacity(); i++) {
            int randomNum = new Random().nextInt(20);
            intBuffer.put(randomNum);
        }
        intBuffer.flip();
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
