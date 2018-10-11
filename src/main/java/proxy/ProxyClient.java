package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的实现
 *
 * @author evilhex.
 * @date 2018/10/11 下午3:15.
 */
public class ProxyClient implements InvocationHandler {
    private Object obj;

    public ProxyClient(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(obj, args);
        System.out.println("after");
        return result;
    }
}
