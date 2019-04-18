package algorithm.swordoffer.bak;

import java.util.LinkedList;

/**
 * @Author: evilhex
 * @Date: 2018-12-17 16:52
 */
public class FindFirstCommonNode {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        LinkedList<ListNode> listNodes1 = new LinkedList<>();
        LinkedList<ListNode> listNodes2 = new LinkedList<>();
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        ListNode result = null;
        while (l1 != null) {
            listNodes1.addFirst(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            listNodes2.addFirst(l2);
            l2 = l2.next;
        }

        while (!listNodes1.isEmpty() && !listNodes2.isEmpty() && (listNodes1.getLast() == listNodes2.getLast())) {
            result = listNodes1.removeLast();
            listNodes2.removeLast();
        }
        return result;
    }
}
