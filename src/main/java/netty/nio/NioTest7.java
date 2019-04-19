package netty.nio;

import java.nio.ByteBuffer;

/**
 * 只读buffer
 *
 * @Author: evilhex
 * @Date: 2019-04-19 11:59
 */
public class NioTest7 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        for (int i = 0; i < byteBuffer.capacity(); i++) {
            byteBuffer.put((byte) i);
        }
        ByteBuffer readOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        readOnlyBuffer.position(0);
    }
}
