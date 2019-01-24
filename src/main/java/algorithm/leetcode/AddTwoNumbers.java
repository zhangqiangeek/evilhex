package algorithm.leetcode;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * @Author: evilhex
 * @Date: 2018-12-29 18:30
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            int sum = 0;
            int plus = 0;
            ListNode node = new ListNode(0);
            ListNode result = node;
            while (l1 != null && l2 != null) {
                // 值
                sum = (l1.val + l2.val + plus) % 10;
                // 进位
                plus = (l1.val + l2.val + plus) / 10;

                node.next = new ListNode(sum);
                l1 = l1.next;
                l2 = l2.next;
                node = node.next;
                if (l1 == null && l2 == null) {
                    break;
                }
                if (l1 == null) {
                    l1 = new ListNode(0);
                }
                if (l2 == null) {
                    l2 = new ListNode(0);
                }
            }
            if (plus != 0) {
                node.next = new ListNode(plus);
            }
            return result.next;
        }
    }
}
