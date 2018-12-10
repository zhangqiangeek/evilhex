package rpc;

/**
 * @Author: evilhex
 * @Date: 2018-12-10 15:16
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello" + name;
    }
}
