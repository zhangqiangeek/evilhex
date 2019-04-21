package netty.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Nio server
 *
 * @Author: evilhex
 * @Date: 2019-04-19 16:02
 */
public class NioServer {
    private static Map<String, SocketChannel> clientMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 配置成非阻塞的
        serverSocketChannel.configureBlocking(false);
        // 获取服务器端socket对象
        ServerSocket serverSocket = serverSocketChannel.socket();
        // 绑定端口
        serverSocket.bind(new InetSocketAddress(8899));

        Selector selector = Selector.open();
        // 注册到选择器上
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            // 针对不同的事件进行处理
            selectionKeys.forEach(selectionKey -> {
                final SocketChannel client;
                try {
                    if (selectionKey.isAcceptable()) {
                        ServerSocketChannel serverSocketChannel1 = (ServerSocketChannel) selectionKey.channel();
                        client = serverSocketChannel1.accept();
                        client.configureBlocking(false);
                        client.register(selector, SelectionKey.OP_READ);
                        String key = "[" + UUID.randomUUID().toString() + "]";
                        clientMap.put(key, client);
                    } else if (selectionKey.isReadable()) {
                        client = (SocketChannel) selectionKey.channel();
                        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                        int count = client.read(readBuffer);
                        String receiveMessage = null;
                        if (count > 0) {
                            Charset charset = Charset.forName("utf-8");
                            receiveMessage = String.valueOf(charset.decode(readBuffer).array());
                            System.out.println(client + ":" + receiveMessage);
                        }

                        String sendKey = null;
                        for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()) {
                            if (client == entry.getValue()) {
                                sendKey = entry.getKey();
                                break;
                            }
                        }
                        for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()) {
                            SocketChannel value = entry.getValue();
                            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
                            writeBuffer.put((sendKey + ":" + receiveMessage).getBytes());
                            value.write(writeBuffer);
                        }
                    }
                    selectionKeys.clear();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });


        }
    }
}
