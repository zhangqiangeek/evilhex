package algorithm.leetcode;

/**
 * 回文数字问题
 *
 * @Author: evilhex
 * @Date: 2019-04-15 18:19
 */
public class isPalindrome {
    public boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0) {
            return false;
        }
        int result = 0;
        while (temp > 0) {
            result = result * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println("temp:" + x);
        System.out.println("result:" + result);
        if (x == result) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrome isPalindrome = new isPalindrome();
        System.out.println(isPalindrome.isPalindrome(121));
    }
}
