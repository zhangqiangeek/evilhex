package concurrent.fundation.datapool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

/**
 * 功能：数据库驱动
 *
 * @author evilhex.
 * @date 2018/5/14 下午3:30.
 */
public class ConnectionDriver {
    static class ConnectionHandler implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            if (method.getName().equals("commit")) {
                TimeUnit.MICROSECONDS.sleep(100);
            }
            return null;
        }
    }

    /**
     * 创建一个connection的代理
     */
    public static  final Connection createConnection() {
        return (Connection) Proxy
                .newProxyInstance(ConnectionDriver.class.getClassLoader(), new Class<?>[] { Connection.class }, new ConnectionHandler());
    }
}
