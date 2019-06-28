package algorithm.leetcode;

/**
 * 143. Reorder List
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * @Author: evilhex
 * @Date: 2019-05-24 13:39
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        //找到中间位置
        ListNode p1 = head;
        ListNode p2 = head;
        //中间位置的前一个
        ListNode preMiddle = null;
        while (p2 != null && p2.next != null) {
            preMiddle = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }

        // 链表反转
        ListNode prev = null;
        ListNode current = p1;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;

        }
        preMiddle.next = null;

        //合并链表
        p1 = head;
        p2 = prev;
        while (p1 != null) {
            ListNode n1 = p1.next;
            ListNode n2 = p2.next;
            p1.next = p2;
            if (n1 == null) {
                break;
            }
            p2.next = n1;
            p1 = n1;
            p2 = n2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;

        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(l1);


    }
}
