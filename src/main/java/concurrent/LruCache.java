package concurrent;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap 实现的缓存
 *
 * @Author: evilhex
 * @Date: 2019-04-11 07:44
 */
public class LruCache<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_ENTRIES = 3;

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {

        return size() > MAX_ENTRIES;
    }

    LruCache() {
        super(MAX_ENTRIES, 0.75f, true);
    }

    public static void main(String[] args) {
        LruCache<Integer, String> cache = new LruCache<>();
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        cache.get(1);
        cache.put(4, "d");
        System.out.println(cache.keySet());
    }
}
