package algorithm.swordoffer.bak;

/**
 * 反转链表,主要是思考的过程
 *
 * @Author: evilhex
 * @Date: 2018-12-10 11:07
 */
public class ReverseList {

    public ListNode ReverseList(ListNode head) {
        ListNode ReversedHead = null;
        ListNode pNode = head;
        ListNode pPre = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null) {
                ReversedHead = pNode;
            }
            pNode.next = pPre;
            pPre = pNode;
            pNode = pNext;

        }
        return ReversedHead;
    }

}
