package jvm.geyiming;

/**
 * 深入理解intern https://tech.meituan.com/2014/03/06/in-depth-understanding-string-intern.html
 *
 * @Author: evilhex
 * @Date: 2019-03-29 13:46
 */
public class ConstantPool {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";

        System.out.println(s3 == s4);
    }
}
