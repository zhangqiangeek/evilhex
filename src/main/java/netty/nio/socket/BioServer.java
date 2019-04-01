package netty.nio.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * BIO 服务端
 *
 * @Author: evilhex
 * @Date: 2019-02-26 18:15
 */
public class BioServer {
    public static void main(String[] args) throws Exception {
        Integer port = 8989;
        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("等待远程主机连接，端口号为：" + port);
        Socket socket = serverSocket.accept();
        System.out.println("远程主机连接地址：" + serverSocket.getInetAddress());

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        System.out.println(dataInputStream.readUTF());

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("已经连接服务器：" + serverSocket.getInetAddress());
    }
}
