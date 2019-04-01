package netty.nio.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;

/**
 * 田博客 BIO+线程组的实现方式
 *
 * @Author: evilhex
 * @Date: 2019-02-26 18:46
 */
public class TimeServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(30800);
            System.out.println("TimeServer Started on 38080...");
            while (true) {
                Socket client = server.accept();
                //每次接收到一个新的客户端连接，启动一个新的线程来处理
                new Thread(new TimeServerHandler(client)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class TimeServerHandler implements Runnable {
    private Socket clientProxxy;

    public TimeServerHandler(Socket clientProxxy) {
        this.clientProxxy = clientProxxy;
    }

    @Override
    public void run() {
        BufferedReader reader = null;
        PrintWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(clientProxxy.getInputStream()));
            writer = new PrintWriter(clientProxxy.getOutputStream());
            while (true) {//因为一个client可以发送多次请求，这里的每一次循环，相当于接收处理一次请求
                String request = reader.readLine();
                if (!"GET CURRENT TIME".equals(request)) {
                    writer.println("BAD_REQUEST");
                } else {
                    writer.println(LocalDate.now().toString());
                }
                writer.flush();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
                reader.close();
                clientProxxy.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}