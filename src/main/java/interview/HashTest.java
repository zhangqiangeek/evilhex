package interview;

import java.util.HashMap;

/**
 * @Author: evilhex
 * @Date: 2018-12-28 20:10
 */
public class HashTest {
    static HashMap<People, String> hashMap = new HashMap<>(10000);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            hashMap.put(new People(i).setAddress("zhangqian"), String.valueOf(i));
        }
        String s=hashMap.get(new People(100));
        System.out.println(s);
    }
}
