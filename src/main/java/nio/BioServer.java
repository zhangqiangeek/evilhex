package nio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * 未使用netty的阻塞网络编程
 *
 * @author evilhex.
 * @date 2018/10/9 上午11:08.
 */
public class BioServer {
    public void serve(int port) throws IOException {
        final ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            final Socket clientSocket = serverSocket.accept();
            System.out.println("Accept connection from " + clientSocket);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        OutputStream outputStream;
                        outputStream = clientSocket.getOutputStream();
                        outputStream.write("Hi".getBytes(Charset.forName("UTF-8")));
                        outputStream.flush();
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                    }
                }
            }).start();
        }
    }
}
