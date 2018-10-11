package nio;

import java.nio.ByteBuffer;

/**
 * @author evilhex.
 * @date 2018/10/8 下午5:03.
 */
public class NioClient {
    public static void main(String[] args) {
        ByteBuffer buffer=ByteBuffer.allocate(10);
        System.out.println(buffer);
    }
}
