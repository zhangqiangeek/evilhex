package algorithm.leetcode;

/**
 * leetcode:最长不重复子串，正确解法
 *
 * @Author: evilhex
 * @Date: 2019-01-04 10:52
 */
public class lengthOfLongestSubstring2 {
    public static int lengthOfLongestSubstring(String s) {
        if ((s == null) || s.length() == 0) {
            return 0;
        }
        int maxLeft = 0;
        int maxRight = 0;
        boolean[] substrTable = new boolean[256];

        int left = 0;
        int right = 0;
        substrTable[s.charAt(0)] = true;
        while (right < s.length() - 1) {
            right = right + 1;
            if (substrTable[s.charAt(right)] == true) {
                while (s.charAt(left) != s.charAt(right)) {
                    substrTable[s.charAt(left)] = false;
                    left = left + 1;
                }
                substrTable[s.charAt(left)] = false;
                left = left + 1;
            }
            substrTable[s.charAt(right)] = true;
            if (right - left > maxRight - maxLeft) {
                maxLeft = left;
                maxRight = right;
            }
        }
        return (maxRight - maxLeft + 1);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abad"));
    }
}
