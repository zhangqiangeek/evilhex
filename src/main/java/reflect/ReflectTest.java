package reflect;

import java.lang.reflect.Field;

/**
 * 反射测试,访问私有变量
 *
 * @Author: evilhex
 * @Date: 2019-04-04 19:01
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        PrivateTest pt = new PrivateTest();
        Class<?> clazz = PrivateTest.class;

        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(pt, "world");
        System.out.println(pt.getName());
    }
}
