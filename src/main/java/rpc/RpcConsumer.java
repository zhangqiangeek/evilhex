package rpc;

/**
 * @Author: evilhex
 * @Date: 2018-12-10 15:19
 */
public class RpcConsumer {

    public static void main(String[] args) throws Exception {
        HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
        String hello = service.hello("world");
        System.out.println(hello);
    }
}
