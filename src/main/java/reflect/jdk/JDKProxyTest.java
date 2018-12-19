package reflect.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: evilhex
 * @Date: 2018-12-17 19:27
 */
public class JDKProxyTest {

    public static void main(String[] args) throws Exception {
        Class<?> proxyClass = Proxy.getProxyClass(JDKProxyTest.class.getClassLoader(), HelloWorld.class);
        final Constructor<?> cons = proxyClass.getConstructor(InvocationHandler.class);
        final InvocationHandler ih = new MyInvocationHandler(new HelloWorldImpl());
        HelloWorld helloWorld = (HelloWorld) cons.newInstance(ih);
        helloWorld.sayHello();
    }

}
