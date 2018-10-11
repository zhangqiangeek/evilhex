package proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试类
 *
 * @author evilhex.
 * @date 2018/10/11 下午3:29.
 */
public class PersonTest {

    public static void test() {
        PersonDao dao = new PersonDaoImpl();
        ProxyClient proxyClient = new ProxyClient(dao);
        PersonDao proxy = (PersonDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), proxyClient);
        proxy.say();
    }

    public static void main(String[] args) {
        //test();
        String path=PersonTest.class.getResource("").getPath();
        System.out.println(path);
    }
}
