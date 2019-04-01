package nio.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * BIO 客户端
 *
 * @Author: evilhex
 * @Date: 2019-02-26 18:15
 */
public class BioClient {
    public static void main(String[] args) throws IOException {
        String ip = "127.0.0.1";
        Integer port = 8989;
        Socket socket = new Socket(ip, port);
        System.out.println("连接到远程主机：" + ip + "的" + port + "端口");
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("Hello from" + socket.getInetAddress());

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        System.out.println("服务器响应：" + dataInputStream.readUTF());
    }
}
