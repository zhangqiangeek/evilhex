package jvm.geyiming;

import java.lang.ref.SoftReference;

/**
 * 软引用在系统堆内存不足时被回收,
 *
 * @Author: evilhex
 * @Date: 2019-03-27 13:49
 */
public class SoftRef {
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
        User user = new User(1, "zhangqian");
        SoftReference<User> userSoftReference = new SoftReference<>(user);
        user = null;


        System.out.println(userSoftReference.get());
        System.gc();
        System.out.println("After GC: ");

        System.out.println(userSoftReference.get());
        byte[] b = new byte[1024 * 925 * 7];
        System.gc();
        System.out.println(userSoftReference.get());

    }
}
