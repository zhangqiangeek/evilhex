/*
package netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.websocketx.*;
import io.netty.util.CharsetUtil;

import java.util.Date;

*/
/**
 * 接收、处理、响应客户端websocket请求的核心业务处理类
 *
 * @author evilhex.
 * @date 2018/9/29 下午4:42.
 *//*

public class MyWebSocketHandler extends SimpleChannelInboundHandler<Object> {

    private WebSocketServerHandshaker handshaker;
    private static String WEB_SOCKET_URL = " ws://localhost:8888/websocket";

    */
/**
     * 服务端处理客户端websocket请求的核心方法
     *
     * @param channelHandlerContext
     * @param msg
     * @throws Exception
     *//*

    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, Object msg) throws Exception {
        //处理客户端向服务器发起http握手请求的业务
        if (msg instanceof FullHttpRequest) {
            handHttpRequest(channelHandlerContext, (FullHttpRequest) msg);
        } else if (msg instanceof WebSocketFrame) {
            //处理WebSocket连接业务
            handWebSocketFrame(channelHandlerContext, (WebSocketFrame) msg);
        }
    }

    */
/**
     * 处理客户端与服务端之间的websocket业务
     *
     * @param ctx
     * @param frame
     *//*

    private void handWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame) {
        //判断是否是关闭websocket的指令
        if (frame instanceof CloseWebSocketFrame) {
            handshaker.close(ctx.channel(), (CloseWebSocketFrame) frame.retain());
        }
        //判断是否是ping消息
        if (frame instanceof PingWebSocketFrame) {
            ctx.channel().write(new PongWebSocketFrame(frame.content().retain()));
            return;
        }
        //判断是否是二进制消息，如果是二进制消息，抛出异常
        if (!(frame instanceof TextWebSocketFrame)) {
            System.out.println("目前不支持二进制消息");
            throw new RuntimeException("[" + this.getClass().getName() + "]不支持消息");
        }
        //返回应答消息
        //获取客户端向服务端发送的消息
        String request = ((TextWebSocketFrame) frame).text();
        System.out.println("服务端收到客户端的消息");
        TextWebSocketFrame tws = new TextWebSocketFrame(new Date().toString() + ctx.channel().id() + "====>>>" + request);

        //服务端向每一个连接上来的客户端群发消息
        NettyConfig.group.writeAndFlush(tws);
    }

    */
/**
     * 处理客户端发起http握手请求的业务
     *
     * @param ctx
     * @param httpRequest
     *//*

    private void handHttpRequest(ChannelHandlerContext ctx, FullHttpRequest httpRequest) {
        if (!httpRequest.getDecoderResult().isSuccess() || !("websocket".equals(httpRequest.headers().get("Upgrade")))) {
            sendHttpResponse(ctx, httpRequest, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
            return;
        }
        WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(WEB_SOCKET_URL, null, false);
        handshaker = wsFactory.newHandshaker(httpRequest);
        if (handshaker == null) {
            WebSocketServerHandshakerFactory.sendUnsupportedWebSocketVersionResponse(ctx.channel());
        } else {
            handshaker.handshake(ctx.channel(), httpRequest);
        }
    }

    */
/**
     * 服务端向客户端响应消息
     *
     * @param ctx
     * @param httpRequest
     * @param httpResponse
     *//*

    private void sendHttpResponse(ChannelHandlerContext ctx, FullHttpRequest httpRequest, DefaultFullHttpResponse httpResponse) {
        if (httpResponse.getStatus().code() == 200) {
            ByteBuf buf = Unpooled.copiedBuffer(httpResponse.getStatus().toString(), CharsetUtil.UTF_8);
            httpResponse.content().writeBytes(buf);
            buf.release();
        }

        //服务端向客户端发送数据
        ChannelFuture f = ctx.channel().writeAndFlush(httpResponse);
        if (httpResponse.getStatus().code() != 200) {
            f.addListener(ChannelFutureListener.CLOSE);
        }
    }

    */
/**
     * 客户端与服务端创建连接的时候调用
     *
     * @param ctx
     * @throws Exception
     *//*

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        NettyConfig.group.add(ctx.channel());
        System.out.println("*******客户端与服务端连接开启*******");
    }

    */
/**
     * 客户端与服务端断开连接的时候调用
     *
     * @param ctx
     * @throws Exception
     *//*

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        NettyConfig.group.remove(ctx.channel());
        System.out.println("*******客户端与服务端连接关闭*******");
    }

    */
/**
     * 服务端接收客户端发过来的数据结束之后调用
     *
     * @param ctx
     * @throws Exception
     *//*

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    */
/**
     * 工程出现异常的时候调用
     *
     * @param ctx
     * @param cause
     * @throws Exception
     *//*

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
*/
