package rpc;

/**
 * @Author: evilhex
 * @Date: 2018-12-10 15:17
 */
public class RpcProvider {

    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }

}
