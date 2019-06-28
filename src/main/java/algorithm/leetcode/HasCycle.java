package algorithm.leetcode;

/**
 * 判断链表是否有环
 *
 * @Author: evilhex
 * @Date: 2019-05-13 07:42
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
