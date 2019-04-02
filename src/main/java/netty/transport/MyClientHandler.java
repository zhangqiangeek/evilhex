package netty.transport;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

/**
 * @Author: evilhex
 * @Date: 2019-04-02 16:26
 */
public class MyClientHandler extends SimpleChannelInboundHandler<MyDataInfo.MyMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        int randomInt = new Random(3).nextInt();
        MyDataInfo.MyMessage myMessage = null;
        if (0 == randomInt) {

            myMessage = MyDataInfo.MyMessage
                    .newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.PersonType)
                    .setPerson(MyDataInfo.Person.newBuilder().setName("zhangsan").setAge(20).build())
                    .build();

        } else if (1 == randomInt) {
            myMessage = MyDataInfo.MyMessage
                    .newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.DogType)
                    .setDog(MyDataInfo.Dog.newBuilder().setName("xiaohei").setAge(12).build())
                    .build();
        } else {
            myMessage = MyDataInfo.MyMessage
                    .newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.CatType)
                    .setCat(MyDataInfo.Cat.newBuilder().setName("xiaofei").setCity("beijing").build())
                    .build();
        }
        ctx.channel().writeAndFlush(myMessage);
    }
}
