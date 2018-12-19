package algorithm.swordoffer;

/**
 * 反转单词
 *
 * @Author: evilhex
 * @Date: 2018-12-18 11:40
 */
public class ReverseSentence {
    static public String ReverseSentence(String str) {
        char[] array = str.toCharArray();
        reverse(array, 0, array.length - 1);
        int m = 0, n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (array[i] == ' ' ) {
                n = i - 1;
                reverse(array, m, n);
                m = i + 1;
            }
        }
        reverse(array,m,array.length-1);
        return new String(array);
    }

    // 反转数组
    static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence("hello world!"));
    }
}
