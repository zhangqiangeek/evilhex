package jvm.geyiming;

import java.nio.ByteBuffer;

/**
 * 测试直接内存的速度是否大于堆内存
 *
 * @Author: evilhex
 * @Date: 2019-03-26 17:23
 */
public class AccessDirectBuffer {

    public void directAccess() {
        // 使用直接内存分配
        ByteBuffer b = ByteBuffer.allocateDirect(500);
        dumpTime(b);
    }

    public void bufferAccess() {
        // 使用堆分配
        ByteBuffer b = ByteBuffer.allocate(500);
        dumpTime(b);
    }

    // 打印调用时间
    public void dumpTime(ByteBuffer b) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 99; j++) {
                b.putInt(j);
            }
            b.flip();
            for (int j = 0; j < 99; j++) {
                b.getInt(j);
            }
            b.clear();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static void main(String[] args) {
        AccessDirectBuffer accessDirectBuffer = new AccessDirectBuffer();
        accessDirectBuffer.directAccess();
        accessDirectBuffer.bufferAccess();

        accessDirectBuffer.directAccess();
        accessDirectBuffer.bufferAccess();
    }
}
