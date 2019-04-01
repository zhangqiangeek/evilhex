package nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * NIO 缓冲区存取
 *
 * @Author: evilhex
 * @Date: 2019-02-27 10:31
 */
public class BufferPut {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        print(buffer);
        byte H = 0x48;
        byte e = 0x65;
        byte l = 0x6C;
        byte o = 0x6F;
        buffer.put(H).put(e).put(l).put(l).put(o);
        buffer.put("hello".getBytes());
        print(buffer);
        buffer.flip();
    }

    static void print(Buffer... buffers) {
        for (Buffer buffer : buffers) {
            System.out.println("capacity=" + buffer.capacity()
                    + ",limit=" + buffer.limit()
                    + ",position=" + buffer.position()
                    + ",hasRemaining:" + buffer.hasArray()
                    + ",remaining=" + buffer.remaining()
                    + ",hasArray=" + buffer.hasArray()
                    + ",isReadOnly=" + buffer.isReadOnly()
                    + ",arrayOffset=" + buffer.arrayOffset());
        }
    }

}
