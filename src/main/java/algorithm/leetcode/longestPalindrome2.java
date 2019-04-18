package algorithm.leetcode;

/**
 * 最长回文子序列 中心扩展算法
 *
 * @Author: evilhex
 * @Date: 2019-04-11 09:50
 */
public class longestPalindrome2 {

    public String longestPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return s;
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        longestPalindrome2 longestPalindrome2 = new longestPalindrome2();
        longestPalindrome2.longestPalindrome("abba");
    }
}
