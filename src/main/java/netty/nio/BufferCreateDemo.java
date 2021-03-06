package netty.nio;

import java.nio.ByteBuffer;

import static netty.nio.BufferPut.print;

/**
 * NIO 中的buffer的使用
 *
 * @author evilhex.
 * @date 2018/10/16 下午3:16.
 */
public class BufferCreateDemo {
    public static void main(String[] args) {
        //方式一:通过allocate直接分配
        ByteBuffer allocate = ByteBuffer.allocate(10);

        //方式2：通过wrap根据一个已有的数组创建
        byte[] bytes = new byte[10];
        ByteBuffer wrap = ByteBuffer.wrap(bytes);

        //方式3：通过wrap根据一个已有的数组指定区间创建
        ByteBuffer wrapoffset = ByteBuffer.wrap(bytes, 2, 5);

        print(allocate, wrap, wrapoffset);
    }

}
