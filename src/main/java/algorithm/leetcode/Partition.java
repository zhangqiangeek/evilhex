package algorithm.leetcode;

import java.util.Arrays;

/**
 * 86 Partition List
 * Example:
 * <p>
 * Input: head = 1->4->3->2->5->2, x = 3
 * Output: 1->2->2->4->3->5
 *
 * @Author: evilhex
 * @Date: 2019-05-24 18:44
 */
public class Partition {
    public ListNode partition(ListNode head, int x) {

        return null;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(String.valueOf(c1).equals(String.valueOf(c2)));
    }
}
