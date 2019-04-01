package jvm.geyiming;

import java.util.ArrayList;

/**
 * 堆溢出
 *
 * @Author: evilhex
 * @Date: 2019-03-28 18:14
 */
public class SimpleHeapOOM {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 1024; i++) {
            list.add(new byte[1024 * 1024]);
        }
    }
}
