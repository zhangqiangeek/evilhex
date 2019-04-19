package netty.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: evilhex
 * @Date: 2019-04-19 11:01
 */
public class NioTest4 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("/letv/in.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("/letv/out.txt");

        FileChannel inputChannel = fileInputStream.getChannel();
        FileChannel outputChannel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(2);

        while (true) {
            // 如果被注释掉
            byteBuffer.clear();
            int read = inputChannel.read(byteBuffer);
            System.out.println("read:" + read);
            if (-1 == read) {
                break;
            }
            byteBuffer.flip();
            outputChannel.write(byteBuffer);
        }
        inputChannel.close();
        outputChannel.close();
    }
}
