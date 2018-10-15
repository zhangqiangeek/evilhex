package nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 一个使用NIO buffer的小例子
 *
 * @author evilhex.
 * @date 2018/10/12 上午10:44.
 */
public class BufferUse {

    public static void main(String[] args) throws Exception {

        RandomAccessFile accessFile = new RandomAccessFile("/data/nio-data", "rw");
        FileChannel channel = accessFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);
        //从channel写入到buffer
        int bytesRead = channel.read(buf);
        while (bytesRead != -1) {
            //flip方法将Buffer从写模式切换到读模式，将position设回0，并将limit设置成之前position的值。
            buf.flip();
            while (buf.hasRemaining()) {
                //使用get方法从buffer中读取数据
                System.out.println((char) buf.get());
            }
            buf.clear();
            bytesRead = channel.read(buf);
        }
    }

}
