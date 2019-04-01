package interview.foundtion;

/**
 * @Author: evilhex
 * @Date: 2019-04-01 17:37
 */
public class StringTest {
    public static void main(String[] args) {

        String str2 = "he" + new String("llo");
        str2.intern();
        String str1 = "hello";
        System.out.println(str1 == str2);
    }
}
