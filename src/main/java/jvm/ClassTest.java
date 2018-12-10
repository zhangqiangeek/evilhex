package jvm;

import java.lang.reflect.Field;

/**
 * 码出高效：P117
 *
 * @Author: evilhex
 * @Date: 2018-12-08 20:50
 */
public class ClassTest {
    private static int[] array = new int[3];
    private static int length = array.length;

    private static Class<One> one = One.class;
    private static Class<Another> another = Another.class;

    public static void main(String[] args) throws Exception {
        One oneObject = one.newInstance();
        oneObject.call();

        Another anotherObject = another.newInstance();
        anotherObject.speek();

        Field privateFieldInOne = one.getDeclaredField("inner");

        privateFieldInOne.setAccessible(true);
        privateFieldInOne.set(oneObject, "world changed.");
        System.out.println(oneObject.getInner());
    }
}

class One {
    private String inner = "time files.";

    public void call() {
        System.out.println("hello world.");
    }

    public String getInner() {
        return inner;
    }
}

class Another {
    public void speek() {
        System.out.println("easy coding.");
    }
}
