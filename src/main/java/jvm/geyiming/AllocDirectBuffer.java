package jvm.geyiming;

import java.nio.ByteBuffer;

/**
 * 直接内存的分配时间耗时
 * 结论：直接内存适合分配次数少、访问较频繁的场合。
 *
 * @Author: evilhex
 * @Date: 2019-03-26 17:32
 */
public class AllocDirectBuffer {
    public void directAllocate() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            ByteBuffer b = ByteBuffer.allocateDirect(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public void bufferAllocate() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            ByteBuffer b = ByteBuffer.allocate(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static void main(String[] args) {
        AllocDirectBuffer allocDirectBuffer = new AllocDirectBuffer();
        allocDirectBuffer.directAllocate();
        allocDirectBuffer.bufferAllocate();

        allocDirectBuffer.directAllocate();
        allocDirectBuffer.bufferAllocate();
    }
}
