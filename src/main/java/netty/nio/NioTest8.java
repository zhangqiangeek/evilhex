package netty.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: evilhex
 * @Date: 2019-04-19 12:14
 */
public class NioTest8 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("/letv/in.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("/letv/outa.txt");

        FileChannel inputChannel = fileInputStream.getChannel();
        FileChannel outputChannel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(512);

        while (true) {
            // 如果被注释掉
            byteBuffer.clear();
            int read = inputChannel.read(byteBuffer);
            System.out.println("readdirect:" + read);
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
