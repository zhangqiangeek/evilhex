package jvm.geyiming;

import java.nio.ByteBuffer;

/**
 * 直接内存溢出
 *
 * @Author: evilhex
 * @Date: 2019-03-28 18:18
 */
public class DirectBufferOOM {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            ByteBuffer.allocateDirect(1024 * 1024);
            System.out.println(i);
        }
    }
}
