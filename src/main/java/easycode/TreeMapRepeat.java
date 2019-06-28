package easycode;

import java.util.TreeMap;

/**
 * @Author: evilhex
 * @Date: 2019-05-23 15:54
 */
public class TreeMapRepeat {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(new Key(), "value one");
        map.put(new Key(), "value two");
        System.out.println(map.size());
    }
}

class Key implements Comparable<Key> {
    @Override
    public int compareTo(Key o) {
        return -1;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
