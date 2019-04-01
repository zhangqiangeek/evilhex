package jvm.geyiming;

import java.util.HashMap;
import java.util.Map;

/**
 * 新生代到老年代需要清除的次数
 *
 * @Author: evilhex
 * @Date: 2019-03-27 18:10
 */
public class MaxTenuringThreshold {
    public static final int _1M = 1024 * 1024;
    public static final int _1K = 1024;

    public static void main(String[] args) {
        Map<Integer, byte[]> map = new HashMap<Integer, byte[]>();
        for (int i = 0; i < 5 * _1K; i++) {
            byte[] b = new byte[_1K];
            map.put(i, b);
        }
        for (int k = 0; k < 17; k++) {
            for (int i = 0; i < 270; i++) {
                byte[] g = new byte[_1M];
            }
        }
    }
}
