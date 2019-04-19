package netty.nio;

import java.nio.ByteBuffer;

/**
 * @Author: evilhex
 * @Date: 2019-04-19 11:25
 */
public class NioTest6 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }
        buffer.position(2);
        buffer.limit(6);
        ByteBuffer byteBuffer = buffer.slice();
        for (int i = 0; i < byteBuffer.capacity(); i++) {
            byte b = byteBuffer.get();
            b *= 2;
            byteBuffer.put(i, b);
        }
        buffer.position(0);
        buffer.limit(buffer.capacity());
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
