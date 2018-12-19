package reflect.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: evilhex
 * @Date: 2018-12-17 19:25
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method :" + method.getName() + " is invoked!");
        System.out.println("********方法执行前********");
        Object result = method.invoke(target, args);
        System.out.println("********方法执行后********");
        return result;
    }
}
