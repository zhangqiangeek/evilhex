package algorithm.leetcode;

import java.util.HashSet;

/**
 * leetcode3: 最长不重复子串，正确解法
 *
 * @Author: evilhex
 * @Date: 2019-01-04 10:52
 */
public class lengthOfLongestSubstring2 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> subList = new HashSet<>();

        int head = 0, tail = 0, max = 0;
        while (head < s.length()) {
            if (!subList.contains(s.charAt(head))) {
                subList.add(s.charAt(head++));
                max = Math.max(max, subList.size());
            } else {
                subList.remove(s.charAt(tail++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}


