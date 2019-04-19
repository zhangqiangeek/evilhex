package netty.nio;

import java.nio.ByteBuffer;

/**
 * @Author: evilhex
 * @Date: 2019-04-19 11:20
 */
public class Niotest5 {
    public static void main(String[] args) throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(64);

        buffer.putInt(15);
        buffer.putDouble(12.345);
        buffer.putLong(123);
        buffer.putChar('中');

        buffer.flip();
        System.out.println(buffer.getInt());
        System.out.println(buffer.getDouble());
        System.out.println(buffer.getLong());
        System.out.println(buffer.getChar());
    }
}
