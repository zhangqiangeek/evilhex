package concurrent.demo;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Unsafe类的使用
 *
 * @author evilhex.
 * @date 2018/10/17 上午11:29.
 */
public class UnsafeDemo {

    private int i = 0;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        //获取Unsafe实例
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);

        //获取字段i在内存中偏移量
        Unsafe unsafe = (Unsafe) f.get(null);
        long offset = unsafe.objectFieldOffset(UnsafeDemo.class.getDeclaredField("i"));

        //创建对象实例，设置字段的值
        UnsafeDemo unsafeDemo = new UnsafeDemo();
        unsafe.putInt(unsafeDemo, offset, 100);

        System.out.println(unsafeDemo.i);

    }

}
