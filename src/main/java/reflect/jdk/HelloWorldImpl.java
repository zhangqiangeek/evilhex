package reflect.jdk;

/**
 * @Author: evilhex
 * @Date: 2018-12-17 19:25
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println(" JDK Proxy! ");
    }
}
