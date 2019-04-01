package jvm.geyiming;

import java.lang.ref.WeakReference;

/**
 * 弱引用，在系统GC时，只要发现弱引用，不管堆内存的使用情况，都会将对象进行回收。
 *
 * @Author: evilhex
 * @Date: 2019-03-27 14:03
 */
public class WeakRef {
    public static class User {
        public int id;
        public String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "[id=" + String.valueOf(id) + ",value=" + name + "]";
        }
    }

    public static void main(String[] args) {
        User user = new User(1, "zhangqqian");
        WeakReference<User> userWeakReference = new WeakReference<>(user);
        user = null;
        System.out.println(userWeakReference.get());
        System.gc();
        System.out.println("After GC:");
        System.out.println(userWeakReference.get());
    }
}
