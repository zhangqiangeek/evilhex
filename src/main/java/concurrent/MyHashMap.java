package concurrent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * jdk7中hashmap的实现
 *
 * @Author: evilhex
 * @Date: 2019-04-25 10:46
 */
public class MyHashMap<K, V> {

    /**
     * 模拟jdk7中hashmap的插入操作
     *
     * @param key   键
     * @param value 值
     * @return
     */
    public V put(K key, V value) {
        int hash = hash(key);
        return null;
    }

    /**
     * 根据key计算hash码
     *
     * @param key 键
     * @return
     */
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
