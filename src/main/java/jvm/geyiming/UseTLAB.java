package jvm.geyiming;

/**
 * TLAB性能测试
 *
 * @Author: evilhex
 * @Date: 2019-03-27 18:30
 */
public class UseTLAB {
    public static void alloc() {
        byte[] b = new byte[2];
        b[0] = 1;
    }

    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e - b);
    }
}
