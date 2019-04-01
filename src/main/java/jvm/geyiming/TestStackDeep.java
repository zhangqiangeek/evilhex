package jvm.geyiming;

/**
 * 测试栈的深度，为什么不打印出来count的值？
 *
 * @Author: evilhex
 * @Date: 2019-03-26 15:26
 */
public class TestStackDeep {

    private static int count = 0;

    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Exception e) {
            System.out.println("deep of calling =" + count);
            e.printStackTrace();
        }
    }
}
