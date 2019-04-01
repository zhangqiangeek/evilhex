package jvm.geyiming;

import java.util.Vector;

/**
 * @Author: evilhex
 * @Date: 2019-03-26 17:08
 */
public class DumpOOM {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 25; i++) {
            v.add(new byte[1 * 1024 * 1024]);
        }
    }
}
