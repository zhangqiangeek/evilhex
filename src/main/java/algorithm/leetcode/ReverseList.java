package algorithm.leetcode;

/**
 * 反转链表
 *
 * @Author: evilhex
 * @Date: 2019-05-13 07:01
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
